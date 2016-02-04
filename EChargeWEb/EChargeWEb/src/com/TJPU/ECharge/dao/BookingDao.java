package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public interface BookingDao {

	public List<T_Booking> userBookingList(String username,Page page);  //得到用户预订列表
	public int userBookingCount(String username);    //得到用户的预订单数量
	
}
