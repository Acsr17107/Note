<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("euc-kr"); %>
<h2> ��̿� ������ ���� ���� ���</h2>
<%
String[] h = request.getParameterValues("hobby");
String country = request.getParameter("country");
out.println("���� : "+country+"<br>");
if (country != null) {
		for ( String eachdata : h)
			out.println(eachdata + " ");
}
out.println("<br>");
  %>
</body>
</html>