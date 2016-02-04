package com.TJPU.ECharge.servlets;

import java.io.IOException;





//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.TJPU.ECharge.biz.CredentialtypeBiz;
import com.TJPU.ECharge.biz.UserBiz;
//import com.TJPU.ECharge.bizimpl.CredentialtypeBizImpl;
import com.TJPU.ECharge.bizimpl.UserBizImpl;
import com.TJPU.ECharge.exception.PasswordNotCorrectException;
import com.TJPU.ECharge.exception.UserNotFoundException;
//import com.TJPU.ECharge.vo.TCredentialtype;
import com.TJPU.ECharge.vo.T_User;


public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -882976385251394882L;

	/**
	 * Constructor of the object.
	 */
	public Login() {
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

		UserBiz uBiz=new UserBizImpl();
		//CredentialtypeBiz cdtBiz=new CredentialtypeBizImpl();
		
		//用户的登陆
		HttpSession session=request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//验证码验证
		/*String validate = request.getParameter("validate").toLowerCase();
		String valcode = session.getAttribute("valcode").toString();
		if(!validate.equals(valcode)){
			response.sendRedirect("login.jsp");
		}*/

		try {
			T_User u = uBiz.Login(username, password);
			session.setAttribute("users", u);
			//List<TCredentialtype> CredentialtypeList=cdtBiz.CdTypeList();
			//session.setAttribute("CredentialtypeList", CredentialtypeList);
			response.sendRedirect("user/Personal.jsp");
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
			response.sendRedirect("login.jsp");
		} catch (PasswordNotCorrectException e) {
			System.out.println(e.getMessage());
			response.sendRedirect("login.jsp");
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
