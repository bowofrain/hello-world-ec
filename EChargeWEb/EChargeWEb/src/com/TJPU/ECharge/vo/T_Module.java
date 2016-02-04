package com.TJPU.ECharge.vo;

import java.sql.Timestamp;


/**
 * TModule entity. @author MyEclipse Persistence Tools
 */

public class T_Module  {


    // Fields    

     private String M_ID;
     private String M_Name;
     private String M_Path;
     private String M_Desc;
     private T_Admin A_ID;
     private Timestamp M_Time;


    // Constructors

    /** default constructor */
    public T_Module() {
    }


    


	public T_Module(String m_ID, T_Admin a_ID) {
		super();
		M_ID = m_ID;
		A_ID = a_ID;
	}


	



	public T_Module(String m_ID, String m_Name, String m_Path, String m_Desc,
			T_Admin a_ID, Timestamp m_Time) {
		super();
		M_ID = m_ID;
		M_Name = m_Name;
		M_Path = m_Path;
		M_Desc = m_Desc;
		A_ID = a_ID;
		M_Time = m_Time;
	}





	public String getM_ID() {
		return M_ID;
	}


	public void setM_ID(String m_ID) {
		M_ID = m_ID;
	}


	public String getM_Name() {
		return M_Name;
	}


	public void setM_Name(String m_Name) {
		M_Name = m_Name;
	}


	public String getM_Path() {
		return M_Path;
	}


	public void setM_Path(String m_Path) {
		M_Path = m_Path;
	}


	public String getM_Desc() {
		return M_Desc;
	}


	public void setM_Desc(String m_Desc) {
		M_Desc = m_Desc;
	}


	
	


	public T_Admin getA_ID() {
		return A_ID;
	}





	public void setA_ID(T_Admin a_ID) {
		A_ID = a_ID;
	}





	public Timestamp getM_Time() {
		return M_Time;
	}


	public void setM_Time(Timestamp m_Time) {
		M_Time = m_Time;
	}

	








}