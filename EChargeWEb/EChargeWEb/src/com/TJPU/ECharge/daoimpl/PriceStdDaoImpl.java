package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.PriceStdDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.T_PriceStd;

public class PriceStdDaoImpl implements PriceStdDao {

	public DBHelp DB;
	public PriceStdDaoImpl(){
		DB=new DBHelp();
	}
	@Override
	public List<T_PriceStd> AllPriceStd() {
		// TODO Auto-generated method stub
		List<T_PriceStd> tPriceStd=new ArrayList<T_PriceStd>();
		String sql="SELECT * FROM t_pricestd";
		try {
			ResultSet rs=DB.select(sql);
			while(rs.next()){
				tPriceStd.add(
						new T_PriceStd(
								rs.getInt("FS_ID"),
								rs.getFloat("FS_Std"),
								rs.getTimestamp("FS_Date"),
								rs.getString("O_ID")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tPriceStd;
	}

}
