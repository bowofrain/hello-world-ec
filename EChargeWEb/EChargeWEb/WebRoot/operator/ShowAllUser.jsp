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
  <style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>
  <body>
 
    <div id="all">
	<div id="main">
    <div>
   <h2 align="center">用户信息</h2>
  
    <table border="1" align="center"  class="gridtable">
		<tr>
			<th width="200px">用户</th>
			<th width="200px">手机</th>
			<th width="100px">余额</th>
			<th width="100px">权限</th>
			<th width="200px">操作</th>
		</tr>
		
<S:forEach var="auser" items="${userInfo }">
		<tr>
			<td align="center">${auser.u_ID }</td>
			<td  align="center">${auser.u_Tel}</td>
			<td align="center">${auser.r_Account}</td>
			<td align="center">${auser.r_ID}</td>
			<td align="center">封号&nbsp;&nbsp;删除</td>
		</tr>
</S:forEach>
		<tr>
			<td colspan="5"  align="center"><a href="ShowAllUser?page=1" >首页</a>
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
