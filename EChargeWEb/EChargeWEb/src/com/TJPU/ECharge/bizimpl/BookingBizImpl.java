package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.BookingBiz;
import com.TJPU.ECharge.dao.BookingDao;
import com.TJPU.ECharge.daoimpl.BookingDaoImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public class BookingBizImpl implements BookingBiz {

	BookingDao dao=new BookingDaoImpl();

	
	
	@Override
	public List<T_Booking> userBookingList(String username, Page page) {
		// TODO Auto-generated method stub
		return dao.userBookingList(username, page);
	}



	@Override
	public int userBookingCount(String username) {
		// TODO Auto-generated method stub
		return dao.userBookingCount(username);
	}

}
