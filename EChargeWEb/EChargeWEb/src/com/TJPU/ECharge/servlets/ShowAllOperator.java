package com.TJPU.ECharge.servlets;

import java.io.IOException;





import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TJPU.ECharge.biz.OperatorBiz;
import com.TJPU.ECharge.bizimpl.OperatorBizImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Operator;

public class ShowAllOperator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public ShowAllOperator() {
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

		//查询客服列表
		String pages = request.getParameter("page");
		int pageNum = 1;
		if (pages != null && !"".equals(pages)) {
			pageNum = Integer.parseInt(pages);
		}
		
		OperatorBiz oBiz=new OperatorBizImpl();
		Page page = new Page(pageNum,10,oBiz.OperatorCount());
		List<T_Operator> OperatorList=new ArrayList<T_Operator>();
		OperatorList=oBiz.AllOperator(page);
		
		request.setAttribute("OperatorList", OperatorList);
		request.setAttribute("pageInfo", page);
		request.getRequestDispatcher("ShowAllOperator.jsp").forward(request, response);
		
		
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
