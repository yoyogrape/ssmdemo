<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>文件上传</title>
	</head>

	<body>
		<form action="test/register.do" method="post">
			姓名：
			<input type="text" name="name">
			年龄：
			<input type="text" name="age">
			<input type="submit" value=" 注册">
		</form>
		<form action="test/upload.do" method="post" enctype="multipart/form-data">
			文件：
			<input type="file" name="img">
			<input type="submit" value="上传">
		</form>
	</body>
</html>
