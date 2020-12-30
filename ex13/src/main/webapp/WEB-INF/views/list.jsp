<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>도서목록</title>
</head>
<body>
	<h1>[도서목록]</h1>
	<div id="divBook">
		<c:forEach items="${list }" var="vo">
			<div class="box">
				<img src="display?fileName=${vo.image }">
				<div>${vo.title}</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>