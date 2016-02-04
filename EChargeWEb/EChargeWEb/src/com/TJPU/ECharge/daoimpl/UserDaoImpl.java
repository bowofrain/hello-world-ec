package com.TJPU.ECharge.daoimpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;





import com.TJPU.ECharge.dao.UserDao;

import com.TJPU.ECharge.util.DBHelp;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Role;
import com.TJPU.ECharge.vo.T_User;

public class UserDaoImpl implements UserDao {

private DBHelp DB;
	
	public UserDaoImpl() {
		DB=new DBHelp();
	}
	
	
	@Override
	public int Register(T_User users) {
		// TODO Auto-generated method stub
		String sql = "insert into t_user(U_ID,U_Password,U_Tel,U_Time,R_ID) values (?, ?,?,?,?)";
		int temp=-1;
		try {
			temp=DB.update(sql,users.getU_ID(),users.getU_Password(),users.getU_Tel(),new Timestamp(users.getU_Time().getTime()),users.getR_ID().getR_ID());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public T_User Login(String username,String password) {
		// TODO Auto-generated method stub
		T_User users=new T_User();
		String sql="select * from t_user where U_ID =?";
		ResultSet rs;
		try {
			rs = DB.select(sql,username);
			if(!rs.next()) {
				//没有该用户，不用给users赋值
				
			} else {
				if(!password.equals(rs.getString("U_Password"))) {
					//密码错误，不用给users赋值
					
				}else{
					//正确登录，给users赋值
					
					users = new T_User();
					users.setU_ID(rs.getString("U_ID"));
					users.setR_Account(rs.getFloat("R_Account"));
					
					T_Role tRole=new T_Role();
					tRole.setR_ID(rs.getString("R_ID"));
					users.setR_ID(tRole);
				}
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}


	@Override
	public int userCount() {
		// TODO Auto-generated method stub
		      
				String sql="SELECT COUNT(*) FROM t_user";
				int temp=0;
				try {
					ResultSet rs=DB.select(sql);
					if(rs.next()){
						temp=rs.getInt(1);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return temp;
	}


	@Override
	public List<T_User> AllUser(Page page) {
		// TODO Auto-generated method stub
		
		String sql="SELECT * FROM t_user limit ?,?";
		List<T_User> UserInfo=new ArrayList<T_User>();
		try {
			ResultSet rs=DB.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				T_User users = new T_User();
				users.setU_ID(rs.getString("U_ID"));
				users.setU_Password(rs.getString("U_Password"));
				users.setU_Tel(rs.getString("U_Tel"));
				users.setU_Name(rs.getString("U_Name"));
				users.setU_CrdlType(rs.getString("U_CrdlType"));
				users.setU_CrdlNum(rs.getString("U_CrdlNum"));
				users.setU_Email(rs.getString("U_Email"));
				users.setU_Time(rs.getTimestamp("U_Time"));
				users.setR_Account(rs.getFloat("R_Account"));
				
				T_Role tRole=new T_Role();
				tRole.setR_ID(rs.getString("R_ID"));
				users.setR_ID(tRole);
				
				UserInfo.add(users);
				//System.out.println(rs.getString("users.usernickname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(UserInfo.get(1).getUsernickname());
		return UserInfo;
	}


	@Override
	public T_User UserInfo(String username) {
		// TODO Auto-generated method stub
		T_User users=new T_User();
		String sql="select * from t_user where U_ID =?";
		ResultSet rs;
		try {
			rs = DB.select(sql,username);
			while(rs.next()){
				users = new T_User();
				users.setU_ID(rs.getString("U_ID"));
				users.setU_Password(rs.getString("U_Password"));
				users.setU_Tel(rs.getString("U_Tel"));
				users.setU_Name(rs.getString("U_Name"));
				users.setU_CrdlType(rs.getString("U_CrdlType"));
				users.setU_CrdlNum(rs.getString("U_CrdlNum"));
				users.setU_Email(rs.getString("U_Email"));
				users.setU_Time(rs.getTimestamp("U_Time"));
				users.setR_Account(rs.getFloat("R_Account"));
				
				T_Role tRole=new T_Role();
				tRole.setR_ID(rs.getString("R_ID"));
				users.setR_ID(tRole);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}


	@Override
	public int UpdateUser(T_User users) {
		// TODO Auto-generated method stub
		String sql="UPDATE t_user SET t_user.U_Tel=?,t_user.U_Name=?,t_user.U_CrdlType=?,t_user.U_CrdlNum=?,t_user.U_Email=? WHERE t_user.U_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql, users.getU_Tel(),users.getU_Name(),users.getU_CrdlType(),users.getU_CrdlNum(),users.getU_Email(),users.getU_ID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public int UpdatePassword(String username, String password) {
		// TODO Auto-generated method stub
		String sql="update t_user set t_user.U_Password=? where t_user.U_ID=?";
		int temp=-1;
		try {
			temp=DB.update(sql, password,username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
