package com.render.To_Do_List.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.render.To_Do_List.dao.ListDao;
import com.render.To_Do_List.dto.Listt;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet(value = "/loginstudent")
public class ListUserLogInController implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=req.getParameter("username");
		
		String pass=req.getParameter("password");
		
		ListDao dao = new ListDao();
		
	 	Listt listt = dao.fetchUserByEmailForLogInDao(email);
	 

	 	PrintWriter printWriter = res.getWriter();
	   	
	   	if(listt!=null)
	   	{
	   		if(listt.getPassword().equals(pass))
	   		{
	   			req.getRequestDispatcher("Task.jsp").forward(req, res);
	   			
	   		}
	   		else
	   		{
	   			printWriter.write("<html><body>Incorrect Password</html></body>");
	   			RequestDispatcher dispatcher =req.getRequestDispatcher("LogIn.jsp");
	   			dispatcher.include(req, res);
	   		}
	   	}
	   	else
	   	{
	   		
	   		printWriter.write("<html><body>Incorrect Email</html></body>");
   			req.getRequestDispatcher("LogIn.jsp").include(req, res);
   	
	   	}
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
