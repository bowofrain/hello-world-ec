package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TDeposit entity. @author MyEclipse Persistence Tools
 */

public class T_Deposit   {


    // Fields    

     private String D_ID;
     private Float D_Money;
     private Timestamp D_Time;
     private String D_Type;
     private String U_ID;
     private String O_ID;


    // Constructors

    /** default constructor */
    public T_Deposit() {
    }


	public T_Deposit(String d_ID, String u_ID) {
		super();
		D_ID = d_ID;
		U_ID = u_ID;
	}


	public T_Deposit(String d_ID, Float d_Money, Timestamp d_Time,
			String d_Type, String u_ID, String o_ID) {
		super();
		D_ID = d_ID;
		D_Money = d_Money;
		D_Time = d_Time;
		D_Type = d_Type;
		U_ID = u_ID;
		O_ID = o_ID;
	}


	public String getD_ID() {
		return D_ID;
	}


	public void setD_ID(String d_ID) {
		D_ID = d_ID;
	}


	public Float getD_Money() {
		return D_Money;
	}


	public void setD_Money(Float d_Money) {
		D_Money = d_Money;
	}


	public Timestamp getD_Time() {
		return D_Time;
	}


	public void setD_Time(Timestamp d_Time) {
		D_Time = d_Time;
	}


	public String getD_Type() {
		return D_Type;
	}


	public void setD_Type(String d_Type) {
		D_Type = d_Type;
	}


	public String getU_ID() {
		return U_ID;
	}


	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}

	








}