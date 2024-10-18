/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import models.Person;

/**
 *
 * @author a3k35
 */
public class J2_Servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet J2_Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet J2_Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        //username = tên Person
        //password = sđt
                if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
             request.setAttribute("msg", "Tên đăng nhập và mật khẩu không được để trống!");
              request.getRequestDispatcher("/J2_JSP.jsp").forward(request, response);
        return;
        }
        //Khởi tạo ArrayList rỗng
        // Khởi tạo danh sách người dùng (ArrayList<Person>)
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Thu Hoai", 19, "0961110859"));
        listPerson.add(new Person("Phuong Nghi", 19, "0961110859"));
        listPerson.add(new Person("Ngoc Anh", 19, "0961110859"));
        String msg = "Tên đăng nhập hoặc mật khẩu không đúng";
        boolean isLoggedIn = false; 
            // Kiểm tra thông tin đăng nhập từ ArrayList
            for (Person p : listPerson) {
                if (p.getName().equals(username) && p.getPhone().equals(password)) {
                    msg = "Đăng nhập thành công! Xin chào, " + username + ".";
                    isLoggedIn = true;
                    break;
                }
            }
        
    //int a = 2;
    //Gói hàng - đóng gói dữ liệu
    request.setAttribute ("msg", msg);
    if (isLoggedIn) {
            request.setAttribute("list", listPerson); // Chỉ gửi danh sách nếu đăng nhập thành công
        }
        //request.setAttribute("a", a);
        //Xác định nơi cần gửi đến
    request.getRequestDispatcher ("/J2_JSP.jsp").forward(request, response);
        
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
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
     * @return a String containing servlet description
     */
    @Override
public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
