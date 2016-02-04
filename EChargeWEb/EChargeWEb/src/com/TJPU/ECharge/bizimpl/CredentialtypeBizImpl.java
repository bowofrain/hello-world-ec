package com.TJPU.ECharge.bizimpl;

import java.util.List;

import com.TJPU.ECharge.biz.CredentialtypeBiz;
import com.TJPU.ECharge.dao.CredentialtypeDao;
import com.TJPU.ECharge.daoimpl.CredentialtypeDaoImpl;
import com.TJPU.ECharge.vo.T_CredentialType;

public class CredentialtypeBizImpl implements CredentialtypeBiz {

	CredentialtypeDao dao=new CredentialtypeDaoImpl();
	
	@Override
	public List<T_CredentialType> CdTypeList() {
		// TODO Auto-generated method stub
		return dao.CdTypeList();
	}

}
