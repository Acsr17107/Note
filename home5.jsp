<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
%>
결과화면
<p><%= num1 %>+<%= num2 %> =<%= num1 + num2 %></p>
<p><%= num1 %>/<%= num2 %>=<%= (double) num1 / num2 %></p>
</body>
</html>