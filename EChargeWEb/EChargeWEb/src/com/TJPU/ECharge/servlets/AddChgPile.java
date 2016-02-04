package com.TJPU.ECharge.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.ChgPileBiz;
import com.TJPU.ECharge.bizimpl.ChgPileBizImpl;
import com.TJPU.ECharge.vo.T_ChgPile;
import com.TJPU.ECharge.vo.T_Operator;
import com.TJPU.ECharge.vo.T_PriceStd;

public class AddChgPile extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public AddChgPile() {
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

		//添加充电桩
		T_ChgPile tChgPile=new T_ChgPile();
		
		tChgPile.setCP_ID(request.getParameter("CPID"));
		tChgPile.setCP_SerialNumber(request.getParameter("CPSerialNumber"));
		tChgPile.setCP_Longitude(new BigDecimal(request.getParameter("CPLongitude")));
		tChgPile.setCP_Latitude(new BigDecimal(request.getParameter("CPLatitude")));
		tChgPile.setCP_State(Short.parseShort(request.getParameter("CPState")));
		
		Date dt=new Date();
		Timestamp ts=new Timestamp(dt.getTime());
		tChgPile.setCP_Time(ts);
		
		T_PriceStd tPriceStd=new T_PriceStd();
		tPriceStd.setFS_ID(Integer.parseInt(request.getParameter("FSID")));
		tChgPile.setT_PriceStd(tPriceStd);
		
		tChgPile.setCPT_ID(request.getParameter("CPTID"));
		tChgPile.setS_ID(request.getParameter("SID"));
		
		HttpSession session=request.getSession();
		T_Operator tOperator = (T_Operator) session.getAttribute("operator");
		tChgPile.setO_ID(tOperator.getO_ID());
		
		ChgPileBiz cpBiz=new ChgPileBizImpl();
		boolean flag=cpBiz.AddChgPile(tChgPile);
		if(flag){
			response.sendRedirect("ShowAllChgPile");//添加充电桩成功
		}else{
			response.sendRedirect("AddChgPileInfo");//添加失败
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
