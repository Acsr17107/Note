<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.sql.*, java.util.*" %>
<% request.setCharacterEncoding("euc-kr"); %>

<%
String num = request.getParameter("num"); 

String driverName = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/test";

    Class.forName(driverName);
    Connection con = DriverManager.getConnection(dbURL, "root", "dongyang");


PreparedStatement pstmt = null;
ResultSet rs = null;

try {

String strSQL = "SELECT * FROM tblMember4 WHERE num = ?";
pstmt = con.prepareStatement(strSQL);
pstmt.setInt(1, Integer.parseInt(num));

rs = pstmt.executeQuery();
rs.next();

String name = rs.getString("name");
String addr = rs.getString("addr");
String tel = rs.getString("tel");
%>

<center><font size='3'><b> ���� ���� </b></font>

<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
	<TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</TABLE>

<TABLE border='0' width='600'>
	<TR>
    		<TD align='left'>
      		<font size='2'> �ۼ��� : <%=name %></font>
    		</TD>
    		
    		<TD align=right>
      		<font size='2'>�ּ�: <%=addr %></font>
    		</TD>
    	</TR>
</TABLE>

<TABLE border='0' cellspacing=3 cellpadding=3 width='600'>
	<TR bgcolor='cccccc'>
		<TD align='center'>
    		<font size='3'><b>��ȭ��ȣ : <%=tel %></font>
		</TD>
	</TR>
</TABLE>


<TABLE border='0' width='600'>
	<TR>
    		<TD align='right'>
		<font size='2'><br><font size='2'></font>
    		</TD>
	</TR>
</TABLE>

<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
  	<TR>
  		<TD><hr size='1' noshade>
  		</TD>
  	</TR>
</TABLE>

<TABLE border='0' width='600'>
	<TR>
		<TD align='left'>
			<a href="member_mody_pass4.jsp?num=<%=num %>">[�����ϱ�]</a>
			<a href="member_del_pass4.jsp?num=<%=num %>">[�����ϱ�]</a>
		</TD>

		<TD align='right'>
			<a href='member4.html'>[����ϱ�]</a>
			<a href='member_out4.jsp'>[��Ϻ���]</a>
 		</TD>
	</TR>
</TABLE>

<%

}catch(SQLException e){
   	out.print("SQL���� " + e.toString());
}catch(Exception ex){
   	out.print("JSP���� " + ex.toString());
}finally{  
	rs.close();
	pstmt.close();
	con.close();
}
%>

</TABLE>
</body>
</html>