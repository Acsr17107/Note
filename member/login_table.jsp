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
		String driverName = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/test";
		String user = "root";
	    String pwd = "dongyang";
		Connection con = null;
		Statement stmt = null ;
	  
		String sql = "create table tbllogin2( ";
		 sql = sql+ "id varchar(20), ";
	     sql = sql+ "name varchar(20), ";
	     sql = sql+ "pass varchar(20), ";
	     sql = sql+ "phone varchar(20), ";
	     sql = sql+ "email varchar(30)) ";
		try{  	
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, user, pwd); 
			stmt= con.createStatement();
			stmt.executeUpdate(sql) ;
			out.print("�����ͺ��̽� ���� ����!");
		}
		catch(Exception e){
			out.print("�����ͺ��̽� ���� ����!"+e);
		}
		finally{
			try{
				if(con != null) con.close();
				if(stmt != null) stmt.close();
			}
			catch(Exception e){ 
	  			out.println( e.getMessage());
			}
		}
		%>



</body>
</html>