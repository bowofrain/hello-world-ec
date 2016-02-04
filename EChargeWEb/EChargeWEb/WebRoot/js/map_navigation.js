function pointNavigation (startPoint, endPoint) {
	var p1 = new BMap.Point(startPoint.lng, startPoint.lat);
	var p2 = new BMap.Point(endPoint.lng, endPoint.lat);
	
	var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true,enableDragging : true //起终点可进行拖拽
	}});
	driving.search(p1, p2);
}

function textNavigation (start, end) {
var routePolicy = [BMAP_DRIVING_POLICY_LEAST_TIME,BMAP_DRIVING_POLICY_LEAST_DISTANCE,BMAP_DRIVING_POLICY_AVOID_HIGHWAYS];
	$("#getWay").click(function(){
		map.clearOverlays(); 
		var i=$("#driving_way select").val();
		search(start,end,routePolicy[i]); 
		function search(start,end,route){ 
			var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true},policy: route});
			driving.search(start,end);
		}
	});
}