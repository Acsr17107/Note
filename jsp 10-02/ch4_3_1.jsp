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
int num[] ={10,20,30};
for (int n : num){
	out.println(n + "  ");
}


/*
String[] strMember = {"����ȫ", "�̼���", "��ȭ��"};

for(String n : strMember)     //for each�� �ڹ� 1.6�����̻���������ϴ¹�
	out.println(n + "<BR>");
*/
/*
String[] strMember = {"����ȫ", "�̼���", "��ȭ��", "ȫ�浿"};

for(int i=0;i<strMember.length; i++)
	out.println(strMember[i] + "<BR>");

*/
/*
String[] strMember = new String[3];

strMember[0] = new String("����ȫ");
strMember[1] = new String("�̼���");
strMember[2] = new String("��ȭ��");

out.println(strMember[0] + "<BR>");
out.println(strMember[1] + "<BR>");
out.println(strMember[2] + "<BR>");
*/
%>
</body>
</html>