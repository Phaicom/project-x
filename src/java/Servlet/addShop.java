/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Shop;
import com.oreilly.servlet.MultipartRequest;
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
public class addShop extends HttpServlet {

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
            MultipartRequest mr = new MultipartRequest(request, "C:\\Users\\Reawpai\\Documents\\NetBeansProjects\\ProjectX\\web\\images");
            String name = mr.getParameter("nameShop");
            String email = mr.getParameter("email");
            String phone = mr.getParameter("phone");
            String address = mr.getParameter("address");
            String image = mr.getFilesystemName("image");
            int uid = (int) s.getAttribute("us");

            Shop shop = new Shop();
            shop.setShop_name(name);
            shop.setEmail(email);
            shop.setTel(phone);
            shop.setAddress(address);
            shop.setImg(image);
            shop.setUser_id(uid);

            if (shop.save()) {
                //s.setAttribute("shop", shop);
                //s.setAttribute("img", image);
                response.sendRedirect("/ProjectX/addShop.jsp");
            } else {

                response.sendRedirect("/ProjectX/addShop.jsp");
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
