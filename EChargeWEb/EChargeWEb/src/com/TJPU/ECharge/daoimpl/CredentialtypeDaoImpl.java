package com.TJPU.ECharge.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.TJPU.ECharge.dao.CredentialtypeDao;
import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.T_CredentialType;

public class CredentialtypeDaoImpl implements CredentialtypeDao {

	private DBHelp DB;
	
	public CredentialtypeDaoImpl() {
		DB=new DBHelp();
	}
	
	@Override
	public List<T_CredentialType> CdTypeList() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM t_Credentialtype ";
		List<T_CredentialType> cdTypeList=new ArrayList<>();
		try {
			ResultSet rs=DB.select(sql);
			while(rs.next()){
				cdTypeList.add(new T_CredentialType(rs.getString("CT_ID"),rs.getString("CT_Name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cdTypeList;
	}

}
