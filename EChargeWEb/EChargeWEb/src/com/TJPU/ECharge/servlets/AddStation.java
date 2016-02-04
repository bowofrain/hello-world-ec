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

import com.TJPU.ECharge.biz.StationBiz;
import com.TJPU.ECharge.bizimpl.StationBizImpl;
import com.TJPU.ECharge.vo.T_Operator;
import com.TJPU.ECharge.vo.T_Station;

public class AddStation extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public AddStation() {
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

		//添加新的充电站
		T_Station tStation=new T_Station();
		
		tStation.setS_ID(request.getParameter("SID"));
		tStation.setS_Name(request.getParameter("SName"));
		tStation.setS_Longitude(new BigDecimal(request.getParameter("SLongitude")));
		tStation.setS_Latitude(new BigDecimal(request.getParameter("SLatitude")));
		tStation.setS_Adress(request.getParameter("SAdress"));
		tStation.setS_Memo(request.getParameter("SMemo"));
		Date dt=new Date();
		Timestamp ts=new Timestamp(dt.getTime());
		tStation.setS_Date(ts);
		
		HttpSession session=request.getSession();
		T_Operator tOperator = (T_Operator) session.getAttribute("operator");
		tStation.setO_ID(tOperator.getO_ID());
		
		StationBiz sBiz=new StationBizImpl();
		boolean flag=sBiz.AddStation(tStation);
		if(flag){
			response.sendRedirect("ShowAllStation");//添加充电站成功
		}else{
			response.sendRedirect("AddStation.jsp");//添加失败
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
