<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>CGV</title>
	
</head>
<body>
	<h1>[CGV]</h1>
	<button id="btnSave">저장</button>
	<div id="container"></div>
	<script id="temp" type="text/x-handlebars-template">
	{{#each .}}
		<div class="box" image="{{image}}" rank="{{rank}}" title="{{title}}">
			<img src="{{image}}" width=150>
			<div>{{rank}}:{{title}}</div>
	{{/each}}	
	</script>
</body>
<script>
	getList();
	
	$("#btnSave").on("click", function(){
		if(!confirm("저장하실래요?")) return;
		$("#container .box").each(function(){
			var title=$(this).attr("title");
			
			var fullRank = $(this).attr("rank");
	        var rank = fullRank.substring(3);
	        
	        var fullImage=$(this).attr("image");
	        var image = $(this).attr("image").split("/")[8];
	      
			$.ajax({
				type:"get",
				url:"insert",
				data:{"title":title, "rank":rank, "image":image, "fullImage":fullImage},
				success:function(){
					
				}
			});
		});		
		alert("저장 완료");
	});
	
	function getList(){
		$.ajax({
			type:"get",
			url:"cgv.json",
			dataType:"json",
			success:function(data){
				var temp = Handlebars.compile($("#temp").html());
	            $("#container").html(temp(data));
			}
		});
	}
</script>
</html>