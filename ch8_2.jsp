<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% ch8.ScoreBean score = new ch8.ScoreBean(); %>
<% score.setName("�輺��"); %>
<% score.setPoint(85); %>
�̸� : <% out.println(score.getName()); %><br>
���� : <% out.println(score.getPoint()); %>
���� : <% out.println(score.getGrade()); %>
</body>
</html>