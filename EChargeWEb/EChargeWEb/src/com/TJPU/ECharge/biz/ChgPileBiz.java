package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;

public interface ChgPileBiz {

	public boolean AddChgPile(T_ChgPile tChgPile);    //����µĳ��׮
	public List<T_ChgPile> AllChgPile(Page page);      //��ѯ���г��׮�б�
 	public int AllChgPileCount();            //�õ����г��׮����Ŀ
 	public T_ChgPile ChgPileInfo(String CPID);    //���ݳ��׮��ŵõ����׮������Ϣ
 	public boolean UpdateChgPile(T_ChgPile tChgPile);     //���³��׮��Ϣ
 	public boolean DeleteChgPile(String CPID);             //ɾ��ָ���ĳ��׮
 	
 	
}
