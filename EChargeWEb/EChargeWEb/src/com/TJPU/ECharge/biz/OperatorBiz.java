package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public interface OperatorBiz {
	
	public T_Operator Login(String username, String password);    //�ͷ���¼
	public boolean AddOperator(T_Operator tOperator);    //����µĿͷ�
	public List<T_Operator> AllOperator(Page page);		//�õ����пͷ��б�
	public int OperatorCount();       //�õ��ͷ�������
	public T_Operator OperatorInfo(String OID);      //���ݹ��Ų�ѯ�ͷ���������Ϣ
	public boolean UpdateOperator(T_Operator tOperator);    //�޸Ŀͷ�����
	public boolean DeleteOperator(String OId);           //ɾ���ͷ�

}
