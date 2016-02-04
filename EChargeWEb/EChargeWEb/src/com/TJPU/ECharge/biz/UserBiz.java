package com.TJPU.ECharge.biz;


import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_User;

public interface UserBiz {

	public boolean Register(T_User users);   //新用户的注册
	public T_User Login(String username, String password); //用户的登陆
	public int UserCount();       //所有用户的计数
	public List<T_User> AllUser(Page page);     //得到所有用户信息   
	public T_User UserInfo(String username);   //得到一个用户的详细信息
	public boolean UpdateUser(T_User users);   //更新用户的信息
	public boolean updatePassword(String username, String password);  //更新用户密码
}
