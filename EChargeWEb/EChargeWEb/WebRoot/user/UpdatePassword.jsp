<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<TITLE>个人中心 </TITLE>
<META NAME="Generator" CONTENT="EditPlus">
<META NAME="Author" CONTENT="">
<META NAME="Keywords" CONTENT="">
<META NAME="Description" CONTENT="">
<meta charset="utf-8">
<LINK rel="stylesheet" href="../css/gerenzhongxin.css"> 
<script src="../js/jquery.js"></script> 
<script src="../js/hm.js"></script> 

<link rel="stylesheet" href="../css/nav.css">
</HEAD>

<BODY>

<nav id="header" class="top-nav">
		<a href="index.html"><img src="img/logo.png" alt="ECharge的logo" /></a>
			<ul>
				<li><a href="map.html">看看附近的充电桩</a></li>
				<li><a href="login.html">登录</a></li>
				<li><a href="register.html">注册</a></li>
			</ul>
		</nav>
<div  class="cont">
 <div class="nav_left">
 <h2><a href="wodeshouye.html">个人中心首页</a></h2> 
 <ul class="mcmb_menu">

 <li class="parent_menu">
 <a href="#" class="title"><i class="pm_icon_open"></i>我的资料</a>
 <ul class="child_menu">
 <li><a href="xinxiguanli.html">个人信息管理</a></li> 
 <li><a href="mima.html">修改密码</a></li>
 </ul> 
 </li>
 
 <li class="parent_menu">
 <a href="baozhuang.html">我要报装</a>
 </li> 
 <li class="parent_menu">
 <a href="dingdan.html">我的订单</a>
 </li> 
 <li class="parent_menu">
 <a href="gonglue.html">我的攻略</a>
 </li> 
 <li class="parent_menu">
 <a href="pinglun.html">我的评论</a>
 </li> 

 <li class="parent_menu">
 <a href="#" class="title"><i class="pm_icon_open"></i>我的众筹</a>
 <ul class="child_menu"> 
 <li><a href="faqi.html">我发起的众筹</a></li>
 <li><a href="canyu.html">我参与的众筹</a></li> 
 </ul> 
 </li>

<li class="parent_menu">
<a href="">投诉与建议</a>
</li>

 <div class="mfrx_lx"> <p><i></i>全国免费热线</p> <b>400-655-6620</b> </div>
 </ul>
 <script>    
 $(function(){
		$(".parent_menu .title").click(function(){
			$(this).parent("li").toggleClass("on");
			})
		})
  </script>

  <script>var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?489be9d98cbc0b89c283b4e233833118";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script> 
	
</div>  
	
	
<form class="form-horizontal J_ajaxForm" action="UpdatePassword" method="post"> 
<div class="cont_right mima"> 
<h2><span>修改密码</span></h2>
<ul> 
  <li><span>原密码：</span><input name="old_password" placeholder="您现在的密码" type="password"></li> 
  <li><span>新密码：</span><input name="password" placeholder="请输入新的密码" type="password"></li> 
  <li><span>确认新密码：</span><input name="repassword" placeholder="请确认新密码" type="password"></li> 
</ul> 
  <p><input value="提 交" type="submit"></p> 
 </div> 
 </form>



</div>



</BODY>
</HTML>
