package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TRole entity. @author MyEclipse Persistence Tools
 */

public class T_Role  {


    // Fields    

     private String R_ID;
     private String R_Name;
     private String R_Desc;
     private Timestamp R_Time;
     private String A_ID;


    // Constructors

    /** default constructor */
    public T_Role() {
    }


	public T_Role(String r_ID, String a_ID) {
		super();
		R_ID = r_ID;
		A_ID = a_ID;
	}


	public T_Role(String r_ID, String r_Name, String r_Desc, Timestamp r_Time,
			String a_ID) {
		super();
		R_ID = r_ID;
		R_Name = r_Name;
		R_Desc = r_Desc;
		R_Time = r_Time;
		A_ID = a_ID;
	}


	public String getR_ID() {
		return R_ID;
	}


	public void setR_ID(String r_ID) {
		R_ID = r_ID;
	}


	public String getR_Name() {
		return R_Name;
	}


	public void setR_Name(String r_Name) {
		R_Name = r_Name;
	}


	public String getR_Desc() {
		return R_Desc;
	}


	public void setR_Desc(String r_Desc) {
		R_Desc = r_Desc;
	}


	public Timestamp getR_Time() {
		return R_Time;
	}


	public void setR_Time(Timestamp r_Time) {
		R_Time = r_Time;
	}


	public String getA_ID() {
		return A_ID;
	}


	public void setA_ID(String a_ID) {
		A_ID = a_ID;
	}

	








}