<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  
  <script type="text/javascript">
  	function delInfo(){
  		//当前有form，所以要重新定义新的action
  		document.forms[0].action="test/UserInfoManage_delUser.action";
		document.forms[0].submit();
  	}
  </script>
  
  </head>
  <body>
	  <form action="test/UserInfoManage_selectUser.action" method="post">
	  	<input type="submit" value="查询">
	  	<h1>${msg }</h1>
	  	<table>
	  		<tr>
	  			<th></th>
	  			<th>用户名</th>
	  			<th>密码</th>
	  			<th>编辑</th>
	  		</tr>
	  		<c:forEach items="${userList}" var="u">
		  		<tr>
		  			<td><input type="checkbox" /></td>
		  			<td>${u.userName }</td>
		  			<td>${u.password }</td>
		  			<td><a href="test/UserInfoManage_editUser.action">编辑</a></td>
		  		</tr>
	  	    </c:forEach>
	  	</table>
	  	<input type="button" value="删除" onclick="delInfo()">
	  </form>
  </body>
</html>
