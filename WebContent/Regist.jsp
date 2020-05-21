<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/style.css" />
<title> Regist </title>
<style type="text/css" media="screen">
                .center{
                        position:absolute;
                        width: 250px;
                        height: 120px;
                        left: 50%;
                        top: 50%;
                        margin: -100px 0px 0px -100px;      
                }
        </style>
</head>

<body>
<h3 style="color:red">new user regists</h3>
   <form action="/Application Web/Regist.jsp" method="post">
account: <input type="text" name="username" style="width:150px;height:20px"/>
password: <input type="password" name="password" style="width:150px;height:20px"/>
<input type="submit" name="op" value="submit">
<input type="reset" name="op" value="reset">
</form>
</body>
</html>
