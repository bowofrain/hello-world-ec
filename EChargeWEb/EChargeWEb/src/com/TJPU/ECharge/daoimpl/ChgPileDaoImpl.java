package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.ChgPileDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;
import com.TJPU.ECharge.vo.T_PriceStd;

public class ChgPileDaoImpl implements ChgPileDao {

	public DBHelp DB;
	public ChgPileDaoImpl(){
		DB=new DBHelp();
	}
	@Override
	public int AddChgPile(T_ChgPile tChgPile) {
		// TODO Auto-generated method stub
		String sql="insert into t_chgpile(t_chgpile.CP_ID,t_chgpile.CP_SerialNumber,t_chgpile.CP_Longitude,t_chgpile.CP_Latitude,t_chgpile.CP_State,t_chgpile.CP_Time,t_chgpile.FS_ID,t_chgpile.CPT_ID,t_chgpile.S_ID,t_chgpile.O_ID) values (?,?,?,?,?,?,?,?,?,?)";
		int temp=-1;
		try {
			temp=DB.update(sql,tChgPile.getCP_ID(),tChgPile.getCP_SerialNumber(),tChgPile.getCP_Longitude(),tChgPile.getCP_Latitude(),tChgPile.getCP_State(),new Timestamp(tChgPile.getCP_Time().getTime()),tChgPile.getT_PriceStd().getFS_ID(),tChgPile.getCPT_ID(),tChgPile.getS_ID(),tChgPile.getO_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
	
	@Override
	public List<T_ChgPile> AllChgPile(Page page) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_chgpile limit ?,?";
		List<T_ChgPile> cpList=new ArrayList<T_ChgPile>();
		try {
			ResultSet rs=DB.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				T_ChgPile tChgPile=new T_ChgPile();
				
				tChgPile.setCP_ID(rs.getString("CP_ID"));
				tChgPile.setCP_Latitude(rs.getBigDecimal("CP_Latitude"));
				tChgPile.setCP_Longitude(rs.getBigDecimal("CP_Longitude"));
				
				T_PriceStd tPriceStd=new T_PriceStd();
				tPriceStd.setFS_ID(rs.getInt("FS_ID"));
				tChgPile.setT_PriceStd(tPriceStd);
				
				tChgPile.setCP_SerialNumber(rs.getString("CP_SerialNumber"));
				tChgPile.setCP_State(rs.getShort("CP_State"));
				tChgPile.setCP_Time(rs.getTimestamp("CP_Time"));
				tChgPile.setCPT_ID(rs.getString("CPT_ID"));
				tChgPile.setO_ID(rs.getString("O_ID"));
				tChgPile.setS_ID(rs.getString("S_ID"));
				
				cpList.add(tChgPile);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cpList;
	}
	@Override
	public int AllChgPileCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from t_chgpile";
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
	public T_ChgPile ChgPileInfo(String CPID) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_chgpile where CP_ID=?";
		
		T_ChgPile tChgPile=new T_ChgPile();
		try {
			ResultSet rs=DB.select(sql,CPID);
			if(rs.next()){
				tChgPile.setCP_ID(rs.getString("CP_ID"));
				tChgPile.setCP_Latitude(rs.getBigDecimal("CP_Latitude"));
				tChgPile.setCP_Longitude(rs.getBigDecimal("CP_Longitude"));
				
				T_PriceStd tPriceStd=new T_PriceStd();
				tPriceStd.setFS_ID(rs.getInt("FS_ID"));
				tChgPile.setT_PriceStd(tPriceStd);
				
				tChgPile.setCP_SerialNumber(rs.getString("CP_SerialNumber"));
				tChgPile.setCP_State(rs.getShort("CP_State"));
				tChgPile.setCP_Time(rs.getTimestamp("CP_Time"));
				tChgPile.setCPT_ID(rs.getString("CPT_ID"));
				tChgPile.setO_ID(rs.getString("O_ID"));
				tChgPile.setS_ID(rs.getString("S_ID"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tChgPile;
	}
	@Override
	public int UpdateChgPile(T_ChgPile tChgPile) {
		// TODO Auto-generated method stub
		String sql="update t_chgpile set t_chgpile.CP_SerialNumber=?,t_chgpile.CP_Longitude=?,t_chgpile.CP_Latitude=?,t_chgpile.CP_State=?,t_chgpile.FS_ID=?,t_chgpile.CPT_ID=?,t_chgpile.S_ID=?,t_chgpile.O_ID=? where t_chgpile.CP_ID=? ";
		int temp=-1;
		try {
			temp=DB.update(sql,tChgPile.getCP_SerialNumber(),tChgPile.getCP_Longitude(),tChgPile.getCP_Latitude(),tChgPile.getCP_State(),tChgPile.getT_PriceStd().getFS_ID(),tChgPile.getCPT_ID(),tChgPile.getS_ID(),tChgPile.getO_ID(),tChgPile.getCP_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}
	@Override
	public int DeleteChgPile(String CPID) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM t_chgpile WHERE t_chgpile.CP_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql,CPID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	
}
