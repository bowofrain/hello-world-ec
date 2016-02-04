package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.StationDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;
import com.TJPU.ECharge.vo.T_Station;

public class StationDaoImpl implements StationDao {

	public DBHelp DB;
	public StationDaoImpl(){
		DB=new DBHelp();
	}
	
	@Override
	public int AddStation(T_Station tStation) {
		// TODO Auto-generated method stub
		String sql="insert into t_station(t_station.S_ID,t_station.S_Name,t_station.S_Longitude,t_station.S_Latitude,t_station.S_Address,t_station.S_Memo,t_station.S_Date,t_station.O_ID) values (?,?,?,?,?,?,?,?)";
		int temp=-1;
		try {
			temp=DB.update(sql,tStation.getS_ID(),tStation.getS_Name(),tStation.getS_Longitude(),tStation.getS_Latitude(),tStation.getS_Address(),tStation.getS_Memo(),new Timestamp(tStation.getS_Date().getTime()),tStation.getO_ID().getO_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List<T_Station> AllStation(Page page) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_station limit ?,?";
		List<T_Station> sList=new ArrayList<T_Station>();
		try {
			ResultSet rs=DB.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				T_Station tStation=new T_Station();
				tStation.setS_ID(rs.getString("S_ID"));
				tStation.setS_Name(rs.getString("S_Name"));
				tStation.setS_Longitude(rs.getBigDecimal("S_Longitude"));
				tStation.setS_Latitude(rs.getBigDecimal("S_Latitude"));
				tStation.setS_Address(rs.getString("S_Address"));
				tStation.setS_Memo(rs.getString("S_Memo"));
				tStation.setS_Date(rs.getTimestamp("S_Date"));
				
				T_Operator tOperator=new T_Operator();
				tOperator.setO_ID(rs.getString("O_ID"));
				tStation.setO_ID(tOperator);
				
				String sql1="SELECT count(*) FROM t_chgpile WHERE t_chgpile.S_ID=? ";
				int temp=0;
				ResultSet rs2=DB.select(sql1,tStation.getS_ID());
				if(rs2.next()){
					temp=rs2.getInt(1);
				}
				tStation.setChgPileCount(temp);
				
				sList.add(tStation);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<T_Station> AllStation() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_station";
		List<T_Station> sList=new ArrayList<T_Station>();
		try {
			ResultSet rs=DB.select(sql);
			while(rs.next()){
				T_Station tStation=new T_Station();
				tStation.setS_ID(rs.getString("S_ID"));
				tStation.setS_Name(rs.getString("S_Name"));
				tStation.setS_Longitude(rs.getBigDecimal("S_Longitude"));
				tStation.setS_Latitude(rs.getBigDecimal("S_Latitude"));
				tStation.setS_Address(rs.getString("S_Address"));
				tStation.setS_Memo(rs.getString("S_Memo"));
				tStation.setS_Date(rs.getTimestamp("S_Date"));
				T_Operator tOperator=new T_Operator();
				tOperator.setO_ID(rs.getString("O_ID"));
				tStation.setO_ID(tOperator);
				
				String sql1="SELECT count(*) FROM t_chgpile WHERE t_chgpile.S_ID=? ";
				int temp=0;
				ResultSet rs2=DB.select(sql1,tStation.getS_ID());
				if(rs2.next()){
					temp=rs2.getInt(1);
				}
				tStation.setChgPileCount(temp);
				
				sList.add(tStation);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sList;
	}
	@Override
	public int AllStationCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from t_station";
		int temp=0;
		try {
			ResultSet rs=DB.select(sql);
			if(rs.next()){
				temp=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public T_Station StationInfo(String SID) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_station where S_ID=?";
		T_Station tStation=new T_Station();
		try {
			ResultSet rs=DB.select(sql,SID);
			if(rs.next()){
				tStation.setS_ID(rs.getString("S_ID"));
				tStation.setS_Name(rs.getString("S_Name"));
				tStation.setS_Longitude(rs.getBigDecimal("S_Longitude"));
				tStation.setS_Latitude(rs.getBigDecimal("S_Latitude"));
				tStation.setS_Address(rs.getString("S_Adress"));
				tStation.setS_Memo(rs.getString("S_Memo"));
				tStation.setS_Date(rs.getTimestamp("S_Date"));
				T_Operator tOperator=new T_Operator();
				tOperator.setO_ID(rs.getString("O_ID"));
				tStation.setO_ID(tOperator);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tStation;
	}

	@Override
	public int UpdateStation(T_Station tStation) {
		// TODO Auto-generated method stub
		String sql="update t_station set t_station.S_Name=?,t_station.S_Longitude=?,t_station.S_Latitude=?,t_station.S_Adress=?,t_station.S_Memo=?,t_station.O_ID=? where t_station.S_ID=? ";
		int temp=-1;
		try {
			temp=DB.update(sql,tStation.getS_Name(),tStation.getS_Longitude(),tStation.getS_Latitude(),tStation.getS_Address(),tStation.getS_Memo(),tStation.getO_ID().getO_ID(),tStation.getS_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int DeleteStation(String SID) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM t_station WHERE t_station.S_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql,SID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
