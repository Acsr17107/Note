<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��Ű ��ȸ ����</h1>
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			out.println("��Ű�� �����ϴ�.");
		} else {
			for (Cookie c : cookies) {
				out.println("��Ű �̸�(name) : " + c.getName() + ", ");
				out.println("��Ű ��(value) : " + c.getValue() + "<br>");
			}
			/*
			for (int i=0; i<cookies.length; ++i) {
				out.println("��Ű �̸�(name) : " + cookies[i].getName() + ", ");
				out.println("��Ű ��(value) : " + cookies[i].getValue() + "<br>");
			}
			*/
		
		}
	%>
</body>
</html>