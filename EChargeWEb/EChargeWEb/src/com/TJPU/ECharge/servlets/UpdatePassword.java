package com.TJPU.ECharge.servlets;

import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.UserBiz;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.exception.PasswordNotCorrectException;
import com.TJPU.ECharge.exception.UserNotFoundException;
import com.TJPU.ECharge.vo.T_User;

public class UpdatePassword extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdatePassword() {
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

		//更新用户密码
		HttpSession session=request.getSession();
		UserBiz uBiz=new UserBizImpl();
		
		String apassword1=request.getParameter("old_password");
		String apassword2=request.getParameter("password");
		String apassword3=request.getParameter("repassword");
		T_User tUser=(T_User) session.getAttribute("users");
		if(!apassword2.equals(apassword3)){
			response.sendRedirect("UpdatePassword.jsp");//两个新密码不一致
		}else{
			if(apassword1.equals(apassword2)){
				response.sendRedirect("UpdatePassword.jsp");//新旧密码不能一致
			}else{
				try{
					T_User auser=uBiz.Login(tUser.getU_ID(), apassword1);
					boolean flag=uBiz.updatePassword(tUser.getU_ID(), apassword2);
					if(flag){
						response.sendRedirect("Personal.jsp");//修改成功		
					}else{
						response.sendRedirect("UpdatePassword.jsp");//修改失败
					}
					
				}catch (UserNotFoundException e) {
					System.out.println(e.getMessage());
					response.sendRedirect("UpdatePassword.jsp");
				}catch (PasswordNotCorrectException e) {
					System.out.println(e.getMessage());
					response.sendRedirect("UpdatePassword.jsp");
				}
				
				
				
				
			}
			
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
