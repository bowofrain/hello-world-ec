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
    
    <title>My JSP 'ShowAllOperator.jsp' starting page</title>
    
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
    <br/>
  
   <h2 align="center">客服列表</h2>
  	<br/>
    <table border="1" align="center"  class="gridtable">
		<tr>
			<th width="80px">工号</th>
			<th width="60px">姓名</th>
			<th width="90px">所属部门</th>
			<th width="90px">联系电话</th>
			<th width="90px">身份证号</th>
			<th width="120px">家庭住址</th>
			<th width="60px">角色</th>
			<th width="100px">添加时间</th>
			<th width="80px">最后处理</th>
			<th width="100px">操作</th>
		</tr>
		
<S:forEach var="tOperator" items="${OperatorList }">
		<tr>
			<td align="center">${tOperator.o_ID }</td>
			<td align="center">${tOperator.o_Name}</td>
			<td align="center">${tOperator.o_Department}</td>
			<td align="center">${tOperator.o_Tel}</td>
			<td align="center">${tOperator.o_IDCard}</td>
			<td align="center">${tOperator.o_Adress}</td>
			<td align="center">${tOperator.r_ID}</td>
			<td align="center">${tOperator.o_Time}</td>
			<td align="center">${tOperator.a_ID}</td>
			<td align="center">
			<a href="admin/UpdateOperatorInfo?OId=${tOperator.o_ID }">修改</a>
			&nbsp;&nbsp;
			<a href="admin/DeleteOperator?OId=${tOperator.o_ID }">删除</a></td>
		</tr>
</S:forEach>
		<tr>
			<td colspan="10"  align="center"><a href="admin/ShowAllOperator?page=1" >首页</a>
			 <a href="admin/ShowAllOperator?page=${pageInfo.prePage }" >上一页</a>
			 <a href="admin/ShowAllOperator?page=${pageInfo.nextPage }" >下一页</a>
			 <a href="admin/ShowAllOperator?page=${pageInfo.totalNumber }" >尾页</a>  
			 当前 ${pageInfo.curPage }页/总共${pageInfo.totalNumber } 页
			</td>
		</tr>
	</table>
	</div>
</div>
</div>
  </body>
</html>