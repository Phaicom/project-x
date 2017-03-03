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
import java.util.Date;

/**
 *
 * @author Master0z
 */
public class Deal {
    private int Deal_ID;
    private String deal_Name;
    private int Category_ID;
    private Category category;
    private int Shop_ID;
    private String deal_Detail;
    private String Deal_Img;
    private int Deal_Count;
    private Date Deal_Expdate;

    public String getDeal_Name() {
        return deal_Name;
    }

    public void setDeal_Name(String deal_Name) {
        this.deal_Name = deal_Name;
    }
    
    public int getDeal_ID() {
        return Deal_ID;
    }

    public void setDeal_ID(int Deal_ID) {
        this.Deal_ID = Deal_ID;
    }

    public int getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(int Category_ID) {
        this.Category_ID = Category_ID;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getShop_ID() {
        return Shop_ID;
    }

    public void setShop_ID(int Shop_ID) {
        this.Shop_ID = Shop_ID;
    }

    public String getDeal_Detail() {
        return deal_Detail;
    }

    public void setDeal_Detail(String deal_Detail) {
        this.deal_Detail = deal_Detail;
    }

    public String getDeal_Img() {
        return Deal_Img;
    }

    public void setDeal_Img(String Deal_Img) {
        this.Deal_Img = Deal_Img;
    }

    public int getDeal_Count() {
        return Deal_Count;
    }

    public void setDeal_Count(int Deal_Count) {
        this.Deal_Count = Deal_Count;
    }

    public Date getDeal_Expdate() {
        return Deal_Expdate;
    }

    public void setDeal_Expdate(Date Deal_Expdate) {
        this.Deal_Expdate = Deal_Expdate;
    }

    public static ArrayList<Deal> getShopDeal(int shop_id){
        ArrayList<Deal> arl = new ArrayList<Deal>();
        Deal deal = null;
        try{
            Connection con = Connect.getConnection();
            String sqlCmd= "select * from deal where Shop_ID=?" ;
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, shop_id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                deal = new Deal();
                deal.setDeal_ID(rs.getInt("Deal_ID"));
                deal.setDeal_Name(rs.getString("deal_Name"));
                deal.setCategory_ID(rs.getInt("Category_ID"));
                deal.setShop_ID(rs.getInt("Shop_ID"));
                deal.setDeal_Detail(rs.getString("deal_Detail"));
                deal.setDeal_Img(rs.getString("Deal_Img"));
                deal.setDeal_Count(rs.getInt("Deal_Count"));
                deal.setDeal_Expdate(rs.getDate("Deal_Expdate"));
                arl.add(deal);
            }
            con.close();
        }catch(Exception ex){
            System.out.println("getShopDeal error: "+ex);
        }
        return arl;
    }
    
    
    public static ArrayList<Deal> getAllDeal(int cat_id){
        ArrayList<Deal> arl = new ArrayList<Deal>();
        Deal deal = null;
        try{
            Connection con = Connect.getConnection();
            String sqlCmd= "select * from deal where Category_ID=?" ;
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, cat_id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                deal = new Deal();
                deal.setDeal_ID(rs.getInt("Deal_ID"));
                deal.setDeal_Name(rs.getString("deal_Name"));
                deal.setCategory_ID(rs.getInt("Category_ID"));
                deal.setShop_ID(rs.getInt("Shop_ID"));
                deal.setDeal_Detail(rs.getString("deal_Detail"));
                deal.setDeal_Img(rs.getString("Deal_Img"));
                deal.setDeal_Count(rs.getInt("Deal_Count"));
                deal.setDeal_Expdate(rs.getDate("Deal_Expdate"));
                arl.add(deal);
            }
            con.close();
        }catch(Exception ex){
            System.out.println("getAllDeal error: "+ex);
        }
        return arl;
    }
    
    public void dealSave(){
        try{
            Connection con = Connect.getConnection();
            String sqlCmd="insert into deal(deal_Name,category_ID,shop_ID,deal_Detail,deal_Img,deal_Count,deal_Expdate) values(?,?,?,?,?,?,?)";
            PreparedStatement pstm=con.prepareStatement(sqlCmd);
            pstm.setString(1, this.deal_Name);
            pstm.setInt(2, this.Category_ID);
            pstm.setInt(3, this.Shop_ID);
            pstm.setString(4, this.deal_Detail);
            pstm.setString(5, this.Deal_Img);
            pstm.setInt(6, this.Deal_Count);
            pstm.setDate(7, (java.sql.Date)(getDeal_Expdate()));
            pstm.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println("Save Error "+ex);
        }
    }
    
    
}
