package com.render.To_Do_List.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.render.To_Do_List.dao.ListDao;
import com.render.To_Do_List.dto.Listt;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(value = "/tasksub")
public class TaskInsertController implements Servlet {

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
		String task=req.getParameter("task");
		
		String email=req.getParameter("email");
		
		String name=req.getParameter("userName");
		
		String taskStatus="Pending";
		
		Listt listt = new Listt(name, email, task,taskStatus);
		
		
		
		ListDao dao = new ListDao();
		Listt listt2 =dao.fetchUserByEmailForLogInDao(email);
		
		if(listt2!=null)
		{
			dao.saveTaskDao(listt);
			req.getRequestDispatcher("Task.jsp").include(req, res);
		}
		else
		{
			PrintWriter printWriter = res.getWriter();
			printWriter.write("<html><body>Incorrect Email Please Enter Correct Email</body></html>");
			req.getRequestDispatcher("Task.jsp").include(req, res);
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
