package com.TJPU.ECharge.biz;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Station;

public interface StationBiz {
	
	public boolean AddStation(T_Station tStation);       //添加新的充电站
	public List<T_Station> AllStation(Page page);          //得到所有充电站的列表
	public List<T_Station> AllStation(); 
	public int AllStationCount();            //得到所有充电站的数目
	public T_Station StationInfo(String SID);       //根据充电站编号得到充电站具体信息
	public boolean UpdateStation(T_Station tStation);          //更新充电站信息
	public boolean DeleteStation(String SID);        //删除指定充电站

}
