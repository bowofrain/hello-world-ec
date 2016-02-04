package com.TJPU.ECharge.android.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.vo.T_User;


public class LoginServlet extends HttpServlet {
	
	private String TAG = "LoginServlet";

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         response.setContentType("text/html");
         System.out.println("成功进入webServlet");
			String user = request.getParameter("userName");
			String pass = request.getParameter("passWord");
			System.out.println(user + ":" + pass);
			// 获取系统的业务逻辑组件
			UserBiz uBiz=new UserBizImpl();
			T_User u = uBiz.Login(user, pass);
			String userId = u.getU_ID();
	  		response.setContentType("text/html; charset=utf-8");
			
	  		String retCode="";
			if (userId == null || "".equals(userId))
			{
				retCode = "0";
			} // 登录成功
			else {
				retCode = "1";
				request.getSession(true).setAttribute("userId" , userId);
			}
			
			response.getWriter().println(retCode);
			
			System.out.println(TAG + " retCode=" + retCode);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
