<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> ��û ����</h2>
��û ��� : <%= request.getMethod()%><p>
��û URL : <%= request.getRequestURL()%><p>
��û URI : <%= request.getRequestURI()%><p>
Ŭ���̾�Ʈ �ּ� : <%= request.getRemoteAddr()%><p>
Ŭ���̾�Ʈ ȣ��Ʈ : <%= request.getRemoteHost()%><p>
�������� ��� : <%= request.getProtocol()%><p>
���� �̸� : <%= request.getServerName()%><p>
���� ��Ʈ ��ȣ : <%= request.getServerPort()%><p>

</body>
</html>