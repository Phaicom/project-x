/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.Cookie;

/**
 *
 * @author Administrator
 */
public class Shop {
    private int Shop_id;
    private int User_id=0;
    private String Shop_name;
    private String email;
    private String tel;
    private String address;
    private String img;
    private String key="";
    //private Contact contact;
    //private User user;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getShop_id() {
        return Shop_id;
    }

    public void setShop_id(int Shop_id) {
        this.Shop_id = Shop_id;
    }

    public String getShop_name() {
        return Shop_name;
    }

    public void setShop_name(String Shop_name) {
        this.Shop_name = Shop_name;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    /*public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public boolean save(){
        int x=0;
        try{
            Connection con = Connect.getConnection();
            String sqlCmd="insert into shop(Shop_Name,Shop_Email,Shop_Tel,Shop_Address,Shop_Img,User_ID,Shop_Key) values(?,?,?,?,?,?,?)";
            PreparedStatement pstm=con.prepareStatement(sqlCmd);
            pstm.setString(1, this.Shop_name);
            pstm.setString(2, this.email);
            pstm.setString(3, this.tel);
            pstm.setString(4,this.address);
            pstm.setString(5, this.img);
            pstm.setInt(6, this.User_id);
            pstm.setString(7, this.key);
            x=pstm.executeUpdate();
            String sql = "Select max(Shop_id) from shop";
            pstm = con.prepareStatement(sql);
            ResultSet rs =  pstm.executeQuery();
            if (rs.next()) {
                int Shop_id = rs.getInt(1);
            }
            genCode.GenNewKey(Shop_id);
            con.close();
        }catch(Exception ex){
            System.out.println("Save Error "+ex);
        }
        return x>0;
    }
  
    public Shop findById(int user_id) {
        Shop s = null;
        try {
            Connection con=Connect.getConnection();
            String sqlCmd="select * from shop where User_ID=?";
            PreparedStatement pstm=con.prepareStatement(sqlCmd);
            pstm.setInt(1, user_id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                s.setShop_id(rs.getInt("Shop_ID"));
                s.setUser_id(rs.getInt("User_ID"));
                s.setShop_name(rs.getString("Shop_Name"));
                s.setEmail(rs.getString("Shop_Email"));
                s.setTel(rs.getString("Shop_Tel"));
                s.setAddress(rs.getString("Shop_Address"));
                s.setImg(rs.getString("Shop_Img"));
                s.setKey("");
            }
            con.close();
        } catch (Exception ex) {
            System.out.println("Shop find by id error: " + ex);
        }
        return s;
    }
    
    public void shopUpdate(int shop_id){
        try{
            Connection con = Connect.getConnection();
            String sqlCmd="update shop set shop_Name=?, shop_Email=?, shop_Tel=?, shop_Address=? where shop_ID=?";
            PreparedStatement pstm= con.prepareStatement(sqlCmd);
            pstm.setString(1, this.Shop_name);
            pstm.setString(2, this.email);
            pstm.setString(3, this.tel);
            pstm.setString(4, this.address);
            pstm.setInt(5, shop_id);
            pstm.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println("Shop Save Error: "+ex);
        }
    }
    
    public static ArrayList<Shop> getAllShop(int user_id){
        ArrayList<Shop> asp = new ArrayList<Shop>();
        Shop s = null;
        try{
            Connection con = Connect.getConnection();
            String sqlCmd= "select * from shop where user_ID=?" ;
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, user_id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                s = new Shop();
                s.setShop_id(rs.getInt("shop_ID"));
                s.setUser_id(rs.getInt("user_ID"));
                s.setShop_name(rs.getString("shop_Name"));
                s.setEmail(rs.getString("shop_Email"));
                s.setTel(rs.getString("shop_Tel"));
                s.setAddress(rs.getString("shop_Address"));
                s.setImg(rs.getString("shop_Img"));
                s.setKey(rs.getString("shop_Key"));
                asp.add(s);
            }
            con.close();
        }catch(Exception ex){
            System.out.println("getAllShop Error "+ex);
        }
        return asp;
    }
}
