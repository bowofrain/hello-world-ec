package com.TJPU.ECharge.servlets;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.vo.T_User;


public class Register extends HttpServlet implements Servlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7750953421789518680L;

	/**
	 * Constructor of the object.
	 */
	public Register() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
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

		//新用户的注册
		
		UserBiz uBiz = new UserBizImpl();

		

		
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			String phone = request.getParameter("phone");
			Date dt = new Date();
			Timestamp ts = new Timestamp(dt.getTime());
			T_User u = new T_User();
			u.setU_ID(username);
			u.setU_Password(password);
			u.setU_Tel(phone);
			u.setU_Time(ts);
			u.setCT_ID("1");
			u.setR_ID("普通");
			boolean flag = uBiz.Register(u);
			if (flag) {
				System.out.println("注册成功!恭喜!");
				response.sendRedirect("Login.jsp");
			} else {
				System.out.println("注册失败!重新注册!");
				response.sendRedirect("Register.jsp");
			}

		
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
