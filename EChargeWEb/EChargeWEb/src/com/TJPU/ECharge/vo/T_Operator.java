package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TOperator entity. @author MyEclipse Persistence Tools
 */

public class T_Operator  {


    // Fields    

     private String O_ID;
     private String O_Password;
     private String O_Name;
     private String O_IDCard;
     private String O_Department;
     private String O_Adress;
     private String O_Tel;
     private String O_Memo;
     private String R_ID;
     private String A_ID;
     private Timestamp O_Time;


    // Constructors

    /** default constructor */
    public T_Operator() {
    }


	public T_Operator(String o_ID, String r_ID, String a_ID) {
		super();
		O_ID = o_ID;
		R_ID = r_ID;
		A_ID = a_ID;
	}

	

	public T_Operator(String o_ID, String o_Password, String o_Name,
			String o_IDCard, String o_Department, String o_Adress,
			String o_Tel, String r_ID, String a_ID, Timestamp o_Time) {
		super();
		O_ID = o_ID;
		O_Password = o_Password;
		O_Name = o_Name;
		O_IDCard = o_IDCard;
		O_Department = o_Department;
		O_Adress = o_Adress;
		O_Tel = o_Tel;
		R_ID = r_ID;
		A_ID = a_ID;
		O_Time = o_Time;
	}


	public T_Operator(String o_ID, String o_Password, String o_Name,
			String o_IDCard, String o_Department, String o_Adress,
			String o_Tel, String o_Memo, String r_ID, String a_ID,
			Timestamp o_Time) {
		super();
		O_ID = o_ID;
		O_Password = o_Password;
		O_Name = o_Name;
		O_IDCard = o_IDCard;
		O_Department = o_Department;
		O_Adress = o_Adress;
		O_Tel = o_Tel;
		O_Memo = o_Memo;
		R_ID = r_ID;
		A_ID = a_ID;
		O_Time = o_Time;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}


	public String getO_Password() {
		return O_Password;
	}


	public void setO_Password(String o_Password) {
		O_Password = o_Password;
	}


	public String getO_Name() {
		return O_Name;
	}


	public void setO_Name(String o_Name) {
		O_Name = o_Name;
	}


	public String getO_IDCard() {
		return O_IDCard;
	}


	public void setO_IDCard(String o_IDCard) {
		O_IDCard = o_IDCard;
	}


	public String getO_Department() {
		return O_Department;
	}


	public void setO_Department(String o_Department) {
		O_Department = o_Department;
	}


	public String getO_Adress() {
		return O_Adress;
	}


	public void setO_Adress(String o_Adress) {
		O_Adress = o_Adress;
	}


	public String getO_Tel() {
		return O_Tel;
	}


	public void setO_Tel(String o_Tel) {
		O_Tel = o_Tel;
	}


	public String getO_Memo() {
		return O_Memo;
	}


	public void setO_Memo(String o_Memo) {
		O_Memo = o_Memo;
	}


	public String getR_ID() {
		return R_ID;
	}


	public void setR_ID(String r_ID) {
		R_ID = r_ID;
	}


	public String getA_ID() {
		return A_ID;
	}


	public void setA_ID(String a_ID) {
		A_ID = a_ID;
	}


	public Timestamp getO_Time() {
		return O_Time;
	}


	public void setO_Time(Timestamp o_Time) {
		O_Time = o_Time;
	}

	








}