<%@ page import ="java.sql.*"%>
<?@ include file="sqlconnect.jsp" %>
<%
    String acctFirst = request.getParameter("acctFirst"); 
    String acctLast = request.getParameter("acctLast");
    String acctEmail = request.getParameter("acctEmail");
    String acctUser = request.getParameter("acctUser");
    String acctPass = request.getParameter("acctPass");
    String acctConfirm = request.getParameter("acctConfirm");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://redroll.com:3306/itresume4u",
            "itresume4u", "illinoisstate");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from members where uname='" + acctUser + "' and pass='" + acctPass + "'");
    if (rs.next()) {
        session.setAttribute("userid", acctUser);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>
