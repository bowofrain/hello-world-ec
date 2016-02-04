package com.TJPU.ECharge.servlets;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.CredentialtypeBiz;
import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.CredentialtypeBizImpl;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.vo.T_CredentialType;
import com.TJPU.ECharge.vo.T_User;

public class UpdateUserInfo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateUserInfo() {
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

		//更新用户所需要的信息
		HttpSession session=request.getSession();
		T_User tUser=(T_User) session.getAttribute("users");
		UserBiz uBiz=new UserBizImpl();
		CredentialtypeBiz cdtBiz=new CredentialtypeBizImpl();
		T_User userInfo=uBiz.UserInfo(tUser.getU_ID());
		request.setAttribute("userInfo", userInfo);
		List<T_CredentialType> CredentialtypeList=cdtBiz.CdTypeList();
		request.setAttribute("CredentialtypeList", CredentialtypeList);
		request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);
		
		
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
