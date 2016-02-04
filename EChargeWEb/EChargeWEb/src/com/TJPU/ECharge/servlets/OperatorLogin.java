package com.TJPU.ECharge.servlets;

import java.io.IOException;






import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.OperatorBiz;
import com.TJPU.ECharge.bizimpl.OperatorBizImpl;
import com.TJPU.ECharge.exception.PasswordNotCorrectException;
import com.TJPU.ECharge.exception.UserNotFoundException;
import com.TJPU.ECharge.vo.T_Operator;

public class OperatorLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public OperatorLogin() {
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

		//客服人员登录
		OperatorBiz biz=new OperatorBizImpl();
		
		HttpSession session=request.getSession();
		String operatorname = request.getParameter("operatorname");
		String password = request.getParameter("password");
		T_Operator operator=new T_Operator();
		try {
			operator = biz.Login(operatorname, password);

		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
			response.sendRedirect("operatorLogin.jsp");
		} catch (PasswordNotCorrectException e) {
			System.out.println(e.getMessage());
			response.sendRedirect("operatorLogin.jsp");
		}
		
		session.setAttribute("operator" , operator);
		response.sendRedirect("operator/backIndex.jsp");
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
