<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���� �ð��� ��� ����</h1>
	<%
		Cookie cookie2 = new Cookie("user2", "kang2");
		cookie2.setMaxAge(2*60); //�� ���� : 2��
		response.addCookie(cookie2);
	%>
<hr><a href=getcookie.jsp >��Ű ��ȸ</a>
</body>
</html>