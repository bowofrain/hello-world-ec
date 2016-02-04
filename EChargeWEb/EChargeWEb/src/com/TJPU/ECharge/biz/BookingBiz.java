package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public interface BookingBiz {

	public List<T_Booking> userBookingList(String username,Page page);  //得到用户预约记录列表
	public int userBookingCount(String username);     //得到用户预约记录数量
	
	
}
