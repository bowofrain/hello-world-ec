package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Station;

public interface StationDao {

	public int AddStation(T_Station tStation);       //����µĳ��վ
	public List<T_Station> AllStation(Page page);//�õ����г��վ���б�
	public List<T_Station> AllStation();
	public int AllStationCount();            //�õ����г��վ����Ŀ
	public T_Station StationInfo(String SID);       //���ݳ��վ��ŵõ����վ������Ϣ
	public int UpdateStation(T_Station tStation);          //���³��վ��Ϣ
	public int DeleteStation(String SID);        //ɾ��ָ�����վ
	
}
