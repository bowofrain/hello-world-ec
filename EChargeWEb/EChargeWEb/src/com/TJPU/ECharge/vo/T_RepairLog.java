package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TRepairlog entity. @author MyEclipse Persistence Tools
 */

public class T_RepairLog  {


    // Fields    

     private String RL_ID;
     private String CP_ID;
     private String RL_FaultDate;
     private String RL_RepairDate;
     private String RL_Repairman;
     private String FT_Desc;
     private String FT_Analysis;
     private String FT_Solution;
     private Short FT_Result;
     private String O_ID;
     private Timestamp FT_Time;


    // Constructors

    /** default constructor */
    public T_RepairLog() {
    }


	public T_RepairLog(String rL_ID, String cP_ID, String o_ID) {
		super();
		RL_ID = rL_ID;
		CP_ID = cP_ID;
		O_ID = o_ID;
	}


	public T_RepairLog(String rL_ID, String cP_ID, String rL_FaultDate,
			String rL_RepairDate, String rL_Repairman, String fT_Desc,
			String fT_Analysis, String fT_Solution, Short fT_Result,
			String o_ID, Timestamp fT_Time) {
		super();
		RL_ID = rL_ID;
		CP_ID = cP_ID;
		RL_FaultDate = rL_FaultDate;
		RL_RepairDate = rL_RepairDate;
		RL_Repairman = rL_Repairman;
		FT_Desc = fT_Desc;
		FT_Analysis = fT_Analysis;
		FT_Solution = fT_Solution;
		FT_Result = fT_Result;
		O_ID = o_ID;
		FT_Time = fT_Time;
	}


	public String getRL_ID() {
		return RL_ID;
	}


	public void setRL_ID(String rL_ID) {
		RL_ID = rL_ID;
	}


	public String getCP_ID() {
		return CP_ID;
	}


	public void setCP_ID(String cP_ID) {
		CP_ID = cP_ID;
	}


	public String getRL_FaultDate() {
		return RL_FaultDate;
	}


	public void setRL_FaultDate(String rL_FaultDate) {
		RL_FaultDate = rL_FaultDate;
	}


	public String getRL_RepairDate() {
		return RL_RepairDate;
	}


	public void setRL_RepairDate(String rL_RepairDate) {
		RL_RepairDate = rL_RepairDate;
	}


	public String getRL_Repairman() {
		return RL_Repairman;
	}


	public void setRL_Repairman(String rL_Repairman) {
		RL_Repairman = rL_Repairman;
	}


	public String getFT_Desc() {
		return FT_Desc;
	}


	public void setFT_Desc(String fT_Desc) {
		FT_Desc = fT_Desc;
	}


	public String getFT_Analysis() {
		return FT_Analysis;
	}


	public void setFT_Analysis(String fT_Analysis) {
		FT_Analysis = fT_Analysis;
	}


	public String getFT_Solution() {
		return FT_Solution;
	}


	public void setFT_Solution(String fT_Solution) {
		FT_Solution = fT_Solution;
	}


	public Short getFT_Result() {
		return FT_Result;
	}


	public void setFT_Result(Short fT_Result) {
		FT_Result = fT_Result;
	}


	public String getO_ID() {
		return O_ID;
	}


	public void setO_ID(String o_ID) {
		O_ID = o_ID;
	}


	public Timestamp getFT_Time() {
		return FT_Time;
	}


	public void setFT_Time(Timestamp fT_Time) {
		FT_Time = fT_Time;
	}

	






}