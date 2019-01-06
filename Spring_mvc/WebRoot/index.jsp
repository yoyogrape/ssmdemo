<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	  <!-- 通过bean元素的name相匹配 -->
	  <form action="login.action" method="post">
	  	<!-- 访问处理器映射器BeanNameUrlHandlerMapping -->
	  	 <input type="submit" value="登录">
	  </form>
	  
	  
	  <!-- 通过bean元素的id相匹配（一个控制器可以设置多个访问路径） -->
	  <form action="query.action" method="post">
	  	<!-- 访问处理器映射器simpleUrlHandlerMapping -->
	  	 <input type="submit" value="登录2">
	  </form>
	  
	  <form action="query2.action" method="post">
	  	<!-- 访问处理器映射器simpleUrlHandlerMapping -->
	  	 <input type="submit" value="登录3">
	  </form>
  </body>
</html>
