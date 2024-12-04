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
String driverName = "com.mysql.jdbc.Driver";
String dbURL = "jdbc:mysql://localhost:3306/test";

Class.forName(driverName);
Connection conn = DriverManager.getConnection(dbURL,"root","dongyang");

String num = request.getParameter("num"); 

PreparedStatement pstmt = null;
ResultSet rs = null;

try {

String strSQL = "SELECT * FROM tblboard WHERE num = ?";
pstmt = conn.prepareStatement(strSQL);
pstmt.setInt(1, Integer.parseInt(num));

rs = pstmt.executeQuery();
rs.next();

String name = rs.getString("name");
String title = rs.getString("title");
String contents = rs.getString("contents").trim();
String writedate = rs.getString("writedate");
int readcount = rs.getInt("readcount");
String filename = rs.getString("filename");
%>

<center><font size='3'><b> �Խ��� </b></font>

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
      		<font size='2'>�ۼ���: <%=writedate %>, ��ȸ��: <%=readcount %></font>
    		</TD>
    	</TR>

    	<TR>
    		<TD align='left'>
      		<font size='2'> �����̸� : <%=filename%></font>
      		</TD>
    	</TR>


<TABLE border='0' cellspacing=3 cellpadding=3 width='600'>
	<TR bgcolor='cccccc'>
		<TD align='center'>
    		<font size='3'><b><%=title %></font>
		</TD>
	</TR>
</TABLE>

<TABLE border='0' cellspacing=5 cellpadding=10 width='600'>
	<TR bgcolor='ededed'>
		<TD align='center'>
		<img src=<%="C:\\Users\\215\\Desktop\\kim\\db5\\WebContent\\img\\" + filename %> width="400" height="400"></TD>
	</TR>		
	<TR>
		<TD><font size='2' color=''><%=contents %></font>
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
			<a href="modify_pass.jsp?num=<%=num %>">[�����ϱ�]</a>
			<a href="delete_pass.jsp?num=<%=num %>">[�����ϱ�]</a>
		</TD>

		<TD align='right'>
			<a href='write.jsp'>[�������]</a>
			<a href='listboard.jsp'>[��Ϻ���]</a>
 		</TD>
	</TR>
</TABLE>

<%
strSQL = "UPDATE tblboard SET readcount=readcount+1 WHERE num = ?";
pstmt = conn.prepareStatement(strSQL);
pstmt.setInt(1, Integer.parseInt(num));
pstmt.executeUpdate();

}catch(SQLException e){
   	out.print("SQL���� " + e.toString());
}catch(Exception ex){
   	out.print("JSP���� " + ex.toString());
}finally{  
}
%>
<FORM Name='Plus' Action='plus_input.jsp' Method='post'>

<TABLE border='0' width='600' cellpadding='2' cellspacing='2'>
<input type='hidden' name='num' value='<%=num %>'>
	<TR>
		<TD width='100' bgcolor='cccccc'>
			<font size='2'><center><b>�ۼ���</b></center></font> 
		</TD>
		<TD>
			<p><input type='text' size='12' name='plus_name' ></p>
		</TD>
	</TR>
	<TR>
		<TD bgcolor='cccccc'>
			<font size='2'><center><b>���ٴ��</b></center></font>
		</TD>
		<TD>
         		<font size='2'>
         		<input type='text' size='62' name='plus_contents' >
         		</font>
      		</TD>
      		<TD>
      			<input Type = 'Submit' Value = '��۵��'>
      		</TD>
	</TR>
</TABLE>

<%
Statement stmt = conn.createStatement();
String strSQL = "SELECT * FROM tblboardplus WHERE id = " + num;
rs = stmt.executeQuery(strSQL); 

while(rs.next()){ 
%>
<TABLE border='0' width='600' cellpadding='2' cellspacing='2'>
	<TR bgcolor='cccccc'>     
		 <TD>
		 <font size=2 color='black'>
		 	<b><%=rs.getString("name")%> :</b>
		 	<%=rs.getString("contents")%> 
		 	(<%=rs.getString("writedate")%>)
		 </font>
		 </TD>          
	</TR> 
</TABLE>   	
<%     
}

rs.close();
stmt.close();
conn.close();
%>

</FORM>
</TABLE>



</body>
</html>