/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Master0z
 */
public class User {

    private int User_id;
    private String User_name;
    private String User_lname;
    private String User_Password;
    private String address;
    private String email;
    private String tel;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    private String Img;
    private int status;
    private String student_id;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUser_lname() {
        return User_lname;
    }

    public void setUser_lname(String User_lname) {
        this.User_lname = User_lname;
    }

    public static User findById(String uid) {
        User us = null;
        try {
            Connection con = Connect.getConnection();
            String sqlCmd = "select * from user where Student_ID=?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setString(1, uid);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                us = new User();
                us.setAddress(rs.getString("User_Address"));
                us.setEmail(rs.getString("User_Email"));
                us.setTel(rs.getString("User_Tel"));
                us.setStudent_id(rs.getString("Student_ID"));
                us.setImg(rs.getString("User_Img"));
                us.setUser_Password(rs.getString("User_Password"));
                us.setUser_id(rs.getInt("User_ID"));
                us.setUser_name(rs.getString("User_Name"));
                us.setUser_lname(rs.getString("User_Lname"));
                us.setStatus(rs.getInt("User_Status"));
                //System.out.println("xxx");
            }
        } catch (Exception ex) {
            System.out.println("Find By Id Error: " + ex);
        }
        return us;
    }

    public void userSave() {

        try {
            Connection con = Connect.getConnection();
            String sqlCmd = "update user set User_Name=?, User_Lname=?, User_Email=?, User_Tel=?, User_Address=?, User_Status=?, User_Password=?  where User_ID=?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setString(1, this.User_name);
            pstm.setString(2, this.User_lname);
            pstm.setString(3, this.email);
            pstm.setString(4, this.tel);
            pstm.setString(5, this.address);
            pstm.setInt(6, this.status);
            pstm.setString(7, this.User_Password);
            pstm.setInt(8, this.User_id);
            pstm.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println("User Save Error: " + ex);
        }
    }
}
