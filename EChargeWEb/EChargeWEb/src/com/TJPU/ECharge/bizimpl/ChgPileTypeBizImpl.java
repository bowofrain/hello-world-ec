package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.ChgPileTypeBiz;
import com.TJPU.ECharge.dao.ChgPileTypeDao;
import com.TJPU.ECharge.daoimpl.ChgPileTypeDaoImpl;
import com.TJPU.ECharge.vo.T_ChgPileType;

public class ChgPileTypeBizImpl implements ChgPileTypeBiz {

	ChgPileTypeDao dao=new ChgPileTypeDaoImpl();
	
	@Override
	public List<T_ChgPileType> AllChgPileTypeList() {
		// TODO Auto-generated method stub
		List<T_ChgPileType> tChgPileType=dao.AllChgPileType();
		return tChgPileType;
	}

}
