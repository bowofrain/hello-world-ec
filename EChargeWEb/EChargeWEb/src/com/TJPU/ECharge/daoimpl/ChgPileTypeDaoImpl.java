package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.ChgPileTypeDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.T_ChgPileType;

public class ChgPileTypeDaoImpl implements ChgPileTypeDao {

	public DBHelp DB;
	public ChgPileTypeDaoImpl(){
		DB=new DBHelp();
	}
	
	@Override
	public List<T_ChgPileType> AllChgPileType() {
		// TODO Auto-generated method stub
		
		List<T_ChgPileType> tChgPileType=new ArrayList<T_ChgPileType>();
		String sql="SELECT * FROM t_chgpiletype";
		try {
			ResultSet rs=DB.select(sql);
			while(rs.next()){
				tChgPileType.add(
						new T_ChgPileType(
								rs.getString("CPT_ID"),
								rs.getBoolean("CPT_CurrentType"),
								rs.getInt("CPT_ChgGun"),
								rs.getInt("CPT_PortType"),
								rs.getTimestamp("CPT_Time")
								
						
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tChgPileType;
	}

}
