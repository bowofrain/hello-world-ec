<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="S" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>显示所有用户信息</title>
    
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
    <div id="all">
	<div id="main">
    <div>
   <h2 align="center">用户信息</h2>
  
    <table border="1" align="center">
		<tr>
			<td>用户</td>
			<td>手机</td>
			<td>余额</td>
			<td>权限</td>
			<td>操作</td>
		</tr>
		
<S:forEach var="auser" items="${userInfo }">
		<tr>
			<td>${auser.UId }</td>
			<td>${auser.UTel}</td>
			<td>${auser.RAccount}</td>
			<td>${auser.RId}</td>
			<td>封号&nbsp;&nbsp;删除</td>
		</tr>
</S:forEach>
		<tr>
			<td colspan="5"><a href="ShowAllUser?page=1" >首页</a>
			 <a href="ShowAllUser?page=${pageUserInfo.prePage }" >上一页</a>
			 <a href="ShowAllUser?page=${pageUserInfo.nextPage }" >下一页</a>
			 <a href="ShowAllUser?page=${pageUserInfo.totalNumber }" >尾页</a>  
			 当前 ${pageUserInfo.curPage }页/总共${pageUserInfo.totalNumber } 页
			</td>
		</tr>
	</table>
	</div>
</div>
</div>
  </body>
</html>
