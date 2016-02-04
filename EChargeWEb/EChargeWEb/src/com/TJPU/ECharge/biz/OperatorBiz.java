package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public interface OperatorBiz {
	
	public T_Operator Login(String username, String password);    //客服登录
	public boolean AddOperator(T_Operator tOperator);    //添加新的客服
	public List<T_Operator> AllOperator(Page page);		//得到所有客服列表
	public int OperatorCount();       //得到客服的数量
	public T_Operator OperatorInfo(String OID);      //根据工号查询客服的所有信息
	public boolean UpdateOperator(T_Operator tOperator);    //修改客服资料
	public boolean DeleteOperator(String OId);           //删除客服

}
