/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

/**
 *
 * @author jao_3_000
 */
public class genCode {

    private static String code;
    private static Date datenow = new Date();
    private static int User_ID = 128;
    private static int Deal_ID = 1;
    private static Cipher ecipher;
    private static Cipher dcipher;
    private static SecretKey key;

    public static Key GenNewKey(int Shop_ID) throws SQLException {
        try {
            Connection con = Connect.getConnection();
            String sql = "SELECT Shop_Key FROM shop WHERE Shop_ID = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, Shop_ID);
            ResultSet rs = pstm.executeQuery();
            pstm = null;
            if (rs.next()) {
                if (rs.getString(1) != "") {
                    byte[] decodedKey = Base64.getDecoder().decode(rs.getString(1));
                    key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");
                    rs.close();
                } else {
                    rs.close();
                    key = KeyGenerator.getInstance("DES").generateKey();
                    sql = "UPDATE shop SET Shop_key = ? WHERE Shop_ID = ?";
                    pstm = con.prepareStatement(sql);
                    String keystring = Base64.getEncoder().encodeToString(key.getEncoded());
                    pstm.setString(1, keystring);
                    pstm.setInt(2, Shop_ID);
                    pstm.execute();
                }
                con.close();

            }
            return key;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm:" + e.getMessage());
            return null;
        }
    }

    public static String newcode(int deal_ID, int user_ID) throws SQLException {
        try {
            Date deal_Expdate = null;
            int shop_ID = 0;
            int deal_Count = 0;
            int code_ID = 0;
            Connection con = Connect.getConnection();
            String sql = "SELECT shop_ID,deal_Expdate,deal_Count FROM deal WHERE deal_ID = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, deal_ID);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                shop_ID = rs.getInt(1);
                deal_Expdate = rs.getDate(2);
                deal_Count = rs.getInt(3);
            }
            sql = "SELECT * FROM code WHERE deal_ID = ? AND user_ID = ? AND code_Use = 0 ORDER BY deal_ID DESC LIMIT 1 ";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, deal_ID);
            pstm.setInt(2, user_ID);
            rs = pstm.executeQuery();
            if (!rs.next() || rs == null) {
                if (deal_Expdate.compareTo(datenow) < 0) {
                    return "หมดเวลาการใช้สิทธิ์แล้ว";
                } else if (deal_Count != 0) {
                    sql = "INSERT INTO code (deal_ID,user_ID,code_USE,code_Date) VALUES(?,?,0,?)";
                    pstm = con.prepareStatement(sql);
                    pstm.setInt(1, deal_ID);
                    pstm.setInt(2, user_ID);
                    pstm.setDate(3, (java.sql.Date) deal_Expdate);
                    pstm.execute();
                    sql = "SELECT MAX(code_ID) FROM code";
                    pstm = con.prepareStatement(sql);
                    rs = pstm.executeQuery();
                    if (rs.next()) {
                        code_ID = rs.getInt(1);
                    }
                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    String today = formatter.format(deal_Expdate);
                    String str = user_ID + "/" + today + "/" + deal_ID;
                    Key key = GenNewKey(shop_ID);
                    ecipher = Cipher.getInstance("DES");
                    ecipher.init(Cipher.ENCRYPT_MODE, key);
                    byte[] utf8 = str.getBytes("UTF8");
                    byte[] enc = ecipher.doFinal(utf8);
                    enc = BASE64EncoderStream.encode(enc);
                    sql = "UPDATE code SET code_Code = ? WHERE code_ID = ?";
                    pstm = con.prepareStatement(sql);
                    String keystring = Base64.getEncoder().encodeToString(key.getEncoded());
                    pstm.setString(1, new String(enc));
                    pstm.setInt(2, code_ID);
                    pstm.execute();
                    sql = "UPDATE deal SET deal_Count = ? WHERE deal_ID = ?";
                    pstm = con.prepareStatement(sql);
                    int flag = deal_Count-1;
                    pstm.setInt(1,flag);
                    pstm.setInt(2, deal_ID);
                    pstm.execute();
                    
                    sql = "INSERT INTO history (user_ID,deal_ID,action)VALUES(?,?,0)";
                    pstm = con.prepareStatement(sql);
                    pstm.setInt(1,user_ID);
                    pstm.setInt(2,deal_ID);
                    pstm.execute();
                    genQR(code_ID);
                    con.close();
                    return new String(enc);
                } else {
                    return "ใช้สิทธิ์ เต็มจำนวนแล้ว";
                }
            } else {
                return rs.getString("code_Code");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void genQR(int Code_ID) throws SQLException {
        String code = null;
        Connection con = Connect.getConnection();
        String sql = "SELECT code_Code From code WHERE code_ID = " + Code_ID;
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            code = rs.getString(1);
        }
        con.close();
        String myCodeText = "http://localhost/ProjectX/getCode?Code=" + code;
        String filePath = "web/qrcode/" + Code_ID + ".jpg";
        int size = 125;
        String fileType = "jpg";
        File myFile = new File(filePath);
        try {
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(myCodeText, BarcodeFormat.QR_CODE, size, size, hintMap);
            int CrunchifyWidth = byteMatrix.getWidth();
            BufferedImage image = new BufferedImage(CrunchifyWidth, CrunchifyWidth,
                    BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, CrunchifyWidth, CrunchifyWidth);
            graphics.setColor(Color.BLACK);
            for (int i = 0; i < CrunchifyWidth; i++) {
                for (int j = 0; j < CrunchifyWidth; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, fileType, myFile);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String decode(String str) {

        try {
            int deal_ID = 0;
            Connection con = Connect.getConnection();
            String sql = "SELECT deal_ID FROM code WHERE code_Code like '" + str + "'";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                deal_ID = rs.getInt(1);
            }
            int shop_ID = 0;
            sql = "SELECT shop_ID FROM deal WHERE deal_ID = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, deal_ID);
            rs = pstm.executeQuery();
            if (rs.next()) {
                shop_ID = rs.getInt(1);
            }

            Key key;
            dcipher = Cipher.getInstance("DES");
            key = GenNewKey(shop_ID);
            dcipher.init(Cipher.DECRYPT_MODE, key);
            byte[] dec = BASE64DecoderStream.decode(str.getBytes());
            byte[] utf8 = dcipher.doFinal(dec);
            sql = "UPDATE code SET code_Use = 1 WHERE code_Code like '" + str + "'";
            pstm = con.prepareStatement(sql);
            pstm.execute();
            sql = "SELECT user_ID FROM code WHERE code_Code like '"+str+"'";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            int user_ID = 0 ;
            if (rs.next()) {
                user_ID = rs.getInt(1);
            }
            sql = "INSERT INTO history (user_ID,deal_ID,action)VALUES(?,?,1)";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,user_ID);
                    pstm.setInt(2,deal_ID);
                    
                    pstm.execute();
            con.close();
            return new String(utf8, "UTF8");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, SQLException {
        /*DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         String today = formatter.format(datenow);
         System.out.println("Today : " + today);
         Key key = GenNewKey(1);
         System.out.println("Gen Complete");
         String word = User_ID + "/" + today + "/" + Deal_ID;
         String encrypted = newcode(word, GenNewKey(1), 1);
         String decrypted = decode("j6TWPkMZswe33Y75NOB1LxU/MPeFahv1");
         System.out.println("Decrypted: " + decrypted);*/
        //System.out.println(decode("TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1"));
        System.out.println(newcode(1, 3));
        //System.out.println(decode("I4h2BeX4/xAH/F8nxRw6lg=="));
    }
}
