<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
html, body {overflow:hidden;border: 0;} /*为兼容ie7,ff*/
.header {width:100%; height:21%;overflow:hidden; background: #686868; font-family:Arial, Helvetica, sans-serif; font-size:12px; margin:0px; margin-bottom:2px;border-bottom: 1px #ccc solid;}
.header h1 {color: #FFF;}
.header a {color: #FFF; text-decoration: none;/*防止滤镜下链接失效*/position:relative;}
.header ul { list-style:none;}
#hall {width: 100%;}
#banner {margin-top: 8px; margin-left: 32px;}
#hmain {width: 100%; margin-bottom: 2px; background:#eeeeee; margin-left: 0px; margin-right:0px; height: 30px; color: #000; line-height: 2.4;overflow: auto;}
#hmain a {color:#000;}
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
<style type="text/css">

.amenu {width:22%;height:79%;overflow:hidden;font-family:Arial, Helvetica, sans-serif; font-size:12px; margin:0px; text-align:center; border-right:1px #ccc solid;}
.amenu a {color: #000; text-decoration: none;}
#menu img {_margin-top: 12px;}/*没办法,ie6对list-style-image支持不好*/
#mall {width: 100%;height:100%;}
#menu {width: 96%;}
#menu ul {padding:0; margin: 0; list-style: none;}
#menu ul li {background-image:url(images/operator/menu_bg.gif); background-repeat: repeat-x; background-position:center; height: 32px;;margin-top: 2px; margin-bottom: 2px; border:1px #ccc solid; line-height: 2.8;}
</style>
<style type="text/css">
.amain {width:88%;height:79%;overflow:hidden;font-family: Arial, Helvetica, sans-serif; font-size:12px; text-align:center;}
.amain a { text-decoration: none;}
#aall {widht: 100%; text-align:center; margin:auto;}
#main {width: 96%; line-height: 1.8; margin:auto; border:1px #ccc dashed; text-align: left; text-indent: 2em;}
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
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/ddaccordion.js"></script>
<script type="text/javascript">
ddaccordion.init({
	headerclass: "expandable", //Shared CSS class name of headers group that are expandable
	contentclass: "categoryitems", //Shared CSS class name of contents group
	revealtype: "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
	mouseoverdelay: 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
	collapseprev: true, //Collapse previous content (so only one open at any time)? true/false 
	defaultexpanded: [0], //index of content(s) open by default [index1, index2, etc]. [] denotes no content
	onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
	animatedefault: false, //Should contents open by default be animated into view?
	persiststate: true, //persist state of opened contents within browser session?
	toggleclass: ["", "openheader"], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
	togglehtml: ["prefix", "", ""], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
	animatespeed: "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
	oninit:function(headers, expandedindices){ //custom code to run when headers have initalized
		//do nothing
	},
	onopenclose:function(header, index, state, isuseractivated){ //custom code to run whenever a header is opened or closed
		//do nothing
	}
})
</script>
  </head>
  
  <body>
  

  
  <!-- header开始 -->
	<div class="header">
		<div id="hall">
			<div id="banner">
				<h1>&nbsp;&nbsp;&nbsp;&nbsp;Echarge客服管理系统</h1>
			</div>
			<div id="nav">
				<ul>

					<li class="inactive" id="sheet"><a
						href="operator/backData.jsp" target="menu">生成报表</a></li>
					<li class="inactive" id="log"><a href="operator/backData.jsp"
						target="menu">日志管理</a></li>
					<li class="inactive" id="chgpile"><a
						href="operator/backData.jsp" target="menu">充电桩管理</a></li>
					<li class="inactive" id="user"><a href="operator/backData.jsp"
						target="menu">用户管理</a></li>
					<li class="active" id="operator"><a
						href="operator/backData.jsp" target="menu">客户服务</a></li>


				</ul>
			</div>
			<div id="hmain">
				<div id="welcome">欢迎你回来!admin</div>
				<div id="adminop">
					<ul>

						<li><a href="javascript:parent.location.reload();">系统首页</a></li>
						<li><a href="javascript:parent.location.reload();">退出系统</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	 <!-- header结束 -->
	
	 <!-- menu开始 -->
	<div class="amenu">
		<div id="mall">
			<div id="menu">
				<ul>
					<li class="expandable">&nbsp; <a onclick=javascript:ShowFLT(1)
						href="javascript:void(null)"><img
							src="images/operator/li.jpg" />&nbsp;&nbsp;&nbsp;<span
							style="font-weight: 600;font-size: 13">用户列表</span></a>
					</li>

					<div class="categoryitems">
						<li>&nbsp;&nbsp;&nbsp; <a href="ShowAllUser" target="main">&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;</a></li>
						<li>&nbsp;&nbsp;&nbsp; <a href="#" target="main">注册时间</a></li>
					</div>
					<li><img src="images/operator/li.jpg" />&nbsp;&nbsp;&nbsp;<a
						href="#" target="main"><span
							style="font-weight: 600;font-size: 13">查询用户</span></a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- menu结束  -->
	
	<!-- main开始  -->
	<div class="amain">
		<div id="aall">
			<div id="main"></div>
		</div>
	</div>
	<!-- main结束  -->
	
</body>
</html>
