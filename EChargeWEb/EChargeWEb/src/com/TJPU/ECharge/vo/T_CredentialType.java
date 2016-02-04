package com.TJPU.ECharge.vo;



/**
 * TCredentialtype entity. @author MyEclipse Persistence Tools
 */

public class T_CredentialType {


    // Fields    

     private String CT_ID;
     private String CT_Name;
     private String CT_Memo;


    // Constructors

    /** default constructor */
    public T_CredentialType() {
    }


    
    
    
	public T_CredentialType(String cT_ID) {
		super();
		CT_ID = cT_ID;
	}


	

	


	public T_CredentialType(String cT_ID, String cT_Name) {
		super();
		CT_ID = cT_ID;
		CT_Name = cT_Name;
	}





	public T_CredentialType(String cT_ID, String cT_Name, String cT_Memo) {
		super();
		CT_ID = cT_ID;
		CT_Name = cT_Name;
		CT_Memo = cT_Memo;
	}





	public String getCT_ID() {
		return CT_ID;
	}


	public void setCT_ID(String cT_ID) {
		CT_ID = cT_ID;
	}


	public String getCT_Name() {
		return CT_Name;
	}


	public void setCT_Name(String cT_Name) {
		CT_Name = cT_Name;
	}


	public String getCT_Memo() {
		return CT_Memo;
	}


	public void setCT_Memo(String cT_Memo) {
		CT_Memo = cT_Memo;
	}

	







}