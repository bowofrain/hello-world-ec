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
    
    <title>My JSP 'AddStation.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<LINK rel="stylesheet" href="style/form.css">
  </head>
  
  <body>
     <div id="all">
	<div id="main">
    <div>
    <br/>
   <h2 align="center">添加充电站</h2>
<form action="operator/AddStation" method="post"> 
<div class="cont_right mima"> 

<ul> 
  <li><span>充电站编号：</span><input name="SID" value="" placeholder="请输入充电站编号" type="text"></li> 
  <li><span>充电站名：</span><input name="SName" value="" placeholder="请输入充电站名" type="text"></li> 
  <li><span>经度：</span><input name="SLongitude" value="" placeholder="请输入经度" type="text"></li> 
  <li><span>纬度：</span><input name="SLatitude" value="" placeholder="请输入纬度" type="text"></li> 
  <li><span>地址：</span><input name="SAdress" value="" placeholder="请输入地址" type="text"></li> 
  <li><span>备注：</span><input name="SMemo" value="" placeholder="请输入备注" type="text"></li>   
</ul> 
<p><input value="提 交" type="submit"></p> 
</div>
</form>	
	</div>
</div>
</div>
  </body>
</html>
