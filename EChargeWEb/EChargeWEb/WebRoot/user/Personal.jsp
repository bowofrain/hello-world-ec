<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="S"%>
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
<link rel="stylesheet" href="../css/nav.css">
<script src="../js/jquery.js"></script> 
<script src="../js/hm.js"></script> 
<script src="../js/area.js"></script> 
</HEAD>

<BODY>

<nav id="header" class="top-nav">
	<a href="index.jsp"><img src="" alt="ECharge的logo" /></a>
			<ul>
				<li><a href="map.html">看看附近的充电桩</a></li>
				<li><a href="login.jsp">登录</a></li>
				<li><a href="register.jsp">注册</a></li>
			</ul>
		</nav>
<div  class="cont">
 <div class="nav_left">
 <h2><a href="Personal.jsp">个人中心首页</a></h2> 
 <ul class="mcmb_menu">

 <li class="parent_menu">
 <a href="#" class="title">我的资料</a>
 <ul class="child_menu">
 <li><a href="UserInfo">个人信息管理</a></li> 
 <li><a href="UpdatePassword.jsp">修改密码</a></li>
 </ul> 
 </li>
 
 <li class="parent_menu">
 <a href="baozhuang.html">我要报装</a>
 </li> 
 <li class="parent_menu">
 <a href="dingdan.html">我的充电记录</a>
 </li> 
 <li class="parent_menu">
 <a href="UserBookingList">我的预约记录</a>
 </li> 
 <li class="parent_menu">
 <a href="pinglun.html">我的充值记录</a>
 </li> 

 <li class="parent_menu">
 <a href="#" class="title"><i class="pm_icon_open"></i>我的众筹</a>
 <ul class="child_menu"> 
 <li><a href="faqi.html">我发起的众筹</a></li>
 <li><a href="canyu.html">我参与的众筹</a></li> 
 </ul> 
 </li>

<li class="parent_menu">
<a href="tousu.html">投诉与建议</a>
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
	
	
	


	
	<form class="form-horizontal J_ajaxForm" action="" method="post"> 
	<div class="cont_right mima about"> 
	<div class="index">
	<dl> 
	<dt><img src="../img/user-logo.jpg"  alt="图片不能正常显示"> </dt>
	<dd> 
	<p><b>13821977760</b></p> 
	<p>用户积分：10000分</p> 
	<p>用户类型：普通用户</p> 
	</dd>
	</dl> 
	
	<div class="jilu"> 

	<div class="mcrb_part">
	<div class="area_wrap_margin">
	<h3 class="dn_title"> <span class="dnt_text">我要报装</span> </h3> 
	<div class="dn_content"> 
	<div class="no_content"> 
	<img src="../img/about.png"  alt="图片不能正常显示"> 
	<div class="nc_tips">
	<h3>您还没有任何报装记录！</h3> 
	<a class="btn_instant" target="_blank" href="/index.php?g=portal&amp;m=online&amp;a=yzjz">马上去报装</a> 
	</div> </div> </div> </div> </div> 
	
	<div class="mcrb_part"> 
	<div class="area_wrap_margin"> 
	<h3 class="dn_title"> <span class="dnt_text">我的攻略</span> </h3>
	<div class="dn_content"> 
	<div class="no_content"> 
	<img src="../img/about.png"  alt="图片不能正常显示">
	<div class="nc_tips">
	<h3>您还没有任何攻略记录！</h3> 
	<a class="btn_instant" target="_blank" href="http://home-ev.com/index.php?g=user&amp;m=guide&amp;a=create">马上去写攻略</a> 
	</div> </div> </div> </div> </div> 
	
	</div> 
	</div> 
	
	</div> 
	</form> 



</div>



</BODY>
</HTML>
