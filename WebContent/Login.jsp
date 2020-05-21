<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> Log in </title>
<style type="test/css" media="screen">
		.center{
				position:absolute;
				width:250px;
				height:120PX;
				left:50%;
				top:50%;
				margin:-100px,0px,0px,-100px;
			}
	</style>
</head>

<body style="background-size:cover">
<div class="center">
	<form action="/Application Web/Login.gsp" method="post">
		<h3>welcome to log in !</h3>
		account：<input name="username" type="text" style="width:150px"><br>
		password：<input name="password" type="password" style="width:150px"><br>
		<input type="submit" value="submit">
		<input type="reset" value="reset">
	</form>
</div>
</body>
</html>
