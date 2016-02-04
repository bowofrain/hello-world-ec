<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="S"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<TITLE>修改个人资料 </TITLE>
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
	<a href="index.html"><img src="" alt="ECharge的logo" /></a>
			<ul>
				<li><a href="map.html">看看附近的充电桩</a></li>
				<li><a href="login.jsp">登录</a></li>
				<li><a href="register.jsp">注册</a></li>
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
	
	
<form class="form-horizontal J_ajaxForm" action="UpdateUser" method="post">
<div class="cont_right mima"> 
<h2><span>修改个人信息</span></h2>

<ul> 


  <li><span>账户名：</span>${userInfo.u_ID }<input type="hidden" name="userID" value="${userInfo.u_ID }" /></li> 
  <li><span>手机号：</span><input type="text" name="userTel"  value="${userInfo.u_Tel }" /></li> 
  <li><span>真实姓名：</span><input type="text" name="userName" value="${userInfo.u_Name }" /></li> 
  <li><span>身份证件类型：</span><select name="ctId"><S:forEach var="cdtList" items="${CredentialtypeList }">
								<S:if test="${userInfo.CT_ID.equals(cdtList.CT_ID) }">
									<option value="${cdtList.CT_ID }" selected="selected">${cdtList.CT_Name }</option>
								</S:if>
								<S:if test="${!userInfo.CT_ID.equals(cdtList.CT_ID) }">
									<option value="${cdtList.CT_ID }">${cdtList.CT_Name }</option>
								</S:if>
								</S:forEach></select></li> 
  <li><span>证件号：</span><input type="text" name="userCNum" value="${userInfo.u_CredentialNum }" /></li> 
  <li><span>邮箱：</span><input type="text" name="userEmail" value="${userInfo.u_Email }" /></li> 
 
 
</ul> 

<p><input type="submit" value="提交修改" ></p> 
</div>
</form>


	
	



</div>



</BODY>
</HTML>
