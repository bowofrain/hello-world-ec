package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public interface BookingBiz {

	public List<T_Booking> userBookingList(String username,Page page);  //�õ��û�ԤԼ��¼�б�
	public int userBookingCount(String username);     //�õ��û�ԤԼ��¼����
	
	
}
