<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<SCRIPT language="JavaScript">
function Check()
{
if (Member.id.value.length < 1){
	alert("���̵� �Է��ϼ���.");
	Member.id.focus();
	return false;
}

if (Member.pass.value.length < 1){
	alert("��й�ȣ�� �Է��ϼ���.");
	Member.pass.focus();
	return false;
}
Member.submit();
} 
</SCRIPT>

</head>
<body>

<center><font size='3'><b> ȸ�� ���� </b></font>   

<TABLE border='0' width='600' cellpadding='0' cellspacing='0'>
	<TR>
		<TD><hr size='1' noshade>
		</TD>
 	</TR>
</TABLE>


<FORM Name='Member' Method='post' Action='member_ok.jsp'>

<TABLE align=center width='300' border='0' cellpadding='10' cellspacing='0'>
<TR>
	<TD bgcolor='cccccc' align='right'>
		<font size='2'>ID :</font>
	</TD>
	<TD bgcolor='cccccc' align='center'>
		<input type=text maxlength=10 size=10 name=id>
	</TD>
	<TD bgcolor='cccccc' align='left'>
		<input onclick='Check()' type='button' value='�α���'>
	</TD>
</TR>
<TR>
	<TD bgcolor='cccccc' align='right'>
		<font size='2'>��й�ȣ :
	</TD>
	<TD bgcolor='cccccc' align='center'>
		<input type='password' maxlength='10' size='10' name='pass'>
	</TD>
	<TD bgcolor='cccccc'>
		<font size='2'>
		<a href="member_input.jsp">[ȸ������]</a></font>
	</TD>
</TR>

</TABLE>

</FORM>



</body>
</html>