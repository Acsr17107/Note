<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<center><font size='3'><b> ȸ�� ���� ������ </b></font>   

<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
	<TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</TABLE>

<TABLE cellSpacing='0' cellPadding='30' align='center' border='0'>
	
<%
try{

String strUser = "yes";
String strSession = session.getAttribute("user").toString();

if (!strUser.equals(strSession)) {
%>

<TR>
	<TD align='center'>
	<font size='2'>�α��� �ϼ���.</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<a href="member.jsp">[�α���]</a>
	</TD>
</TR>
<%
} else {
%>
<TR>
	<TD align='center'>
	<font size=2>ȸ�� ���� ������</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<font size=2>�� �������� ȸ�����Ը� �����Ǵ� �������Դϴ�.</font>
	</TD>
</TR>
<%
}
}catch(NullPointerException e){
%>
<TR>
	<TD align='center'>
	<font size='2'>�α��� �ϼ���.</font>
	</TD>
</TR>
<TR>
	<TD align='center'>
	<a href="member.jsp">[�α���]</a>
	</TD>
</TR>
<%
}
%>

</TABLE>


</body>
</html>