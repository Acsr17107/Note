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
String name = "include";
//include �����ڴ� file�Ӽ��� ������ �ҽ��� ���ԵǾ� ����
//�ҽ����� ����Ǿ���
%>
<%@ include file="Top.jsp"%>
include �������� Body �κ��Դϴ�.
<%@ include file="Bottom.jsp"%>
</body>
</html>