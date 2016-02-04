package com.TJPU.ECharge.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TJPU.ECharge.biz.BookingBiz;
import com.TJPU.ECharge.bizimpl.BookingBizImpl;
import com.TJPU.ECharge.vo.Page;
import com.TJPU.ECharge.vo.T_Booking;
import com.TJPU.ECharge.vo.T_User;

public class UserBookingList extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UserBookingList() {
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

		//获得用户的预约记录
		BookingBiz bBiz=new BookingBizImpl();
		HttpSession session=request.getSession();
		T_User tUser=(T_User) session.getAttribute("users");
		
		String pages = request.getParameter("page");
		int pageNum = 1;
		if (pages != null && !"".equals(pages)) {
			pageNum = Integer.parseInt(pages);
		}
		Page page = new Page(pageNum, 10, bBiz.userBookingCount(tUser.getU_ID()));
		
		List<T_Booking> bookingList=bBiz.userBookingList(tUser.getU_ID(), page);
		//System.out.println("111111"+tUser.getU_ID());

		
		request.setAttribute("bookingList", bookingList);
		request.setAttribute("pageInfo", page);
		request.getRequestDispatcher("Booking.jsp").forward(request, response);
		
		
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
