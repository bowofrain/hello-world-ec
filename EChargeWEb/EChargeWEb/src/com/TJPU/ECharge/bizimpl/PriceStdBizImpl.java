package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.PriceStdBiz;
import com.TJPU.ECharge.dao.PriceStdDao;
import com.TJPU.ECharge.daoimpl.PriceStdDaoImpl;
import com.TJPU.ECharge.vo.T_PriceStd;

public class PriceStdBizImpl implements PriceStdBiz {

	PriceStdDao dao=new PriceStdDaoImpl();
	
	@Override
	public List<T_PriceStd> AllPriceStd() {
		// TODO Auto-generated method stub
		return dao.AllPriceStd();
	}

}
