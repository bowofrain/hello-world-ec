package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;

public interface ChgPileBiz {

	public boolean AddChgPile(T_ChgPile tChgPile);    //添加新的充电桩
	public List<T_ChgPile> AllChgPile(Page page);      //查询所有充电桩列表
 	public int AllChgPileCount();            //得到所有充电桩的数目
 	public T_ChgPile ChgPileInfo(String CPID);    //根据充电桩编号得到充电桩具体信息
 	public boolean UpdateChgPile(T_ChgPile tChgPile);     //更新充电桩信息
 	public boolean DeleteChgPile(String CPID);             //删除指定的充电桩
 	
 	
}
