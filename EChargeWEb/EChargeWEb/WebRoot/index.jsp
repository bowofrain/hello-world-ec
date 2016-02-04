<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<title>ECharge</title>
		<link href="css/common.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=vT1RWxEYdCqu1fID3fFp7gZp"></script>
		<script type="text/javascript" src="js/map_autoComplete.js" ></script>
	</head>

	<body>
		<nav id="header" class="top-nav">
			<img src="img/logo.png" alt="ECharge的logo" />
			<ul>
				<li><a href="map.html">看看附近的充电桩</a></li>
				<li class="cut">|</li>
				<li><a href="login.jsp">登录</a></li>
				<li class="cut">|</li>
				<li><a href="register.jsp">注册</a></li>
			</ul>
		</nav>
		<div id="main">
			<!--nav start-->
			<!--<nav id="header" class="nav navbar-default navbar-fixed-top navbar-collapse top-nav" role="navigation">
			<div class="navbar-header">
				<a id="logo" class="navbar-brand" title="ECharge首页" target="_self"><img src="" title="ECharge首页" alt="ECharge的logo"/></a>
			</div>
			<div class="collapse navbar-collapse navbar-right"  id="nav-ul">
				<ul class="nav navbar-nav" >
					<li><a href="#">地图</a></li>
					<li><a href="#">地图</a></li>
					<li><a href="#">地图</a></li>
					<li><a href="#">地图</a></li>
					
				</ul>
			</div>
		</nav>-->

			<!--nav end-->
			<!--title start-->
			<div class="top">
				<div class="search_div">
					<div class="searchHome">

						<input type="text" placeholder="搜搜附近有没有充电桩.." name="home" id="home"><span class="glyphicon glyphicon-search search-icon"></span>

					</div>
				</div>
				<!--<div >
				<h1 id="top-title" title="您身边的新能源汽车充电专家" alt="ECharge标题">ECharge充电桩</h1>
			</div>
			
			
			<div >
				<p class="top-content-title">您身边的新能源汽车充电桩专家</p>
				
				<p class="top-content">
					ECharge布满天津, 拥有xxx充电站, yyy啥子充电桩, zzz啥子充电桩
				</p>
				
			</div>-->

			</div>
			<!--title end-->
			<div class="App screen">
				<div>
					<h1 id="top-title" title="您身边的新能源汽车充电专家" alt="ECharge标题">ECharge充电桩</h1>
				</div>
				<div>
					<div class="top-content">
						<p class="top-content-title">您身边的新能源汽车充电桩专家</p>
					</div>	
						<div class="down">
							<div class="erweima">
								<img src="img/erweima2.jpg">
									<p class="todown">扫描下载</p>
									<br/>
									<p class="description">Android App </p>
							</div>
							<img src="img/how4.png" class="ad">
						
						</div>
					
					
				</div>
			</div>
			<div class="Apptitle">
				<p>App使用教程</p>
			</div>
			<!--HowU-part1 start-->
			<div class="screen HowU" id="HowU-part1">
				<div class="HowU-image">
					<img src="img/how1.png" title="使用教程第一步" alt="使用示例图">
				</div>
				<div class="HowU-text">
					<h3>第一步(请具体一些)</h3>
					<p>对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程,
					</p>
				</div>
			</div>
			<!--HowU-part1 end-->
			<div class="screen HowU" id="HowU-part2">

				<div class="HowU-text">
					<h3>第一步(请具体一些)</h3>
					<p>对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程,
					</p>
				</div>
				<div class="HowU-image">
					<img src="img/how2.png" title="使用教程第一步" alt="使用示例图">
				</div>
			</div>
			<!--HowU-part1 end-->
			<div class="screen HowU" id="HowU-part3">
				<div class="HowU-image">
					<img src="img/how3.png" title="使用教程第一步" alt="使用示例图">
				</div>
				<div class="HowU-text">
					<h3>第一步(请具体一些)</h3>
					<p>对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程, 对用户的第一步教程,对用户的第一步教程,对用户的第一步教程,
					</p>
				</div>

			</div>
			<!--HowU-part1 end-->
			<!--container2 start-->
			<div class="screen" id="container2">
				<div class="introduce-service introduce">
					<h2>我们的服务</h2>
					<div class="service" id="service1">
						<h3>站点遍布天津</h3>

						<img src="img/map_beijing.png" title="站点遍布天津" alt="天津地图" />
						<p>为了您的方便着想,我们的站点遍布天津,不用再为充电烦恼</p>
					</div>
					<div class="service" id="service1">
						<h3>站点遍布天津</h3>

						<img src="img/map_beijing.png" title="站点遍布天津" alt="天津地图" />
						<p>为了您的方便着想,我们的站点遍布天津,不用再为充电烦恼</p>
					</div>
					<div class="service" id="service1">
						<h3>站点遍布天津</h3>

						<img src="img/map_beijing.png" title="站点遍布天津" alt="天津地图" />
						<p>为了您的方便着想,我们的站点遍布天津,不用再为充电烦恼</p>
					</div>
					<div class="service" id="service1">
						<h3>站点遍布天津</h3>

						<img src="img/map_beijing.png" title="站点遍布天津" alt="天津地图" />
						<p>为了您的方便着想,我们的站点遍布天津,不用再为充电烦恼</p>
					</div>

				</div>
			</div>
			<!--container2 end-->
			<!--container1 start-->
			<div class="screen " id="container1">
				<div class="introduce-company introduce ">
					<h2>企业介绍</h2>
					<p>关于我们关于我们关于我们关于我们关于我们关于我们关于我们关于我们 关于我们关于我们关于我们 关于我们关于我们 关于我们关于我们关于我们关于我们
					</p>

				</div>
			</div>
			<!--container1 end-->
			<!--container3 start-->

			<!--footer end-->
			<div class="footer">
				<div class="footer-main">
					<div class="footer-container">
						<h3>关于我们</h3>
						<li><a href="#" title="">最新动态</a></li>
						<li><a href="#" title="">投诉建议</a></li>
						<li><a href="#" title="">联系我们</a></li>
						<li><a href="#" title="">关于我们</a></li>
					</div>
					<div class="footer-container">
						<h3>关于我们</h3>
						<li><a href="#" title="">最新动态</a></li>
						<li><a href="#" title="">投诉建议</a></li>
						<li><a href="#" title="">联系我们</a></li>
						<li><a href="#" title="">关于我们</a></li>
					</div>
					<div class="footer-container">
						<h3>联系我们</h3>
						<li><a href="#" title="">电话：400-655-6620</a></li>
						<li><a href="#" title="">网址：www.huashangsanyou.com</a></li>
						<li><a href="#" title="">邮箱：hssy@huashangsanyou.com</a></li>
						<li><a href="#" title="">地址：北京市通州区经济开发区东区<br>创益东路9号华商产业园</a></li>
					</div>
					<div class="footer-container bottom-erweima">

						<div class="bottom-erweima-part">
							<img src="img/erweima1.png" title="anroid App 下载" alt="android App 二维码">
							<br/>
							<p>android App</p>
						</div>

					</div>

				</div>
				<!--footer end-->
			</div>
			<script src="js/jquery-1.11.0.js" type="text/javascript">
			</script>

			<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
			<script src="js/index.js"></script>
			<!--script end-->
			<script>
		window.onload = function () {
			var home = document.getElementById('home');
			home.onkeydown = function (e){
				if(e.which == 13)
				myGeo.getPoint(this.value, function(point){
				if (point) {
					var param = "?lng=" + point.lng + "&" + "lat=" + point.lat;
					window.location.href = "map.html" + param;
				}else{
					var param = "?lng=0";
					window.location.href = "map.html" + param;
				}
				}, "天津市");
			}
		}
			var myGeo = new BMap.Geocoder();
	// 将地址解析结果显示在地图上,并调整地图视野
	
		</script>
	</body>

</html>
