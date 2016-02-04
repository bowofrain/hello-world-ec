package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TParameter entity. @author MyEclipse Persistence Tools
 */

public class T_Parameter  {


    // Fields    

     private Integer P_ID;
     private String O_ID;
     private String P_Name;
     private String P_Value;
     private Timestamp P_Time;
     private String P_Memo;


    // Constructors

    /** default constructor */
    public T_Parameter() {
    }


	public T_Parameter(Integer p_ID, String o_ID) {
		super();
		P_ID = p_ID;
		O_ID = o_ID;
	}


	public T_Parameter(Integer p_ID, String o_ID, String p_Name,
			String p_Value, Timestamp p_Time, String p_Memo) {
		super();
		P_ID = p_ID;
		O_ID = o_ID;
		P_Name = p_Name;
		P_Value = p_Value;
		P_Time = p_Time;
		P_Memo = p_Memo;
	}


	public Integer getP_ID() {
		return P_ID;
	}


	public void setP_ID(Integer p_ID) {
		P_ID = p_ID;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}


	public String getP_Name() {
		return P_Name;
	}


	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}


	public String getP_Value() {
		return P_Value;
	}


	public void setP_Value(String p_Value) {
		P_Value = p_Value;
	}


	public Timestamp getP_Time() {
		return P_Time;
	}


	public void setP_Time(Timestamp p_Time) {
		P_Time = p_Time;
	}


	public String getP_Memo() {
		return P_Memo;
	}


	public void setP_Memo(String p_Memo) {
		P_Memo = p_Memo;
	}

	







}