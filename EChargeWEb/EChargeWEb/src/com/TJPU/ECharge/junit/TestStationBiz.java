package com.TJPU.ECharge.junit;

import java.util.List;

import com.TJPU.ECharge.biz.StationBiz;
import com.TJPU.ECharge.bizimpl.StationBizImpl;
import com.TJPU.ECharge.vo.T_Station;

public class TestStationBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StationBiz  stationBiz = new  StationBizImpl();
		List<T_Station> listS =  stationBiz.AllStation();
		System.out.println("num="+listS.size());

	}

}
