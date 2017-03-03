/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Connect;
import java.io.PrintWriter;

/**
 *
 * @author jao_3_000
 */
@WebServlet(name = "getCode", urlPatterns = {"/getCode"})
public class getCode extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        PrintWriter out = response.getWriter();
        String code = request.getParameter("code");
        String decode = Model.genCode.decode(code);
            //String decode = "1/03/06/2558/1";

        String[] cut = decode.split("/", -1);

        int user_ID = Integer.parseInt(cut[0]);
        out.println(user_ID);
        int deal_ID = Integer.parseInt(cut[4]);

        Map<String, String> user = findUser(user_ID);
        Map<String, String> deal = findDeal(deal_ID);
        request.setAttribute("code", code);
        request.setAttribute("user_Name", user.get("user_Name"));
        request.setAttribute("user_Lname", user.get("user_Lname"));
        request.setAttribute("user_Tel", user.get("user_Tel"));
        request.setAttribute("deal_Name", deal.get("deal_Name"));
        request.setAttribute("date", cut[1]);
        request.setAttribute("month", checkmonth(cut[2]));
        request.setAttribute("year", cut[3]);
        request.setAttribute("shop_Name", deal.get("shop_Name"));
        request.setAttribute("shop_Address", deal.get("shop_Address"));
        request.setAttribute("shop_Tel", deal.get("shop_Tel"));
        request.setAttribute("shop_Email", deal.get("shop_Email"));
        //uDS+IAR/7vjDIuu857uMaA==
        getServletContext().getRequestDispatcher("/outsource/decode.jsp").forward(request, response);

    }

    public static String checkmonth(String str) {
        int month = Integer.parseInt(str);
        String smonth = null;
        switch (month) {
            case 1:
                smonth = "January";
                break;
            case 2:
                smonth = "Febuary";
                break;
            case 3:
                smonth = "March";
                break;
            case 4:
                smonth = "April";
                break;
            case 5:
                smonth = "May";
                break;
            case 6:
                smonth = "June";
                break;
            case 7:
                smonth = "July";
                break;
            case 8:
                smonth = "August";
                break;
            case 9:
                smonth = "September";
                break;
            case 10:
                smonth = "October";
                break;
            case 11:
                smonth = "November";
                break;
            case 12:
                smonth = "December";
                break;
        }
        return smonth;
    }

    public static Map<String, String> findUser(int user_ID) throws SQLException {
        Map<String, String> user = null;
        Connection con = Connect.getConnection();
        String sql = "SELECT user_Name,user_Lname,user_Tel FROM user WHERE user_ID = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, user_ID);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            user = new HashMap<String, String>();
            user.put("user_Name", rs.getString(1));
            user.put("user_Lname", rs.getString(2));
            user.put("user_Tel", rs.getString(3));
        }
        con.close();
        return user;
    }

    public static Map<String, String> findDeal(int deal_ID) throws SQLException {
        Map<String, String> deal = null;
        Connection con = Connect.getConnection();
        String sql = "SELECT deal_Name,shop_ID FROM deal WHERE deal_ID = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, deal_ID);
        ResultSet rs = pstm.executeQuery();
        int id = 0;
        if (rs.next()) {
            deal = new HashMap<String, String>();
            deal.put("deal_Name", rs.getString(1));
            id = rs.getInt(2);
        }
        sql = "SELECT shop_Name,shop_Address,shop_Tel,shop_Email FROM shop WHERE shop_ID = ?";
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, id);
        rs = pstm.executeQuery();
        if (rs.next()) {
            deal.put("shop_Name", rs.getString(1));
            deal.put("shop_Address", rs.getString(2));
            deal.put("shop_Tel", rs.getString(3));
            deal.put("shop_Email", rs.getString(4));
        }
        con.close();
        return deal;

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(getCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(getCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
