<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ���</title>
</head>
<body>
	<h1>[��ǰ���]</h1>
	<form name = "frm" method = "post" action = "insert" enctype="multipart/form-data">
	
		<div>��ǰ�ڵ�:<input type = "text" name = "pcode"></div>
		<div>��ǰ�̸�:<input type = "text" name = "pname"></div>
		<div>��ǰ����:<input type = "text" name = "price"></div>
		<div>�̹���:<input type = "file" name = "file"></div>
		<div id = "images">
			÷������:<input type = "file" name = "files" multiple>
		</div>
		<input type = "submit" value  = "����">
		<input type = "reset" value = "���">
	</form>
</body>
</html>