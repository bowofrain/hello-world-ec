package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TChgpiletype entity. @author MyEclipse Persistence Tools
 */

public class T_ChgPileType  {


    // Fields    

     private String CPT_ID;
     private Boolean CPT_CurrentType;
     private Integer CPT_ChgGun;
     private Integer CPT_PortType;
     private Short CPT_Memo;
     private Timestamp CPT_Time;


    // Constructors

    /** default constructor */
    public T_ChgPileType() {
    }

    
    

	public T_ChgPileType(String cPT_ID) {
		super();
		CPT_ID = cPT_ID;
	}

	



	public T_ChgPileType(String cPT_ID, Boolean cPT_CurrentType,
			Integer cPT_ChgGun, Integer cPT_PortType, Timestamp cPT_Time) {
		super();
		CPT_ID = cPT_ID;
		CPT_CurrentType = cPT_CurrentType;
		CPT_ChgGun = cPT_ChgGun;
		CPT_PortType = cPT_PortType;
		CPT_Time = cPT_Time;
	}




	public T_ChgPileType(String cPT_ID, Boolean cPT_CurrentType,
			Integer cPT_ChgGun, Integer cPT_PortType, Short cPT_Memo,
			Timestamp cPT_Time) {
		super();
		CPT_ID = cPT_ID;
		CPT_CurrentType = cPT_CurrentType;
		CPT_ChgGun = cPT_ChgGun;
		CPT_PortType = cPT_PortType;
		CPT_Memo = cPT_Memo;
		CPT_Time = cPT_Time;
	}


	public String getCPT_ID() {
		return CPT_ID;
	}


	public void setCPT_ID(String cPT_ID) {
		CPT_ID = cPT_ID;
	}


	public Boolean getCPT_CurrentType() {
		return CPT_CurrentType;
	}


	public void setCPT_CurrentType(Boolean cPT_CurrentType) {
		CPT_CurrentType = cPT_CurrentType;
	}


	public Integer getCPT_ChgGun() {
		return CPT_ChgGun;
	}


	public void setCPT_ChgGun(Integer cPT_ChgGun) {
		CPT_ChgGun = cPT_ChgGun;
	}


	public Integer getCPT_PortType() {
		return CPT_PortType;
	}


	public void setCPT_PortType(Integer cPT_PortType) {
		CPT_PortType = cPT_PortType;
	}


	public Short getCPT_Memo() {
		return CPT_Memo;
	}


	public void setCPT_Memo(Short cPT_Memo) {
		CPT_Memo = cPT_Memo;
	}


	public Timestamp getCPT_Time() {
		return CPT_Time;
	}


	public void setCPT_Time(Timestamp cPT_Time) {
		CPT_Time = cPT_Time;
	}

	

    







}