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
request.setCharacterEncoding("euc-kr");   //post�� ������ ��� �ѱ�ó��

String name = request.getParameter("name");
String addr = request.getParameter("addr");
String tel = request.getParameter("tel");
%>
<h2> �л� ���� �Է� ���</h2>

���� : <%= name%><br>
�ּ� : <%= addr%><br>
����ó : <%= tel%><br>
</body>
</html>