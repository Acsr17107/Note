<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% int i = 12; %>
<% int n = 365; %>
1 ���� <%=i %>�� �Դϴ�.
<jsp:include page="includesub.jsp" />
1 ���� <%=n %>�� �Դϴ�.
</body>
</html>