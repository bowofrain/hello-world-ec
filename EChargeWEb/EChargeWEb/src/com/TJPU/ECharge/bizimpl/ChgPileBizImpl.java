package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.ChgPileBiz;
import com.TJPU.ECharge.dao.ChgPileDao;
import com.TJPU.ECharge.daoimpl.ChgPileDaoImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;

public class ChgPileBizImpl implements ChgPileBiz {

	ChgPileDao dao=new ChgPileDaoImpl();

	@Override
	public boolean AddChgPile(T_ChgPile tChgPile) {
		// TODO Auto-generated method stub
		int temp=dao.AddChgPile(tChgPile);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public List<T_ChgPile> AllChgPile(Page page) {
		// TODO Auto-generated method stub
		return dao.AllChgPile(page);
	}

	@Override
	public int AllChgPileCount() {
		// TODO Auto-generated method stub
		return dao.AllChgPileCount();
	}

	@Override
	public T_ChgPile ChgPileInfo(String CPID) {
		// TODO Auto-generated method stub
		return dao.ChgPileInfo(CPID);
	}

	@Override
	public boolean UpdateChgPile(T_ChgPile tChgPile) {
		// TODO Auto-generated method stub
		int temp=dao.UpdateChgPile(tChgPile);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean DeleteChgPile(String CPID) {
		// TODO Auto-generated method stub
		int temp=dao.DeleteChgPile(CPID);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}
	
}
