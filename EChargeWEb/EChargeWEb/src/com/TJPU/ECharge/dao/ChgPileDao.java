package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_ChgPile;

public interface ChgPileDao {

	public int AddChgPile(T_ChgPile tChgPile);  //添加新的充电桩
	public List<T_ChgPile> AllChgPile(Page page);      //得到所有充电桩列表
	public int AllChgPileCount();        //得到所有充电桩数目
	public T_ChgPile ChgPileInfo(String CPID);    //根据充电桩编号得到充电桩的所有信息
	public int UpdateChgPile(T_ChgPile tChgPile);         //修改充电桩信息
	public int DeleteChgPile(String CPID);           //删除指定的充电桩
	
}
