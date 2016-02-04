package com.TJPU.ECharge.bizimpl;


import java.util.List;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.dao.UserDao;
import com.TJPU.ECharge.daoimpl.UserDaoImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_User;

public class UserBizImpl implements UserBiz {

	UserDao dao=new UserDaoImpl();
	@Override
	public boolean Register(T_User users) {
		// TODO Auto-generated method stub
		int temp=dao.Register(users);
		if(temp>0){
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	
	public T_User Login(String username, String password) {
		// TODO Auto-generated method stub
		T_User users=null;
		users=dao.Login(username, password);
		return users;
	}
	@Override
	public int UserCount() {
		// TODO Auto-generated method stub
		return dao.userCount();
	}
	@Override
	public List<T_User> AllUser(Page page) {
		// TODO Auto-generated method stub
		return dao.AllUser(page);
	}
	@Override
	public T_User UserInfo(String username) {
		// TODO Auto-generated method stub
		return dao.UserInfo(username);
	}
	@Override
	public boolean UpdateUser(T_User users) {
		// TODO Auto-generated method stub
		int temp=dao.UpdateUser(users);
		if(temp>0){
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	public boolean updatePassword(String username, String password) {
		// TODO Auto-generated method stub
		int temp=dao.UpdatePassword(username, password);
		if(temp>0){
			return true;
		}else{
			return false;
		}
	}

}
