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

<FORM>

<TABLE border='1' width=250>
	
<%
String id = request.getParameter("id");

if (id == ""){
%>

<TR>
	<TD align='center' bgcolor='cccccc'>
	<font size='2'>id�� �Է��ϼ���.</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<a href=javascript:close()>[�� ��]</a>
	</TD>
</TR>

<%
} else {
	String driverName = "com.mysql.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3306/test";

	Class.forName(driverName);
	Connection conn = DriverManager.getConnection(dbURL,"root","dongyang");

	Statement stmt = conn.createStatement();
	
	String strSQL = "SELECT id FROM tbllogin2 where id='" + id + "'";
	ResultSet rs = stmt.executeQuery(strSQL);


	if (!rs.next()) {
%>
<TR>
	<TD align='center' bgcolor='cccccc'>
	<fint size='2'>ID : <%=id%> <BR> ����� �� �ִ� ���̵��Դϴ�.</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<a href=javascript:close()>[�� ��]</a>
	</TD>
</TR>
<%
	} else {
%>
<TR>
	<TD align='center' bgcolor='cccccc'>
	<font size='2'>ID : <%=id%> <BR> ����� �� ���� ���̵��Դϴ�.</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<a href=javascript:close()>[�� ��]</a>
	</TD>
</TR>
<%
	}

	rs.close();
	stmt.close();
	conn.close();
}
%>



</body>
</html>