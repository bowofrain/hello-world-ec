package com.TJPU.ECharge.android.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.TJPU.ECharge.biz.StationBiz;
import com.TJPU.ECharge.bizimpl.StationBizImpl;
import com.TJPU.ECharge.vo.T_Station;

public class GetTstationIfonServlet extends HttpServlet {

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7658442504635016778L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        StationBiz  stationBiz = new  StationBizImpl();
		// 获取业务逻辑组件
		List<T_Station> t_tations =  stationBiz.AllStation();
		JSONArray jsonArr= new JSONArray(t_tations);
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println(jsonArr.toString()); 
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   doGet(request,response);
		
	}

	
	

}
