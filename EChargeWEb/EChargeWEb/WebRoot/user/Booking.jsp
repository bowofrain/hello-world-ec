<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="S" %>
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
<LINK rel="stylesheet" href="../css/dingdan.css"> 
<script src="../js/jquery.js"></script> 
<script src="../js/hm.js"></script> 
<script src="../js/jquery-1.11.0"></script>

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
	
	
	
<div class="cont_right">
<h2><span>我的预约记录</span></h2> 
<ul> 
<li class="li_title"> 

<span class="span_1">流水单号</span>
<span class="span_3">押金</span>
<span class="span_14">开始时间</span>
<span class="span_15">结束时间</span> 
<span class="span_3">消费金额</span>
<span class="span_9">结束类型</span> 
<span class="span_7 border_none">操作</span> 
</li>
<S:forEach var="bkList" items="${bookingList }">
<li class="li_title"> 

<span class="span_1">${bkList.b_ID }</span>
<span class="span_3">${bkList.b_Deposit }</span>
<span class="span_4">&nbsp;&nbsp;&nbsp;&nbsp;${bkList.b_Time }</span>
<span class="span_5">&nbsp;&nbsp;&nbsp;&nbsp;${bkList.b_EndTime }</span> 
<span class="span_3">${bkList.b_Spend }</span>
<span class="span_9">${bkList.b_EndType }</span> 
<span class="span_7 border_none">详情</span> 
</li>
</S:forEach>
</ul> 
<div class="page">
<span style=" margin: 0 auto;overflow: hidden; display:inline-block;">
<S:if test="${bookingList.size()!=0 }">
<a href="UserBookingList?page=1" >首页</a>
<a href="UserBookingList?page=${pageInfo.prePage }" >上一页</a>
<a href="UserBookingList?page=${pageInfo.nextPage }" >下一页</a>
<a href="UserBookingList?page=${pageInfo.totalNumber }" >尾页</a>  
 <a>当前 ${pageInfo.curPage }页/总共${pageInfo.totalNumber } 页</a></S:if>
</span>
</div> 

</div>

	
	


</div>



</BODY>
</HTML>