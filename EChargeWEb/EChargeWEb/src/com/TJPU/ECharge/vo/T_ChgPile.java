package com.TJPU.ECharge.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * TChgpile entity. @author MyEclipse Persistence Tools
 */

public class T_ChgPile  {


    // Fields    

     private String CP_ID;
     private T_PriceStd T_PriceStd;
     private String CP_SerialNumber;
     private BigDecimal CP_Longitude;
     private BigDecimal CP_Latitude;
     private Short CP_State;
     private Timestamp CP_Time;
     private String CPT_ID;
     private String S_ID;
     private String O_ID;


    // Constructors

    /** default constructor */
    public T_ChgPile() {
    }


	public T_ChgPile(String cP_ID, com.TJPU.ECharge.vo.T_PriceStd t_PriceStd,
			String cPT_ID) {
		super();
		CP_ID = cP_ID;
		T_PriceStd = t_PriceStd;
		CPT_ID = cPT_ID;
	}


	


	public T_ChgPile(String cP_ID, com.TJPU.ECharge.vo.T_PriceStd t_PriceStd,
			String cP_SerialNumber, BigDecimal cP_Longitude, BigDecimal cP_Latitude,
			Short cP_State, Timestamp cP_Time, String cPT_ID, String s_ID,
			String o_ID) {
		super();
		CP_ID = cP_ID;
		T_PriceStd = t_PriceStd;
		CP_SerialNumber = cP_SerialNumber;
		CP_Longitude = cP_Longitude;
		CP_Latitude = cP_Latitude;
		CP_State = cP_State;
		CP_Time = cP_Time;
		CPT_ID = cPT_ID;
		S_ID = s_ID;
		O_ID = o_ID;
	}


	public String getCP_ID() {
		return CP_ID;
	}


	public void setCP_ID(String cP_ID) {
		CP_ID = cP_ID;
	}


	public T_PriceStd getT_PriceStd() {
		return T_PriceStd;
	}


	public void setT_PriceStd(T_PriceStd t_PriceStd) {
		T_PriceStd = t_PriceStd;
	}


	public String getCP_SerialNumber() {
		return CP_SerialNumber;
	}


	public void setCP_SerialNumber(String cP_SerialNumber) {
		CP_SerialNumber = cP_SerialNumber;
	}


	


	public BigDecimal getCP_Longitude() {
		return CP_Longitude;
	}


	public void setCP_Longitude(BigDecimal cP_Longitude) {
		CP_Longitude = cP_Longitude;
	}


	public BigDecimal getCP_Latitude() {
		return CP_Latitude;
	}


	public void setCP_Latitude(BigDecimal cP_Latitude) {
		CP_Latitude = cP_Latitude;
	}


	public Short getCP_State() {
		return CP_State;
	}


	public void setCP_State(Short cP_State) {
		CP_State = cP_State;
	}


	public Timestamp getCP_Time() {
		return CP_Time;
	}


	public void setCP_Time(Timestamp cP_Time) {
		CP_Time = cP_Time;
	}


	public String getCPT_ID() {
		return CPT_ID;
	}


	public void setCPT_ID(String cPT_ID) {
		CPT_ID = cPT_ID;
	}


	public String getS_ID() {
		return S_ID;
	}


	public void setS_ID(String s_ID) {
		S_ID = s_ID;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}

	
   








}