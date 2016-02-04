package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser {


    // Fields    

     private String UId;
     private String UPassword;
     private String UTel;
     private String UName;
     private String ctId;
     private String UCredentialNum;
     private String UEmail;
     private Timestamp UTime;
     private Float RAccount;
     private String RId;


    // Constructors

    /** default constructor */
    public TUser() {
    }

	/** minimal constructor */
    public TUser(String UId, String ctId, String RId) {
        this.UId = UId;
        this.ctId = ctId;
        this.RId = RId;
    }
    
    /** full constructor */
    public TUser(String UId, String UPassword, String UTel, String UName, String ctId, String UCredentialNum, String UEmail, Timestamp UTime, Float RAccount, String RId) {
        this.UId = UId;
        this.UPassword = UPassword;
        this.UTel = UTel;
        this.UName = UName;
        this.ctId = ctId;
        this.UCredentialNum = UCredentialNum;
        this.UEmail = UEmail;
        this.UTime = UTime;
        this.RAccount = RAccount;
        this.RId = RId;
    }

    
    
   
    public TUser(String uId, String uPassword) {
		super();
		UId = uId;
		UPassword = uPassword;
	}
    
    

	
	public TUser(String uId, String uPassword, String uTel, String ctId,
			Timestamp uTime, String rId) {
		super();
		UId = uId;
		UPassword = uPassword;
		UTel = uTel;
		this.ctId = ctId;
		UTime = uTime;
		RId = rId;
	}

	// Property accessors

   

	public String getUId() {
        return this.UId;
    }
    
    public void setUId(String UId) {
        this.UId = UId;
    }

    public String getUPassword() {
        return this.UPassword;
    }
    
    public void setUPassword(String UPassword) {
        this.UPassword = UPassword;
    }

    public String getUTel() {
        return this.UTel;
    }
    
    public void setUTel(String UTel) {
        this.UTel = UTel;
    }

    public String getUName() {
        return this.UName;
    }
    
    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getCtId() {
        return this.ctId;
    }
    
    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    public String getUCredentialNum() {
        return this.UCredentialNum;
    }
    
    public void setUCredentialNum(String UCredentialNum) {
        this.UCredentialNum = UCredentialNum;
    }

    public String getUEmail() {
        return this.UEmail;
    }
    
    public void setUEmail(String UEmail) {
        this.UEmail = UEmail;
    }

    public Timestamp getUTime() {
        return this.UTime;
    }
    
    public void setUTime(Timestamp UTime) {
        this.UTime = UTime;
    }

    public Float getRAccount() {
        return this.RAccount;
    }
    
    public void setRAccount(Float RAccount) {
        this.RAccount = RAccount;
    }

    public String getRId() {
        return this.RId;
    }
    
    public void setRId(String RId) {
        this.RId = RId;
    }
   








}