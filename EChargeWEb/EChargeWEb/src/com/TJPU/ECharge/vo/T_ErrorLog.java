package com.TJPU.ECharge.vo;

import java.sql.Timestamp;

public class T_ErrorLog {

	private int EL_ID;
	private String EL_Type;
	private String EL_Memo;
	private Timestamp EL_Time;
	private boolean EL_Del;
	private T_Admin A_ID;
	public T_ErrorLog() {
		super();
	}
	public T_ErrorLog(int eL_ID, String eL_Type, String eL_Memo,
			Timestamp eL_Time, boolean eL_Del, T_Admin a_ID) {
		super();
		EL_ID = eL_ID;
		EL_Type = eL_Type;
		EL_Memo = eL_Memo;
		EL_Time = eL_Time;
		EL_Del = eL_Del;
		A_ID = a_ID;
	}
	public int getEL_ID() {
		return EL_ID;
	}
	public void setEL_ID(int eL_ID) {
		EL_ID = eL_ID;
	}
	public String getEL_Type() {
		return EL_Type;
	}
	public void setEL_Type(String eL_Type) {
		EL_Type = eL_Type;
	}
	public String getEL_Memo() {
		return EL_Memo;
	}
	public void setEL_Memo(String eL_Memo) {
		EL_Memo = eL_Memo;
	}
	public Timestamp getEL_Time() {
		return EL_Time;
	}
	public void setEL_Time(Timestamp eL_Time) {
		EL_Time = eL_Time;
	}
	public boolean isEL_Del() {
		return EL_Del;
	}
	public void setEL_Del(boolean eL_Del) {
		EL_Del = eL_Del;
	}
	public T_Admin getA_ID() {
		return A_ID;
	}
	public void setA_ID(T_Admin a_ID) {
		A_ID = a_ID;
	}
	
	
	
}
