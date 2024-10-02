<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	String name = request.getParameter("name");
	String color = request.getParameter("color");
%>
</head>
<body bgcolor=<%=color%>>
<%=name%>님이 좋아하는 색
</body>
</html>