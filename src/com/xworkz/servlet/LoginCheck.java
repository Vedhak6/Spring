package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelname=request.getParameter("hotelname");
		String location=request.getParameter("location");
		String date=request.getParameter("date");
		String days=request.getParameter("days");
		String people=request.getParameter("people");
		
		if(hotelname.contentEquals("Ashoka")) 
		{
			//response.sendRedirect("success.jsp");
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request,response);
			
		}
		
		else
		{
			response.sendRedirect("Error.jsp");
		}
		
	}

}
