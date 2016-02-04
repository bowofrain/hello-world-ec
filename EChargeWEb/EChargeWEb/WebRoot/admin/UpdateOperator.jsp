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
    
    <title>My JSP 'UpdateOperator.jsp' starting page</title>
    
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
   <h2 align="center">修改客服信息</h2>
  
   <form action="admin/UpdateOperator" method="post"> 
<div class="cont_right mima"> 

<ul> 
  <li><span>工号：</span><input name="OID" value="${tOperator.o_ID }" placeholder="请输入工号" type="hidden">${tOperator.o_ID }</li> 
<%--   <li><span>密码：</span><input name="OPassword" value="${tOperator.o_Password }" placeholder="请设定密码" type="password"></li>  --%>
  <li><span>姓名：</span><input name="OName" value="${tOperator.o_Name }" placeholder="请输入姓名" type="text"></li> 
  <li><span>身份证号：</span><input name="OIDCard" value="${tOperator.o_IDCard}" placeholder="请输入身份证号" type="text"></li> 
  <li><span>所属部门：</span><input name="ODepartment" value="${tOperator.o_Department }" placeholder="请输入所属部门" type="text"></li> 
  <li><span>家庭住址：</span><input name="OAdress" value="${tOperator.o_Adress }" placeholder="请输入家庭住址" type="text"></li> 
  <li><span>联系电话：</span><input name="OTel" value="${tOperator.o_Tel }" placeholder="请输入联系电话" type="text"></li> 
  <li><span>角色：</span><input name="RID" value="${tOperator.r_ID }" placeholder="请输入角色" type="text"></li> 
</ul> 
<p><input value="修改" type="submit"></p> 
</div>
</form>	
</div>
</div>
</div>

  </body>
</html>
