package com.TJPU.ECharge.android.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.TJPU.ECharge.biz.StationBiz;
import com.TJPU.ECharge.bizimpl.StationBizImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Station;

public class GetTstationByPageServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	private String TAG = "GetTstationByPageServlet";
	public GetTstationByPageServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ����Ĭ�Ϸ�ҳ������
		int showNumber = 50; // Ĭ��ÿҳ����
		int count = showNumber;
		int curPage = 1; // Ĭ��ȡ��1ҳ
		// �ͻ��˷�ҳ���ݻ�ȡ
		String cur = request.getParameter("curPage");
		if (null != cur) {
			curPage = Integer.parseInt(cur);
		}
		String sho = request.getParameter("showNumber");
		if (null != sho) {
			showNumber = Integer.parseInt(sho);
		}
		String cou = request.getParameter("count");
		if (null != cou) {
			count = Integer.parseInt(cou);
		}
		// ��curPage > 1, ��֤�ͻ���accession key
		//ToDo: if(curPage >= 1)
		if (curPage > 1) {
			String did = request.getParameter("did");
			if (null == did
					|| !request.getSession().getAttribute("did").equals(did)) {
				System.out.println("accession key denied!");
				return;
			}
			else {
				System.out.println(TAG+" accession key confirmed: "+did);
			}
		}
		
		System.out.println(TAG+" page("+curPage+","+showNumber+","+count+")");

		// �ͻ��˷�ҳ���ݷ�װ
		Page page = new Page(curPage, showNumber, count);
		// ��ȡҵ���߼����
		StationBiz stationBiz = new StationBizImpl();
		page.setCount(stationBiz.AllStationCount());
		List<T_Station> listS = stationBiz.AllStation(page);
		JSONArray jsonArr = new JSONArray(listS);
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		
		//write page as json String
		String jsonPage = new JSONObject(page).toString();
		out.println("["+jsonPage+","+jsonArr.toString().substring(1));
		
		
		//out.println(jsonArr.toString());
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
