<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%@ page import = "java.sql.*" %>
<% request.setCharacterEncoding("euc-kr"); %>
	
<%
String name = request.getParameter("name");
String addr = request.getParameter("addr");
String tel = request.getParameter("tel");

try{
	String driverName = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/test";

    Class.forName(driverName);
    Connection con = DriverManager.getConnection(dbURL, "root", "dongyang");

   Statement stmt = con.createStatement();

   PreparedStatement pstmt1 = null;
  // 
   String strSQL;
   
	strSQL ="INSERT INTO tblMember(name,addr,tel)";
	strSQL = strSQL + "VALUES (?, ?, ?)";
	pstmt1 = con.prepareStatement(strSQL);

	pstmt1.setString(1, name);
	pstmt1.setString(2, addr);
	pstmt1.setString(3, tel);
	pstmt1.executeUpdate();
//
}catch(SQLException ex){}
%>
성공적으로 저장되었습니다.
<br><br>
<a href="member_out2.jsp">결과확인</a>
</body>
</html>




