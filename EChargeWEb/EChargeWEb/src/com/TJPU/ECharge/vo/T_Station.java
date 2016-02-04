package com.TJPU.ECharge.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class T_Station {
	
	private String S_ID;
	private String S_Name;
	private BigDecimal S_Longitude;
	private BigDecimal S_Latitude;
	private String S_Address;
	private String S_Memo;
	private Timestamp S_Date;
	private T_Operator O_ID;
	private int ChgPileCount;      //电站的充电桩数目计数
	public T_Station() {
		super();
	}
	
	
	
	

	public T_Station(String s_ID, String s_Name, BigDecimal s_Longitude,
			BigDecimal s_Latitude, String s_Address, Timestamp s_Date,
			T_Operator o_ID) {
		super();
		S_ID = s_ID;
		S_Name = s_Name;
		S_Longitude = s_Longitude;
		S_Latitude = s_Latitude;
		S_Address = s_Address;
		S_Date = s_Date;
		O_ID = o_ID;
	}





	public T_Station(String s_ID, String s_Name, BigDecimal s_Longitude,
			BigDecimal s_Latitude, String s_Address, String s_Memo,
			Timestamp s_Date, T_Operator o_ID) {
		super();
		S_ID = s_ID;
		S_Name = s_Name;
		S_Longitude = s_Longitude;
		S_Latitude = s_Latitude;
		S_Address = s_Address;
		S_Memo = s_Memo;
		S_Date = s_Date;
		O_ID = o_ID;
	}


	



	public T_Station(String s_ID, String s_Name, BigDecimal s_Longitude,
			BigDecimal s_Latitude, String s_Address, String s_Memo,
			Timestamp s_Date, T_Operator o_ID, int chgPileCount) {
		super();
		S_ID = s_ID;
		S_Name = s_Name;
		S_Longitude = s_Longitude;
		S_Latitude = s_Latitude;
		S_Address = s_Address;
		S_Memo = s_Memo;
		S_Date = s_Date;
		O_ID = o_ID;
		ChgPileCount = chgPileCount;
	}





	public int getChgPileCount() {
		return ChgPileCount;
	}





	public void setChgPileCount(int chgPileCount) {
		ChgPileCount = chgPileCount;
	}





	public String getS_ID() {
		return S_ID;
	}

	public void setS_ID(String s_ID) {
		S_ID = s_ID;
	}

	public String getS_Name() {
		return S_Name;
	}

	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}

	public BigDecimal getS_Longitude() {
		return S_Longitude;
	}

	public void setS_Longitude(BigDecimal s_Longitude) {
		S_Longitude = s_Longitude;
	}

	public BigDecimal getS_Latitude() {
		return S_Latitude;
	}

	public void setS_Latitude(BigDecimal s_Latitude) {
		S_Latitude = s_Latitude;
	}

	public String getS_Address() {
		return S_Address;
	}

	public void setS_Address(String s_Address) {
		S_Address = s_Address;
	}

	public String getS_Memo() {
		return S_Memo;
	}

	public void setS_Memo(String s_Memo) {
		S_Memo = s_Memo;
	}

	public Timestamp getS_Date() {
		return S_Date;
	}

	public void setS_Date(Timestamp s_Date) {
		S_Date = s_Date;
	}

	public T_Operator getO_ID() {
		return O_ID;
	}

	public void setO_ID(T_Operator o_ID) {
		O_ID = o_ID;
	}
	
	
	
	

}
