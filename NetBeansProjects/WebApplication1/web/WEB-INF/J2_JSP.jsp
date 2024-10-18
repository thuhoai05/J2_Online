<%-- 
    Document   : J2_JSP
    Created on : Oct 17, 2024, 9:55:36 AM
    Author     : a3k35
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.Person"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<!--     JSP: Cho phép viết cả code HTML và code Java 
    Scriplets: Cho phép xử lý logic Java ngay lập tức (vòng lặp, if/else)
    Kí hiệu: 
    
    Declarations: Cho phép khai báo biến trong trang JSP 
    Kí hiệu: 
    
    Expressions: Cho phép in thông tin ra màn hình ngay lập tức
    Ký hiệu: 
    
    Directives: Cho phép cấu hình trang JSP
    Ký hiệu: 
    
    Lưu ý: 1 JSP sẽ được gắn với 1 Servlet và 1 Servlet cũng sẽ được gắn với 1 JSP
    html -> Servlet -> in ra màn hình 
    Servlet -> JSP -> Servlet 
    
    Login(JSP) -> tk, mk -> Servlet -> check có đúng hay không -> Login
    Expression Language: Cú pháp của EL\\${}
    
    Biến ngầm định có sẵn trong EL:
    pageScope: chứa các biến được khai báo trong phạm vi trang
    requestScope: chứa các biến được khai báo trong phạm vi yêu cầu
    sessionScope: chứa cấc biến được khai báo trong phạm vi Session
    applicationScope: chứa các biến được khai báo trong phạm vi ứng dụng

    Cookie và Session: đều là 2 cơ chế lưu trữ thông tin của người dùng
    trong ứng dụng web
    -Cookie: là 1 đoạn dữ liệu nhỏ mà máy chủ gửi đến trình duyệt của người dùng
    và được lưu trữ trên máy khách(client)
    -Cookie: nó thường được sử dụng để lưu trữ thông tin làm việc cần thiết cho
    1 phiên làm việc của người dùng 
    -Thời gian sống: có thể thiết lập thời gian sống hoặc cho đến khi cắt trình duyệt
    -Cookie: thường sẽ lưu trữ thông tin đăng nhập, sở thích người dùng, giỏ hàng
    -Lưu ý: cookie thì sẽ dễ bị tấn công, do đó không lưu thông tin nhạy cảm ở cookie
    Session: là 1 đối tượng trên máy chủ mà lưu trữ thông tin về 1 phiên làm việc
    của người dùng
    Lưu ý: không được lưu trữ ở máy khách (client) và bảo mật sẽ cao hơn Cookie 
    EL có 1 điểm yếu -> nếu như không đi cùng JSTL thì các chức năng logic sẽ 
không thực hiện được -> vòng lặp, kiểm tra điều kiên
    -->
    <body>
        <h1>Login Form</h1>
        <form action="J2_Servlet" method ="get">
            Nhập UserName: <input type ="text" name="userName" required>
            Nhập Password: <input type ="text"  name="password" required>
            <input type="submit" value="Login">
        </form>
        <h2>Kết quả đăng nhập</h2>
        <%  
            // Hiển thị thông báo kết quả đăng nhập
            String msg = (String) request.getAttribute("msg");
            if (msg != null) {
                out.println("<p>" + msg + "</p>");
            }
        %>
        <%  
        ArrayList<Person> listPerson = (ArrayList<Person>)request.getAttribute("list");
        if (listPerson != null) {
        out.println("<h2>Danh sách Person</h2>");
            for(Person p: listPerson) {
            out.println("<p>Name: "+p.getName()+"</p>");
            out.println("<p>Age: "+p.getAge()+"</p>");
            out.println("<p>Phone: "+p.getPhone()+"</p>");
            }
            }
        %>
    </body>
</html>
