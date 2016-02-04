package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public interface OperatorDao {

	public T_Operator Login(String username,String password);  //�ͷ��ĵ�½��֤
	public int AddOperator(T_Operator tOperator);     //����µĿͷ������ݿ�
	public List<T_Operator> AllOperator(Page page);   //������пͷ���Ϣ
	public int OperatorCount();			//��ÿͷ�����
	public T_Operator OperatorInfo(String OID);       //���ݹ��Ų�ѯ�ͷ���Ϣ
	public int UpdateOperator(T_Operator tOperator);     //�޸Ŀͷ�����Ϣ�����ݿ�
	public int DeleteOperator(String OId);      //ɾ���ͷ�
	
	
}
