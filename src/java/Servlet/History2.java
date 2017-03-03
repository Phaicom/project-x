/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.history2;

/**
 *
 * @author jao_3_000
 */
public class History2 extends HttpServlet {

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
        String id = "2";//(String) request.getAttribute("us");
        //String mode = request.getParameter("mode");
        String mode = "1";//(String) request.getAttribute("user_status");
        int imode = Integer.parseInt(mode);
        if (imode == 1) {
            int user_ID = Integer.parseInt(id);
            request.setAttribute("message",imode);
            List<history2> historys = history2.history2User(user_ID);
            request.setAttribute("historys",historys);
        } else if (imode == 2) {
            int deal_ID = Integer.parseInt(id);
            List<history2> historys = history2.history2Deal(deal_ID);
            request.setAttribute("historys",historys);
         } else if (imode == 3) {
            int deal_ID = Integer.parseInt(id);
            request.setAttribute("message",imode);
            List<history2> historys = history2.history2All(deal_ID);
            request.setAttribute("historys",historys);
        }else{
            request.setAttribute("message","Error");
        }
        /*
        1-User
        2-Deal
        3-ALL
        */
        //response.sendRedirect("test.jsp");
         getServletContext().getRequestDispatcher("/history.jsp").forward(request, response);
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
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
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
