<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	  <form action="test/UserInfoManage_addUser.action" enctype="multipart/form-date"  method="post">
	  	<input type="file" name="user_pic"/><br>
	  	姓名：<input type="text" name="userName" value="${userInfo.userName }"> <br><br>
	  	密码：<input type="text" name="password" value="${userInfo.password }"><br><br>
	  	<input type="submit" value="添加">
	  	<c:if test="${allErrors!=null}" >
	  		<c:forEach items="${allErrors}" var="error">
	  			${error.defaultMessage }
	  		</c:forEach>
	  	</c:if>
	  </form>
  </body>
</html>
