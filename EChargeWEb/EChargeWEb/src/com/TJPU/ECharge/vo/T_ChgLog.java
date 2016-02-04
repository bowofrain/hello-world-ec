package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TChglog entity. @author MyEclipse Persistence Tools
 */

public class T_ChgLog  {


    // Fields    

     private String CL_ID;
     private String U_ID;
     private String CP_ID;
     private Short CL_Port;
     private Short CL_ChgType;
     private Timestamp CL_Start;
     private Timestamp CL_End;
     private Float CL_TotlePower;
     private Float CL_ChgPower;
     private Float CL_PowerAfter;
     private Float CL_Spend;
     private Float CL_Account;
     private String CL_Memo;


    // Constructors

    /** default constructor */
    public T_ChgLog() {
    }

    
    

	public T_ChgLog(String cL_ID, String u_ID, String cP_ID) {
		super();
		CL_ID = cL_ID;
		U_ID = u_ID;
		CP_ID = cP_ID;
	}


	
	
	


	public T_ChgLog(String cL_ID, String u_ID, String cP_ID, Short cL_Port,
			Short cL_ChgType, Timestamp cL_Start, Timestamp cL_End,
			Float cL_TotlePower, Float cL_ChgPower, Float cL_PowerAfter,
			Float cL_Spend, Float cL_Account, String cL_Memo) {
		super();
		CL_ID = cL_ID;
		U_ID = u_ID;
		CP_ID = cP_ID;
		CL_Port = cL_Port;
		CL_ChgType = cL_ChgType;
		CL_Start = cL_Start;
		CL_End = cL_End;
		CL_TotlePower = cL_TotlePower;
		CL_ChgPower = cL_ChgPower;
		CL_PowerAfter = cL_PowerAfter;
		CL_Spend = cL_Spend;
		CL_Account = cL_Account;
		CL_Memo = cL_Memo;
	}




	public String getCL_ID() {
		return CL_ID;
	}


	public void setCL_ID(String cL_ID) {
		CL_ID = cL_ID;
	}


	public String getU_ID() {
		return U_ID;
	}


	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}


	public String getCP_ID() {
		return CP_ID;
	}


	public void setCP_ID(String cP_ID) {
		CP_ID = cP_ID;
	}


	public Short getCL_Port() {
		return CL_Port;
	}


	public void setCL_Port(Short cL_Port) {
		CL_Port = cL_Port;
	}


	public Short getCL_ChgType() {
		return CL_ChgType;
	}


	public void setCL_ChgType(Short cL_ChgType) {
		CL_ChgType = cL_ChgType;
	}


	public Timestamp getCL_Start() {
		return CL_Start;
	}


	public void setCL_Start(Timestamp cL_Start) {
		CL_Start = cL_Start;
	}


	public Timestamp getCL_End() {
		return CL_End;
	}


	public void setCL_End(Timestamp cL_End) {
		CL_End = cL_End;
	}


	public Float getCL_TotlePower() {
		return CL_TotlePower;
	}


	public void setCL_TotlePower(Float cL_TotlePower) {
		CL_TotlePower = cL_TotlePower;
	}


	public Float getCL_ChgPower() {
		return CL_ChgPower;
	}


	public void setCL_ChgPower(Float cL_ChgPower) {
		CL_ChgPower = cL_ChgPower;
	}


	public Float getCL_PowerAfter() {
		return CL_PowerAfter;
	}


	public void setCL_PowerAfter(Float cL_PowerAfter) {
		CL_PowerAfter = cL_PowerAfter;
	}


	public Float getCL_Spend() {
		return CL_Spend;
	}


	public void setCL_Spend(Float cL_Spend) {
		CL_Spend = cL_Spend;
	}


	public Float getCL_Account() {
		return CL_Account;
	}


	public void setCL_Account(Float cL_Account) {
		CL_Account = cL_Account;
	}


	public String getCL_Memo() {
		return CL_Memo;
	}


	public void setCL_Memo(String cL_Memo) {
		CL_Memo = cL_Memo;
	}

	
    
    








}