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

<TABLE border="1">
<TR>
	<TD> 이름 </TD>
	<TD> 주소 </TD>
	<TD> 연락처 </TD>
</TR>
<%
try{
	    String driverName = "com.mysql.jdbc.Driver";
	    String dbURL = "jdbc:mysql://localhost:3306/test";
    	Class.forName(driverName);
    	Connection con = DriverManager.getConnection(dbURL, "root", "dongyang");
	
	
	Statement stmt = con.createStatement();
	
	String strSQL = "SELECT * FROM tblMember";
	ResultSet rs = stmt.executeQuery(strSQL);
	
	while(rs.next()){
%>
<TR>
	<TD><%=rs.getString("name") %></TD>
	<TD><%=rs.getString("addr") %></TD>
	<TD><%=rs.getString("tel") %></TD>
</TR>
<%
	}
	rs.close();
	stmt.close();
	con.close();
}catch(SQLException ex){ }
 %>
</TABLE>
</body>
</html>