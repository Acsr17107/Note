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
//application��ü ���� : setAttribute()
//application��ü �̸��� ������ : removeAttribute()
//application��ü ��ȯ: getAttribute()
application.setAttribute("Job", "programmer");
application.setAttribute("Taste", "����");
%>
�� �� : <%=application.getAttribute("Job") %>  <BR>
�� �� : <%=application.getAttribute("Taste") %> <BR>
<%
application.removeAttribute("Job");
%>
�� �� : <%=application.getAttribute("Job") %>  <BR>
�� �� : <%=application.getAttribute("Taste") %> <BR>
</body>
</html>