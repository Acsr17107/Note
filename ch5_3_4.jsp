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
	out.println("�� �κ��� ��µ��� �ʽ��ϴ�.");
	out.clear();	//������ ���빰�� ����
%>
	<h2>���� �������� ��� ���� ����</h2><p>
	�ʱ� ��� ���� ũ�� : <%=out.getBufferSize()%> byte<p>
	���� ��� ���� ũ�� : <%=out.getRemaining()%> byte<p>
	autoFlush : <%=out.isAutoFlush()%><p>
</body>
</html>