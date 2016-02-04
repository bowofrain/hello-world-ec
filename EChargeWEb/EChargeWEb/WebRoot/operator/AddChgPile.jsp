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
    
    <title>My JSP 'AddChgPile.jsp' starting page</title>
    
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
   <h2 align="center">添加充电桩</h2>
<form action="operator/AddChgPile" method="post"> 
<div class="cont_right mima"> 

<ul> 
  <li><span>充电桩编号：</span><input name="CPID" value="" placeholder="请输入充电桩编号" type="text"></li> 
  <li><span>出厂编号：</span><input name="CPSerialNumber" value="" placeholder="请输入出厂编号" type="text"></li> 
  <li><span>经度：</span><input name="CPLongitude" value="" placeholder="请输入经度" type="text"></li> 
  <li><span>纬度：</span><input name="CPLatitude" value="" placeholder="请输入纬度" type="text"></li> 
  <li><span>状态：</span><input name="CPState" value="" placeholder="请输入状态" type="text"></li>  
  <li><span>收费标准：</span><select name="FSID"><S:forEach var="psList" items="${PriceStdList }">
									<option value="${psList.FS_ID }">${psList.FS_Std }</option>
								</S:forEach></select></li> 
  <li><span>型号编码：</span><select name="CPTID"><S:forEach var="cptList" items="${ChgPileTypeList }">
									<option value="${cptList.CPT_ID }">${cptList.CPT_ID }</option>
								</S:forEach></select></li> 
  <li><span>充电站编号：</span><input name="SID" value="" placeholder="请输入充电站编号" type="text"></li> 
</ul> 
<p><input value="提 交" type="submit"></p> 
</div>
</form>	
	</div>
</div>
</div>
  </body>
</html>
