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
<jsp:setProperty name="score" property="name" value="�輺��"/>
<jsp:setProperty name="score" property="point" value="85"/>

�̸� : <jsp:getProperty name="score" property="name" /><BR>
���� : <jsp:getProperty name="score" property="point" /><BR>
���� : <jsp:getProperty name="grade" property="grade" /><BR>

</body>
</html>