package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class T_User {


    // Fields    

     private String U_ID;
     private String U_Password;
     private String U_Tel;
     private String U_Name;
     private String U_CrdlType;
     private String U_CrdlNum;
     private String U_Email;
     private Timestamp U_Time;
     private Float R_Account;
     private T_Role R_ID;


    // Constructors

    /** default constructor */
    public T_User() {
    }


	public T_User(String u_ID, String u_Password) {
		super();
		U_ID = u_ID;
		U_Password = u_Password;
	}


	public T_User(String u_ID, String u_Tel, String u_Name, String u_CrdlType,
			String u_CrdlNum, String u_Email, Timestamp u_Time,
			Float r_Account, T_Role r_ID) {
		super();
		U_ID = u_ID;
		U_Tel = u_Tel;
		U_Name = u_Name;
		U_CrdlType = u_CrdlType;
		U_CrdlNum = u_CrdlNum;
		U_Email = u_Email;
		U_Time = u_Time;
		R_Account = r_Account;
		R_ID = r_ID;
	}


	public T_User(String u_ID, String u_Password, String u_Tel, String u_Name,
			String u_CrdlType, String u_CrdlNum, String u_Email,
			Timestamp u_Time, Float r_Account, T_Role r_ID) {
		super();
		U_ID = u_ID;
		U_Password = u_Password;
		U_Tel = u_Tel;
		U_Name = u_Name;
		U_CrdlType = u_CrdlType;
		U_CrdlNum = u_CrdlNum;
		U_Email = u_Email;
		U_Time = u_Time;
		R_Account = r_Account;
		R_ID = r_ID;
	}


	public String getU_ID() {
		return U_ID;
	}


	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}


	public String getU_Password() {
		return U_Password;
	}


	public void setU_Password(String u_Password) {
		U_Password = u_Password;
	}


	public String getU_Tel() {
		return U_Tel;
	}


	public void setU_Tel(String u_Tel) {
		U_Tel = u_Tel;
	}


	public String getU_Name() {
		return U_Name;
	}


	public void setU_Name(String u_Name) {
		U_Name = u_Name;
	}


	public String getU_CrdlType() {
		return U_CrdlType;
	}


	public void setU_CrdlType(String u_CrdlType) {
		U_CrdlType = u_CrdlType;
	}


	public String getU_CrdlNum() {
		return U_CrdlNum;
	}


	public void setU_CrdlNum(String u_CrdlNum) {
		U_CrdlNum = u_CrdlNum;
	}


	public String getU_Email() {
		return U_Email;
	}


	public void setU_Email(String u_Email) {
		U_Email = u_Email;
	}


	public Timestamp getU_Time() {
		return U_Time;
	}


	public void setU_Time(Timestamp u_Time) {
		U_Time = u_Time;
	}


	public Float getR_Account() {
		return R_Account;
	}


	public void setR_Account(Float r_Account) {
		R_Account = r_Account;
	}


	public T_Role getR_ID() {
		return R_ID;
	}


	public void setR_ID(T_Role r_ID) {
		R_ID = r_ID;
	}

	







}