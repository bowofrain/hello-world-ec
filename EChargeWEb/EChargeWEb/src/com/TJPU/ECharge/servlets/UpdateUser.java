package com.TJPU.ECharge.servlets;

import java.io.IOException;





import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.vo.T_User;

public class UpdateUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateUser() {
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

		//修改个人资料
		UserBiz uBiz=new UserBizImpl();
		
		T_User userInfo=new T_User();
		
		userInfo.setU_ID(request.getParameter("userID"));
		userInfo.setU_Tel(request.getParameter("userTel"));
		userInfo.setU_Name(request.getParameter("userName"));
		userInfo.setCT_ID(request.getParameter("ctId"));
		userInfo.setU_CredentialNum(request.getParameter("userCNum"));
		userInfo.setU_Email(request.getParameter("userEmail"));
		
		Boolean flag= uBiz.UpdateUser(userInfo);
		if(flag){
			response.sendRedirect("UserInfo");
		}else{
			response.sendRedirect("UpdateUserInfo");
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
