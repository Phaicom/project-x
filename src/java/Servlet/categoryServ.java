/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Deal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Master0z
 */
public class categoryServ extends HttpServlet {

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
            throws ServletException, IOException {
        if (request.getSession().getAttribute("chk_session") != "user" || request.getSession().getAttribute("chk_session") != "admin") {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            HttpSession s = request.getSession(true);
            int cat_id = Integer.parseInt(request.getParameter("cat_id"));
            ArrayList<Deal> arl = Deal.getAllDeal(cat_id);
            Date date = new Date(System.currentTimeMillis());
            String cat_name = "";
            switch (cat_id) {
                case 2:
                    cat_name = "Drink";
                    break;
                case 1:
                    cat_name = "Foot";
                    break;
                case 3:
                    cat_name = "Dessert";
                    break;
                default:
                    cat_name = "";
            }
            if (arl != null) {
                s.setAttribute("cat_name", cat_name);
                s.setAttribute("food_array", arl);
                s.setAttribute("curren_date", sdf.format(date));
                response.sendRedirect("/ProjectX/CategoryGen.jsp");
            } else {
                response.sendRedirect("/ProjectX/index.jsp");
            }

        } else {
            response.sendRedirect("/ProjectX/index.jsp");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
