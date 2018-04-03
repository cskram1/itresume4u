<%@ page import ="java.sql.*" %>

<%

String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://redroll.com:3306/itresume4u",
            "itresume4u", "illinoisstate");
    Statement st = con.createStatement();
    ResultSet rs;


%>

