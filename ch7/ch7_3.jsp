<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Enumeration" %>
	<h1>���� ����</h1>
	<hr><h2>���� �����</h2>
	<%
		session.setAttribute("id", "javajsp");
		session.setAttribute("pwd", "jdktomcat");
	%>
	<hr><h2>���� ��ȸ</h2>
	���� ID : <%= session.getId() %><br>
	���� �����ð� <% session.setMaxInactiveInterval(5);%>
	���� ����<% session.removeAttribute("id");%>
	
	<%
		Enumeration<String> e = session.getAttributeNames();
		while ( e.hasMoreElements() ) {
			String name = e.nextElement();
			String value = (String) session.getAttribute(name);
			out.println("���� name : " + name + ", ");
			out.println("���� value : " + value + "<br>");
		}
	%>
	<br>���� Invalidate : <% session.invalidate(); %>
</body>
</html>