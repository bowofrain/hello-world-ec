<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>echarge客服系统</title>
    
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
#all {margin-left:auto; margin-right:auto; text-align: center;width: 540px;}
body {text-align:center;}
#main { background:url(images/operator/login_mid.gif);  height:240px; text-align:center;}
#title {height:66px;margin-top: 120px;}
#login { margin-top: 0px; width: 420px; margin-left: auto; margin-right:auto;}
#btm_left {background:url(images/operator/login_btm_left.gif) no-repeat; width:21px; float:left;}
#btm_mid {background:url(images/operator/login_btm_mid.gif); width:498px; float:left;}
#btm_right {background:url(images/operator/login_btm_right.gif) no-repeat; width:21px; float:left;}
</style>
<script type="text/javascript" language="javascript">
function reset_form()
{
	document.getElementById('username').value = '';
	document.getElementById('password').value = '';
	return false;
}					 
</script>
</head>
<body>
<div id="all">
    <div id="title">
    <img src="images/operator/login_title.png" /></div>
    <div id="main">
        <br/>
        <br/>
    	<form action="OperatorLogin" method="post"  >
        <table id="login">
        	<tr>
            	<td><span style="font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800;">工号： </span></td>
                <td><input type="text" name="operatorname" id="operatorname" size="32" style="background:url(images/operator/username_bg.gif) left no-repeat #FFF; border:1px #ccc solid;height: 20px; font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800; margin:0; padding-left: 24px;" /></td>
            </tr>
            <tr><td></td><td></td></tr>
            <tr><td></td><td></td></tr>
            <tr>
            	<td><span style="font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800;">密码： </span>  </td>
                <td><input type="password" name="password" id="password" size="32" style="background:url(images/operator/password_bg.gif) left no-repeat #FFF; border: 1px #ccc solid; height: 20px; font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800; margin:0; padding-left: 24px;" /></td>
            </tr>
            <tr>
            	<td></td>
            	<td style="text-align: center; padding-top: 32px;">
                	<input type="image" src="images/operator/login.gif" name="submit" onclick="javascript:document.getElementById('login_form').submit();" />&nbsp;&nbsp;&nbsp;
                    <input type="image" src="images/operator/cancel.gif" name="cancel" onclick="reset_form();" />
                </td>
            </tr>
        </table>
        </form>
    </div>
    <div id="btm">
        <div id="btm_left"></div>
        <div id="btm_mid"></div>
        <div id="btm_right"></div>
    </div>
</div>
</body>
</html>