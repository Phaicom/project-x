package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jao_3_000
 */
public class history {
int user_ID;
String user_Name;
 int deal_ID;
 String deal_Name;
Timestamp history_date;
String date;
int action;
String saction;
    public history() {

    }
    /*
     1-user
     2-shop
     */

    public String getUser_Name() {
        return user_Name;
    }

    public String getSaction() {
        return saction;
    }

    public void setSaction(String saction) {
        this.saction = saction;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getDeal_Name() {
        return deal_Name;
    }

    public void setDeal_Name(String deal_Name) {
        this.deal_Name = deal_Name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public int getDeal_ID() {
        return deal_ID;
    }

    public void setDeal_ID(int deal_ID) {
        this.deal_ID = deal_ID;
    }

    public Timestamp getHistory_date() {
        return history_date;
    }

    public void setHistory_date(Timestamp history_date) {
        this.history_date = history_date;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }
    static Connection con = Connect.getConnection();
    
    public static String findName(int user_ID) throws SQLException{
    String sql ="SELECT * FROM user WHERE user_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1, user_ID);
         ResultSet rs = pstm.executeQuery();
         if (rs.next()) {
            return rs.getString("user_Name");
        }
         return "";
    }
    public static String findDeal(int deal_ID) throws SQLException{
         
         String sql ="SELECT * FROM deal WHERE deal_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1, deal_ID);
         ResultSet rs = pstm.executeQuery();
         if (rs.next()) {
            return rs.getString("deal_Name");
        }
         return "";
    }
    
    public static String date(Timestamp tmp){
        Date date = new Date(tmp.getTime());
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         String today = formatter.format(date);
        return today;
    }
    public static String checkAction(int action){
        if (action == 1) {
            return "กดรับสิทธิ์";
        }else if(action ==0){
        return "ใช้สิทธิ์";
        }
        return "Error";
    }
    
        public static List<history> historyUser(int user_ID) throws SQLException {
        List<history> list = new ArrayList<history>();
        history his = null;
         String sql ="SELECT * FROM history WHERE user_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1, user_ID);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
             his = new history();
             his.setUser_ID(rs.getInt("user_ID"));
             his.setUser_Name(his.findName(his.user_ID));
             his.setDeal_ID(rs.getInt("deal_ID"));
             his.setDeal_Name(his.findDeal(his.deal_ID));
             his.setAction(rs.getInt("action"));
             his.setHistory_date(rs.getTimestamp("history_date"));
             his.setDate(his.date(his.history_date));
             his.setSaction(his.checkAction(his.action));
             list.add(his);
         }
     
        return list;
    }
        
         public static List<history> historyDeal(int deal_ID) throws SQLException {
        List<history> list = new ArrayList<history>();
        history his = null;
         String sql ="SELECT * FROM history WHERE deal_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1, deal_ID);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
             his = new history();
             his.setUser_ID(rs.getInt("user_ID"));
             his.setUser_Name(his.findName(his.user_ID));
             his.setDeal_ID(rs.getInt("deal_ID"));
             his.setDeal_Name(his.findDeal(his.deal_ID));
             his.setAction(rs.getInt("action"));
             his.setHistory_date(rs.getTimestamp("history_date"));
             his.setDate(his.date(his.history_date));
             his.setSaction(his.checkAction(his.action));
             list.add(his);
         }
     
        return list;
    }
    
            public static List<history> historyAll(int deal_ID) throws SQLException {
        List<history> list = new ArrayList<history>();
        history his = null;
         String sql ="SELECT * FROM history";
         PreparedStatement pstm = con.prepareStatement(sql);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
             his = new history();
             his.setUser_ID(rs.getInt("user_ID"));
             his.setUser_Name(his.findName(his.user_ID));
             his.setDeal_ID(rs.getInt("deal_ID"));
             his.setDeal_Name(his.findDeal(his.deal_ID));
             his.setAction(rs.getInt("action"));
             his.setHistory_date(rs.getTimestamp("history_date"));
             his.setDate(his.date(his.history_date));
             his.setSaction(his.checkAction(his.action));
             list.add(his);
         }
     
        return list;
    }
        public static List<history> historyShop(int deal_ID) throws SQLException {
        List<history> list = new ArrayList<history>();
        history his = null;
         String sql ="SELECT * FROM history WHERE deal_ID = ?";
         PreparedStatement pstm = con.prepareStatement(sql);
         pstm.setInt(1, deal_ID);
         ResultSet rs = pstm.executeQuery();
         while (rs.next()) {
             his = new history();
             his.setUser_ID(rs.getInt("user_ID"));
             his.setUser_Name(his.findName(his.user_ID));
             his.setDeal_ID(rs.getInt("deal_ID"));
             his.setDeal_Name(his.findDeal(his.deal_ID));
             his.setAction(rs.getInt("action"));
             his.setHistory_date(rs.getTimestamp("history_date"));
             his.setDate(his.date(his.history_date));
             his.setSaction(his.checkAction(his.action));
             list.add(his);
         }
     
        return list;
    }
    @Override
    public String toString() {
        return "history{" + "user_ID=" + user_ID + ", user_Name=" + user_Name + ", deal_ID=" + deal_ID + ", deal_Name=" + deal_Name + ", history_date=" + history_date + ", date=" + date + ", action=" + action + ", saction=" + saction + '}';
    }


    
    public static void main(String[] args) throws SQLException {
        List<history> list = historyUser(3);
        for (history lists : list) {
            System.out.println(lists);
        }
    }
    

}
