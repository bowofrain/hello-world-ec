package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public interface OperatorDao {

	public T_Operator Login(String username,String password);  //客服的登陆验证
	public int AddOperator(T_Operator tOperator);     //添加新的客服进数据库
	public List<T_Operator> AllOperator(Page page);   //获得所有客服信息
	public int OperatorCount();			//获得客服总数
	public T_Operator OperatorInfo(String OID);       //根据工号查询客服信息
	public int UpdateOperator(T_Operator tOperator);     //修改客服的信息进数据库
	public int DeleteOperator(String OId);      //删除客服
	
	
}
