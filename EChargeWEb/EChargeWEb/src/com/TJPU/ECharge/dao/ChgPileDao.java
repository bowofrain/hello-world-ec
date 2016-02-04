package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;

public interface ChgPileDao {

	public int AddChgPile(T_ChgPile tChgPile);  //����µĳ��׮
	public List<T_ChgPile> AllChgPile(Page page);      //�õ����г��׮�б�
	public int AllChgPileCount();        //�õ����г��׮��Ŀ
	public T_ChgPile ChgPileInfo(String CPID);    //���ݳ��׮��ŵõ����׮��������Ϣ
	public int UpdateChgPile(T_ChgPile tChgPile);         //�޸ĳ��׮��Ϣ
	public int DeleteChgPile(String CPID);           //ɾ��ָ���ĳ��׮
	
}
