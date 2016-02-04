package com.TJPU.ECharge.vo;

import java.sql.Timestamp;



/**
 * TPricestd entity. @author MyEclipse Persistence Tools
 */

public class T_PriceStd  {


    // Fields    

     private Integer FS_ID;
     private Float FS_Std;
     private Timestamp FS_Date;
     private String O_ID;


    // Constructors

    /** default constructor */
    public T_PriceStd() {
    }


	public T_PriceStd(Integer fS_ID) {
		super();
		FS_ID = fS_ID;
	}


	


	public T_PriceStd(Integer fS_ID, Float fS_Std, Timestamp fS_Date,
			String o_ID) {
		super();
		FS_ID = fS_ID;
		FS_Std = fS_Std;
		FS_Date = fS_Date;
		O_ID = o_ID;
	}


	public Integer getFS_ID() {
		return FS_ID;
	}


	public void setFS_ID(Integer fS_ID) {
		FS_ID = fS_ID;
	}


	public Float getFS_Std() {
		return FS_Std;
	}


	public void setFS_Std(Float fS_Std) {
		FS_Std = fS_Std;
	}


	public Timestamp getFS_Date() {
		return FS_Date;
	}


	public void setFS_Date(Timestamp fS_Date) {
		FS_Date = fS_Date;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}


	
	
	







}