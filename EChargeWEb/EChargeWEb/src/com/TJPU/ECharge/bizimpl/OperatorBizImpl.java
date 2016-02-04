package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.OperatorBiz;
import com.TJPU.ECharge.dao.OperatorDao;
import com.TJPU.ECharge.daoimpl.OperatorDaoImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public class OperatorBizImpl implements OperatorBiz {

	OperatorDao dao=new OperatorDaoImpl();
	
	
	@Override
	public T_Operator Login(String username, String password) {
		// TODO Auto-generated method stub
		return dao.Login(username, password);
	}


	@Override
	public boolean AddOperator(T_Operator tOperator) {
		// TODO Auto-generated method stub
		int temp=dao.AddOperator(tOperator);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public List<T_Operator> AllOperator(Page page) {
		// TODO Auto-generated method stub
		return dao.AllOperator(page);
	}


	@Override
	public int OperatorCount() {
		// TODO Auto-generated method stub
		return dao.OperatorCount();
	}


	@Override
	public T_Operator OperatorInfo(String OID) {
		// TODO Auto-generated method stub
		return dao.OperatorInfo(OID);
	}


	@Override
	public boolean UpdateOperator(T_Operator tOperator) {
		// TODO Auto-generated method stub
		int temp=dao.UpdateOperator(tOperator);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public boolean DeleteOperator(String OId) {
		// TODO Auto-generated method stub
		int temp=dao.DeleteOperator(OId);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

}
