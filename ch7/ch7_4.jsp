<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>��Ű ����� ����</h1>
<%
	Cookie cookie = new Cookie("uwer", "kang");
	cookie.setMaxAge(2 * 60); //�� ���� : 2��
	response.addCookie(cookie);
%>
<hr><a href=addtimecookie.jsp >���� ���� �ð��� ��Ű�� �߰�</a>
</body>
</html>