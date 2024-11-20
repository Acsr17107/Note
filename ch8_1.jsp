<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="score" class="ch8.ScoreBean" scope="page" />
<jsp:setProperty name="score" property="name" value="김성민"/>
<jsp:setProperty name="score" property="point" value="85"/>

이름 : <jsp:getProperty name="score" property="name" /><BR>
성적 : <jsp:getProperty name="score" property="point" /><BR>

</body>
</html>