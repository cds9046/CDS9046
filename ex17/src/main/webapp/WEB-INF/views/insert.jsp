<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품등록</title>
</head>
<body>
	<h1>[상품등록]</h1>
	<form name = "frm" method = "post" action = "insert" enctype="multipart/form-data">
	
		<div>상품코드:<input type = "text" name = "pcode"></div>
		<div>상품이름:<input type = "text" name = "pname"></div>
		<div>상품가격:<input type = "text" name = "price"></div>
		<div>이미지:<input type = "file" name = "file"></div>
		<div id = "images">
			첨부파일:<input type = "file" name = "files" multiple>
		</div>
		<input type = "submit" value  = "저장">
		<input type = "reset" value = "취소">
	</form>
</body>
</html>