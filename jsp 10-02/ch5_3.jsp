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
String name = request.getParameter("name");
String tym=request.getParameter("studentNum");
String mw = request.getParameter("mw");
String country = request.getParameter("country");

if (mw.equalsIgnoreCase("man")){
	mw = "����";
} else {
	mw = "����";
}
%>
<h2> �л� ���� �Է� ���</h2>
���� : <%= name%><br>
�й� : <%= tym%><br>
���� : <%= mw%><br>
</body>
</html>