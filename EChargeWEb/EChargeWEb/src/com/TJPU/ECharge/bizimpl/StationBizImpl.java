package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.StationBiz;
import com.TJPU.ECharge.dao.StationDao;
import com.TJPU.ECharge.daoimpl.StationDaoImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Station;

public class StationBizImpl implements StationBiz {

	StationDao dao=new StationDaoImpl();
	
	@Override
	public boolean AddStation(T_Station tStation) {
		// TODO Auto-generated method stub
		int temp=dao.AddStation(tStation);
		if(temp>0){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<T_Station> AllStation(Page page) {
		// TODO Auto-generated method stub
		return dao.AllStation(page);
	}
	public List<T_Station> AllStation() {
		// TODO Auto-generated method stub
		return dao.AllStation();
	}

	@Override
	public int AllStationCount() {
		// TODO Auto-generated method stub
		return dao.AllStationCount();
	}

	@Override
	public T_Station StationInfo(String SID) {
		// TODO Auto-generated method stub
		return dao.StationInfo(SID);
	}

	@Override
	public boolean UpdateStation(T_Station tStation) {
		// TODO Auto-generated method stub
		int temp=dao.UpdateStation(tStation);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean DeleteStation(String SID) {
		// TODO Auto-generated method stub
		int temp=dao.DeleteStation(SID);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

}
