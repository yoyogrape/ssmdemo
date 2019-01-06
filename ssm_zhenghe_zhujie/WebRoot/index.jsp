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
		<title>ssm整合</title>
	</head>

	<body>
		<form action="stu/reg.do" method="post">
			姓名：
			<input type="text" name="name">
			年龄：
			<input type="text" name="age">
			<input type="submit" value="注册">
		</form>
	</body>
</html>
