package com.TJPU.ECharge.android.servlets;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.vo.T_Role;
import com.TJPU.ECharge.vo.T_User;

public class RegisterServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		   System.out.println("成功进入注册webServlet");
					String name = request.getParameter("userName");
					String pass = request.getParameter("passWord");
					String phone =request.getParameter("Phone");
					System.out.println(name+"zxzx");
					System.out.println(pass+"sssss");
					System.out.println(phone+"dfdfgdfg");
					
					// 获取系统的业务逻辑组件
				//	AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
					UserBiz uBiz=new UserBizImpl();
					T_User user =new T_User();
					user.setU_Password(pass);
					user.setU_ID(name);
					user.setU_Tel(phone);
					user.setU_Time( new Timestamp(System.currentTimeMillis()));
					T_Role role = new T_Role();
					role.setR_ID("1");
					user.setR_ID(role);
					boolean u = uBiz.Register(user);
					
					if(!u)
						System.out.println(user.getU_ID()+"注册失败");
					
					// 验证用户登录
				//	int userId = auctionManager.validLogin(user , pass);
			  		response.setContentType("text/html; charset=utf-8");
					// 登录成功
					
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
