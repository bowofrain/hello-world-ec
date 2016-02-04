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

public class UserInfo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UserInfo() {
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

		HttpSession session=request.getSession();
		T_User tUser=(T_User) session.getAttribute("users");
		UserBiz uBiz=new UserBizImpl();
		CredentialtypeBiz cdtBiz=new CredentialtypeBizImpl();
		
		T_User userInfo=uBiz.UserInfo(tUser.getU_ID());
		if("".equals(userInfo.getU_Name())||userInfo.getU_Name()==null){
			userInfo.setU_Name("Œ¥ÃÓ–¥");
		}
		if("".equals(userInfo.getU_CredentialNum())||userInfo.getU_CredentialNum()==null){
			userInfo.setU_CredentialNum("Œ¥ÃÓ–¥");
		}
		if("".equals(userInfo.getU_Email())||userInfo.getU_Email()==null){
			userInfo.setU_Email("Œ¥ÃÓ–¥");
		}
		
		
		
		request.setAttribute("userInfo", userInfo);
		
		List<T_CredentialType> CredentialtypeList=cdtBiz.CdTypeList();
		request.setAttribute("CredentialtypeList", CredentialtypeList);
		
		request.getRequestDispatcher("UserInfo.jsp").forward(request, response);
		
		
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
