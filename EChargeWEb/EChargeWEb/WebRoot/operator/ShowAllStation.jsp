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
    
    <title>My JSP 'ShowAllStation.jsp' starting page</title>
    
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
  
   <h2 align="center">充电站列表</h2>
  	<br/>
    <table border="1" align="center"  class="gridtable">
		<tr>
			<th width="80px">充电站编号</th>
			<th width="80px">充电站名</th>
			<th width="80px">经度</th>
			<th width="80px">纬度</th>
			<th width="120px">地址</th>
			<th width="120px">备注</th>
			<th width="100px">添加时间</th>
			<th width="80px">最后处理</th>
			<th width="100px">操作</th>
		</tr>
		
<S:forEach var="tStation" items="${StationList }">
		<tr>
			<td align="center">${tStation.s_ID }</td>
			<td align="center">${tStation.s_Name}</td>
			<td align="center">${tStation.s_Longitude}</td>
			<td align="center">${tStation.s_Latitude}</td>
			<td align="center">${tStation.s_Adress}</td>
			<td align="center">${tStation.s_Memo}</td>
			<td align="center">${tStation.s_Date}</td>
			<td align="center">${tStation.o_ID}</td>
			<td align="center">
			<a href="operator/UpdateStationInfo?SID=${tStation.s_ID }">修改</a>
			&nbsp;&nbsp;
			<a href="operator/DeleteStation?SID=${tStation.s_ID }">删除</a></td>
		</tr>
</S:forEach>
		<tr>
			<td colspan="9"  align="center"><a href="operator/ShowAllStation?page=1" >首页</a>
			 <a href="operator/ShowAllStation?page=${pageInfo.prePage }" >上一页</a>
			 <a href="operator/ShowAllStation?page=${pageInfo.nextPage }" >下一页</a>
			 <a href="operator/ShowAllStation?page=${pageInfo.totalNumber }" >尾页</a>  
			 当前 ${pageInfo.curPage }页/总共${pageInfo.totalNumber } 页
			</td>
		</tr>
	</table>
	</div>
</div>
</div>
  </body>
</html>