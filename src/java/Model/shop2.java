/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jao_3_000
 */
public class shop2 {
    int shop_ID;
    int user_ID;
    String shop_Name;
    String shop_Email;
    String shop_Tel;
    String shop_Address;
    String shop_Img;
    String user_Name;

    public int getShop_ID() {
        return shop_ID;
    }

    public void setShop_ID(int shop_ID) {
        this.shop_ID = shop_ID;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getShop_Name() {
        return shop_Name;
    }

    public void setShop_Name(String shop_Name) {
        this.shop_Name = shop_Name;
    }

    public String getShop_Email() {
        return shop_Email;
    }

    public void setShop_Email(String shop_Email) {
        this.shop_Email = shop_Email;
    }

    public String getShop_Tel() {
        return shop_Tel;
    }

    public void setShop_Tel(String shop_Tel) {
        this.shop_Tel = shop_Tel;
    }

    public String getShop_Address() {
        return shop_Address;
    }

    public void setShop_Address(String shop_Address) {
        this.shop_Address = shop_Address;
    }

    public String getShop_Img() {
        return shop_Img;
    }

    public void setShop_Img(String shop_Img) {
        this.shop_Img = shop_Img;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }
    
    public static List<shop2> shopview(int user_ID) throws SQLException{
    List<shop2> list = new ArrayList<shop2>();
        Connection con = Connect.getConnection();
        String sql = "SELECT shop_ID,shop_Name,user_Name,shop_Address,shop_Email,shop_Img,shop_Tel FROM shop INNER JOIN user ON shop.user_ID = user.user_ID WHERE shop.user_ID = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, user_ID);
        ResultSet rs = pstm.executeQuery();
        shop2 sh = null;
        while (rs.next()) {
            sh = new shop2();
            sh.setShop_ID(rs.getInt("shop_ID"));
            sh.setShop_Name(rs.getString("shop_Name"));
            sh.setUser_Name(rs.getString("user_Name"));
            sh.setShop_Address(rs.getString("shop_Address"));
            sh.setShop_Email(rs.getString("shop_Email"));
            sh.setShop_Img(rs.getString("shop_Img"));
            sh.setShop_Tel(rs.getString("shop_Tel"));
            list.add(sh);
        }
        return list;
    }
}
