package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public interface BookingDao {

	public List<T_Booking> userBookingList(String username,Page page);  //�õ��û�Ԥ���б�
	public int userBookingCount(String username);    //�õ��û���Ԥ��������
	
}
