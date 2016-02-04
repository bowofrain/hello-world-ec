<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Echarge后台管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body {background: #686868; font-family:Arial, Helvetica, sans-serif; font-size:12px; margin:0px; margin-bottom:2px;border-bottom: 1px #ccc solid;}
h1 {color: #FFF;}
a {color: #FFF; text-decoration: none;/*防止滤镜下链接失效*/position:relative;}
ul { list-style:none;}
#all {width: 100%;}
#banner {margin-top: 8px; margin-left: 32px;}
#main {width: 100%; margin-bottom: 2px; background:#eeeeee; margin-left: 0px; margin-right:0px; height: 30px; color: #000; line-height: 2.4;overflow: auto;}
#main a {color:#000;}
#welcome { float:left; width: 40%; font-weight: 800; padding-left: 8px; position:relative;}
#adminop { float:left; width: 59%; position:relative; text-align:right; line-height:1; *line-height:2.2;}
#adminop ul li {float: right; width: 80px;}
#nav {width: 100%; clear: both;}
#nav ul li {float: right; width:82px; height:25px; line-height: 2.1; text-align: center;}
.inactive { background-image/**/:url(images/operator/nav_bg_inactive2.png) !important;background: none; margin-left: 2px; margin-right:2px;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src=images/operator/nav_bg_inactive2.png);}
.inactive a {color: #000;}
.active {background:url(images/operator/nav_bg_active2.png) !important;background: none; margin-left: 2px; margin-right:2px;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src=images/operator/nav_bg_active2.png);}
.active a {color:#fff;}
.blankgray {background:#bbb; height:2px; width:100%; margin:0; padding:0; clear:both; font-size:2px;}
</style>
<script type="text/javascript" language="javascript" src="script/jquery-1.3.2.min.js"></script>
<script type="text/javascript">
var oplist = new Array('operator', 'user', 'chgpile', 'log',  'sheet');
$(document).ready(function() {
	$('#nav').find("a").click(function() {
		var id = $(this).attr('id');
		$.each(oplist, function(i, n) {
			$('#'+n).attr('class', 'inactive');
		});
		$(this).parents("li").attr('class', 'active');
	});
});
</script>

  </head>
  <body>
<div id="all">
	<div id="banner"><h1>&nbsp;&nbsp;&nbsp;&nbsp;Echarge后台管理系统</h1></div>
    <div id="nav">
    	<ul>
        	
			<li class="inactive" id="sheet"><a href="operator/backData.jsp" target="menu">权限管理</a></li>
            <li class="inactive" id="log"><a href="operator/backData.jsp" target="menu">角色管理</a></li>
            <li class="inactive" id="chgpile"><a href="operator/backData.jsp" target="menu">日志管理</a></li>
            <li class="inactive" id="user"><a href="operator/backData.jsp" target="menu">电桩故障维修</a></li>
            <li class="active" id="operator"><a href="operator/backData.jsp" target="menu">客服管理</a></li>
            
            
        </ul>
    </div>
    <div id="main">
    	<div id="welcome">欢迎你回来!admin  </div>
        <div id="adminop">
            <ul>
                
                <li><a href="javascript:parent.location.reload();">系统首页</a></li>
                <li><a href="javascript:parent.location.reload();">退出系统</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
