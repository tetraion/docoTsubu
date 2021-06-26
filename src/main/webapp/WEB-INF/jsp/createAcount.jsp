<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント作成</title>
</head>
<body>
<h1>新規アカウント作成</h1>
	<form action="/docoTsubu/CreateAcount" method="post">
		ユーザー名:<input type="text" name="name"><br> パスワード:<input
			type="password" name="pass"><br> <input type="submit"
			value="作成">
	</form>
</body>
</html>