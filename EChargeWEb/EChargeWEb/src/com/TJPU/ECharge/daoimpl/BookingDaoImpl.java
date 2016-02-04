package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.BookingDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;

public class BookingDaoImpl implements BookingDao {

	private DBHelp DB;
	public BookingDaoImpl(){
		DB=new DBHelp();
	}
	
	@Override
	public List<T_Booking> userBookingList(String username,Page page) {
		// TODO Auto-generated method stub
		String sql="SELECT t_booking.B_ID,t_booking.B_Time,t_booking.B_Deposit,t_booking.B_EndTime,t_booking.B_EndType,t_booking.B_Spend FROM t_booking WHERE t_booking.U_ID =? limit ?,?";
		List<T_Booking> BookingList=new ArrayList<T_Booking>();
		try {
			ResultSet rs=DB.select(sql, username,page.getSelectIndex(),page.getShowNumber());
			while (rs.next()) {
				BookingList.add(
						new T_Booking(
								rs.getString("B_ID"), 
								rs.getTimestamp("B_Time"), 
								rs.getFloat("B_Deposit"), 
								rs.getTimestamp("B_EndTime"), 
								rs.getShort("B_EndType"),
								rs.getFloat("B_Spend")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return BookingList;
	}

	@Override
	public int userBookingCount(String username) {
		// TODO Auto-generated method stub
		String sql="SELECT count(*) FROM t_chglog WHERE t_chglog.U_ID =? ";
		int temp=0;
		try {
			ResultSet rs=DB.select(sql,username);
			if(rs.next()){
				temp=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}

}
