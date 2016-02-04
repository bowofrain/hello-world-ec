$().ready(function () {
	var $header = $("#header"),
	 $container1 = $('#container1'),
	 $container2 = $('#container2'),
	 $HowU_part1 = $('#HowU-part1'),
	 $HowU_part2 = $('#HowU-part2'),
	 $HowU_part3 = $('#HowU-part3');
	 
	addAnimate([
		
		$container2,
		$HowU_part1,
		$HowU_part2,
		$HowU_part3,
		$container1
	]);
	
	$(window).scroll(function () {
		var winPos = $(document).scrollTop();
		if(winPos > 0){
			$header.removeClass('top-nav');
		}
		else{
			$header.addClass('top-nav');
		}
	})
	/*
	 * 取得元素至网页最顶端的距离
	 * @param  obj:元素节点
	 * @return  obj值页面顶端的距离
	 */
	function getScollToTop(obj){
		var winPos = $(window).scrollTop();
		var top = obj.offset().top;
		return top - winPos;
	}
	/*
	 * 为每个元素添加动画效果
	 * @param 一个数组, 数组元素为需要添加效果的元素
	 * @return 
	 */
	function addAnimate(obj){
		
		
		for(i in obj){
			obj[i].children().hide();
		}
		$(window).scroll(function () {
			
			for(i in obj){
				if( getScollToTop(obj[i]) < 500 ){
					obj[i].children().fadeIn(600);			
				}
			}
		});
		
	}
});