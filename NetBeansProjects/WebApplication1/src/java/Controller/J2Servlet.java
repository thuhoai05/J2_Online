/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import DAO.J2DAO;

/**
 * // * // * @author a3k35 //
 */
public class J2Servlet extends HttpServlet {

//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //
            }
        //
     //<editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        //    /**
        //     * Handles the HTTP <code>GET</code> method.
        //     *
        //     * @param request servlet request
        //     * @param response servlet response
        //     * @throws ServletException if a servlet-specific error occurs
        //     * @throws IOException if an I/O error occurs
        //     */
            @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //nhận thêm tác vụ mà người dùng nhập 
        String hoten = request.getParameter("hoten");
        String sothunhat = request.getParameter("sothunhat");
        String sothuhai = request.getParameter("sothuhai");
        String tacvu = request.getParameter("tacvu");
        String ketqua = "";

        try {           
            int first = Integer.parseInt(sothunhat);
            int second = Integer.parseInt(sothuhai);
            ketqua = J2DAO.calculate(first, second, tacvu);
        } catch (NumberFormatException e) {
            ketqua = "Vui lòng nhập số hợp lệ.";
        }

        // Generate the response
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Kết quả</title></head>");
            out.println("<body>");
            out.println("<h1>Chào "+  hoten + ", tác vụ bạn chọn là: " + tacvu + "</h1>");
            out.println("<h2>Kết quả:<br>"+ ketqua + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
            //nó sẽ đưa tất cả dữ liệu đầu vào hiển thị lên thanh URL 
            //ví dụ, thực hiện chức năng login
            //Username và password
            //tuyệt đối không được viết chức năng login ở method doGet
            //bởi vì username và password ng dùng nhập vào lên thanh URL của trang 
            //web, lộ thông tin người dùng 
            //tìm kiếm đồ dùng gì đó
            //có thể viết code trong method Get
                   }
            //
            //    /**
            //     * Handles the HTTP <code>POST</code> method.
            //     *
            //     * @param request servlet request
            //     * @param response servlet response
            //     * @throws ServletException if a servlet-specific error occurs
            //     * @throws IOException if an I/O error occurs
            //     */
               @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //bảo mật thông tin hơn so với Get    
    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
    @Override
    public String getServletInfo() {
        return "Short description";
     }
 //</editor-fold>
//
}

