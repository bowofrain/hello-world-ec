package com.TJPU.ECharge.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.OperatorBiz;
import com.TJPU.ECharge.bizimpl.OperatorBizImpl;
import com.TJPU.ECharge.vo.T_Admin;
import com.TJPU.ECharge.vo.T_Operator;

public class UpdateOperator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UpdateOperator() {
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

		//更新客服信息
		T_Operator tOperator=new T_Operator();
		
		tOperator.setO_ID(request.getParameter("OID"));
		//tOperator.setO_Password(request.getParameter("OPassword"));
		tOperator.setO_Name(request.getParameter("OName"));
		tOperator.setO_IDCard(request.getParameter("OIDCard"));
		tOperator.setO_Department(request.getParameter("ODepartment"));
		tOperator.setO_Adress(request.getParameter("OAdress"));
		tOperator.setO_Tel(request.getParameter("OTel"));
		tOperator.setR_ID(request.getParameter("RID"));
		
		HttpSession session=request.getSession();
		T_Admin tadmin=(T_Admin) session.getAttribute("admins");
		tOperator.setA_ID(tadmin.getA_ID());
		
		OperatorBiz oBiz=new OperatorBizImpl();
		boolean flag=oBiz.UpdateOperator(tOperator);
		if(flag){
			response.sendRedirect("ShowAllOperator");
		}else{
			response.sendRedirect("UpdateOperatorInfo?OId="+tOperator.getO_ID());
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
