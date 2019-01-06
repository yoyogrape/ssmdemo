<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<base href="<%=basePath%>">

		<title>haha</title>
	</head>

	<body>
		haha.jsp
		<br>
		${msg }
		<br>
		<img alt="jaja" src="image/adobe-stock-bg.png">
	</body>
</html>
