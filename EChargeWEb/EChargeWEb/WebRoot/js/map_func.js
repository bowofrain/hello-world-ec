function getAroundECharge(myValue){
		var myGeo = new BMap.Geocoder();
	// 将地址解析结果显示在地图上,并调整地图视野
		myGeo.getPoint(myValue, function(point){
		if (point) {
			map.centerAndZoom(point, 15);
			map.addOverlay(new BMap.Marker(point));
			var circle = new BMap.Circle(point,1000,{fillColor:"blue", strokeWeight: 1 ,fillOpacity: 0, strokeOpacity: 1});
    map.addOverlay(circle);
    var local =  new BMap.LocalSearch(map, {renderOptions: {map: map, autoViewport: false}});  
    local.searchNearby('餐馆',point,1000);
		}else{
			alert("您选择地址没有解析到结果!");
		}
	}, "天津市");
}
/*
 * 获得位置的经纬度
 * @param 字符串 位置的文字描述
 * @return 位置的点 .lng .lat
 */
function toStartPoint(position) {
	// 创建地址解析器实例
	var myGeo = new BMap.Geocoder();
	// 将地址解析结果显示在地图上,并调整地图视野
 	myGeo.getPoint(position, function(point){
		if (point) {
			global.startPoint = point;
			console.log(global.startPoint.lng + "," + global.endPoint.lat)
		}else{
			alert("您选择地址没有解析到结果!");
		}
	}, "天津市");
}
function toEndPoint(position) {
	// 创建地址解析器实例
	var myGeo = new BMap.Geocoder();
	// 将地址解析结果显示在地图上,并调整地图视野
 	myGeo.getPoint(position, function(point){
		if (point) {
			global.endPoint = point;
			global.getPoint = true;
		}else{
			alert("您选择地址没有解析到结果!");
		}
	}, "天津市");
}


