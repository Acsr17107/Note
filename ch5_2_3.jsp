<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>������� �̷¼�</h2>
	<% request.setCharacterEncoding("euc-kr"); %>
	�̸� : <%= request.getParameter("name") %> <br>
	�ֹι�ȣ : <%= request.getParameter("jnum1") %> -
			  <%= request.getParameter("jnum2") %> <br>
	�з� : <%= request.getParameter("graduate") %><br>
	���� : <%= request.getParameter("major") %><br>
	���� �÷��� :
	<%
		for ( String platform : request.getParameterValues("platform") ) {
			out.println("[" + platform + "] ");
		}
	%>
</body>
</html>