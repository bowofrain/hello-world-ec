package com.TJPU.ECharge.dao;

import java.util.List;

import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_User;

public interface UserDao {

	public int Register(T_User users);    //新用户的注册，添加进数据库
	public T_User Login(String username,String password);  //用户的登陆验证
	public int userCount();          //所有用户计数
 	public List<T_User> AllUser(Page page);        //查询所有用户信息
	public T_User UserInfo(String username);     //得到指定用户的所有信息 
	public int UpdateUser(T_User users);        //更新用户信息
	public int UpdatePassword(String username,String password); //更新用户密码
	
}
