<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
String s_name="";
if(session.getAttribute("memName")==null)
{
	response.sendRedirect("login2.html");
}
s_name=(String)session.getAttribute("memName");
%>
<form method="post" action="Logout2.jsp">
<%= s_name %>�� �ȳ��ϼ���
<br>
���� Ȩ�������� �湮�� �ּż� �����մϴ�.<br>
��ſ� �ð� �Ǽ���....<br>
<input type="submit" value="�α׾ƿ�">
</form>