package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TBooking entity. @author MyEclipse Persistence Tools
 */

public class T_Booking  {


    // Fields    

     private String B_ID;
     private String U_ID;
     private String CP_ID;
     private Timestamp B_Time;
     private Float B_ValidPeriod;
     private Float B_Deposit;
     private Timestamp B_EndTime;
     private Short B_EndType;
     private Float B_Spend;
     private Float B_Return;
     private Timestamp B_ReturnTime;
     private String B_Memo;


    // Constructors

    /** default constructor */
    public T_Booking() {
    	super();
    }

    
    
    
    

	public T_Booking(String b_ID, Timestamp b_Time, Float b_Deposit,
			Timestamp b_EndTime, Short b_EndType) {
		super();
		B_ID = b_ID;
		B_Time = b_Time;
		B_Deposit = b_Deposit;
		B_EndTime = b_EndTime;
		B_EndType = b_EndType;
	}


	




	public T_Booking(String b_ID, Timestamp b_Time, Float b_Deposit,
			Timestamp b_EndTime, Short b_EndType, Float b_Spend) {
		super();
		B_ID = b_ID;
		B_Time = b_Time;
		B_Deposit = b_Deposit;
		B_EndTime = b_EndTime;
		B_EndType = b_EndType;
		B_Spend = b_Spend;
	}






	public T_Booking(String b_ID, String u_ID, String cP_ID, Timestamp b_Time,
			Float b_ValidPeriod, Float b_Deposit, Timestamp b_EndTime,
			Short b_EndType, Float b_Spend, Float b_Return,
			Timestamp b_ReturnTime, String b_Memo) {
		super();
		B_ID = b_ID;
		U_ID = u_ID;
		CP_ID = cP_ID;
		B_Time = b_Time;
		B_ValidPeriod = b_ValidPeriod;
		B_Deposit = b_Deposit;
		B_EndTime = b_EndTime;
		B_EndType = b_EndType;
		B_Spend = b_Spend;
		B_Return = b_Return;
		B_ReturnTime = b_ReturnTime;
		B_Memo = b_Memo;
	}






	public String getB_ID() {
		return B_ID;
	}


	public void setB_ID(String b_ID) {
		B_ID = b_ID;
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


	public Timestamp getB_Time() {
		return B_Time;
	}


	public void setB_Time(Timestamp b_Time) {
		B_Time = b_Time;
	}


	public Float getB_ValidPeriod() {
		return B_ValidPeriod;
	}


	public void setB_ValidPeriod(Float b_ValidPeriod) {
		B_ValidPeriod = b_ValidPeriod;
	}


	public Float getB_Deposit() {
		return B_Deposit;
	}


	public void setB_Deposit(Float b_Deposit) {
		B_Deposit = b_Deposit;
	}


	public Timestamp getB_EndTime() {
		return B_EndTime;
	}


	public void setB_EndTime(Timestamp b_EndTime) {
		B_EndTime = b_EndTime;
	}


	public Short getB_EndType() {
		return B_EndType;
	}


	public void setB_EndType(Short b_EndType) {
		B_EndType = b_EndType;
	}


	public Float getB_Spend() {
		return B_Spend;
	}


	public void setB_Spend(Float b_Spend) {
		B_Spend = b_Spend;
	}


	public Float getB_Return() {
		return B_Return;
	}


	public void setB_Return(Float b_Return) {
		B_Return = b_Return;
	}


	public Timestamp getB_ReturnTime() {
		return B_ReturnTime;
	}


	public void setB_ReturnTime(Timestamp b_ReturnTime) {
		B_ReturnTime = b_ReturnTime;
	}


	public String getB_Memo() {
		return B_Memo;
	}


	public void setB_Memo(String b_Memo) {
		B_Memo = b_Memo;
	}

	
    
    







}