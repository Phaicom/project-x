/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Reawpai
 */
public class editProfile extends HttpServlet {

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
            HttpSession s = request.getSession(true);
            request.setCharacterEncoding("UTF-8");
            String user_name = request.getParameter("uname");
            String user_lname = request.getParameter("lname");
            String user_email = request.getParameter("uemail");
            String user_tel = request.getParameter("utel");
            String user_address = request.getParameter("uaddress");
            String new_pass = request.getParameter("newpass");
            String re_new_pass = request.getParameter("re_newpass");
            String user_pass = request.getParameter("upass");

            //String database_user_pass = ((User)(s.getAttribute("user"))).getUser_Password();
            User us = (User) s.getAttribute("user");
            if (new_pass.equals(re_new_pass) && new_pass.equals(user_pass)) {
                us.setUser_id((int) (s.getAttribute("us")));
                us.setUser_name(user_name);
                us.setUser_lname(user_lname);
                us.setStatus((int) (s.getAttribute("user_status")));
                us.setUser_Password(new_pass);
                us.setEmail(user_email);
                us.setTel(user_tel);
                us.setAddress(user_address);
            }

            if (new_pass.equals(re_new_pass) && new_pass.equals(user_pass)) {
                //user_pass.equals(database_user_pass)
                us.userSave();
                s.setAttribute("user", us);
                response.sendRedirect("/ProjectX/editProfile.jsp");
            } else if (!new_pass.equals(re_new_pass)) {
                response.sendRedirect("/ProjectX/editProfile.jsp");
            } else {
                s.setAttribute("edit_message", "Can't save!!");
                response.sendRedirect("/ProjectX/editProfile.jsp");
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
