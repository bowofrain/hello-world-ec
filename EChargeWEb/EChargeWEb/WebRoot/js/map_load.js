function GetRequest() {
   var url = location.search; //获取url中"?"符后的字串
   var theRequest = new Object();
   if (url.indexOf("?") != -1) {
      var str = url.substr(1);
      strs = str.split("&");
      for(var i = 0; i < strs.length; i ++) {
         theRequest[strs[i].split("=")[0]]=unescape(strs[i].split("=")[1]);
      }
   }
   else{
   	theRequest = "no";
   }
   return theRequest;
}

function getcenter() {
	var request = GetRequest();
	if(request["lng"] && request["lng"] != 0){
		var point = new BMap.Point(request["lng"], request["lat"]);
		map.centerAndZoom(point, 16);
		map.addOverlay(new BMap.Marker(point));
		var circle = new BMap.Circle(point,1000,{fillColor:"blue", strokeWeight: 1 ,fillOpacity: 0, strokeOpacity: 1});
    	map.addOverlay(circle);
    	var local =  new BMap.LocalSearch(map, {renderOptions: {map: map, autoViewport: false}});  
    	local.searchNearby('餐馆',point,1000);
    	setTimeout( function () {map.removeOverlay(circle)}, 4000)
		return;
	}
	else if(request["lng"] && request["lng"] == 0){
		alert("您输入了无效地址, 请在旁重新输入");
		
	}
	map.centerAndZoom("天津", 16);
}
