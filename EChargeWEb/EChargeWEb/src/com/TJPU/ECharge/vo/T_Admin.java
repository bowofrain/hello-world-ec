package com.TJPU.ECharge.vo;



/**
 * TAdmin entity. @author MyEclipse Persistence Tools
 */

public class T_Admin  {


    // Fields    

     private String A_ID;
     private String A_Password;
     private String A_Memo;


    // Constructors

    /** default constructor */
    public T_Admin() {
    	super();
    }

    
    

	public T_Admin(String a_ID) {
		super();
		A_ID = a_ID;
	}




	public T_Admin(String a_ID, String a_Password) {
		super();
		A_ID = a_ID;
		A_Password = a_Password;
	}




	public String getA_ID() {
		return A_ID;
	}


	public void setA_ID(String a_ID) {
		A_ID = a_ID;
	}


	public String getA_Password() {
		return A_Password;
	}


	public void setA_Password(String a_Password) {
		A_Password = a_Password;
	}


	public String getA_Memo() {
		return A_Memo;
	}


	public void setA_Memo(String a_Memo) {
		A_Memo = a_Memo;
	}

	







}