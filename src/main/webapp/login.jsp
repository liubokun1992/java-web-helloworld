<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<title>登陆界面</title>
	</head>
	<body>
		<form action="user?action=login" method="post">
			Name:<input type="text" name="name" />
			Password:<input type="password" name="password" />
			
			<input type="submit" value="登陆" />
		</form>
	</body>
</html>