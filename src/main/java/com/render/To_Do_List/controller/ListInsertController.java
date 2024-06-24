package com.render.To_Do_List.controller;

import java.io.IOException;

import com.render.To_Do_List.dao.ListDao;
import com.render.To_Do_List.dto.Listt;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(value = "/submit")

public class ListInsertController implements Servlet{

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
		
		String name=req.getParameter("userNamee");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String phonee = req.getParameter("phone");
		
		long phone =Long.parseLong(phonee);
		
		
		
		Listt listt = new Listt(name, email, password, gender, phone);
		
		ListDao dao = new ListDao();
		Listt listt2 =dao.saveListDao(listt);
		if(listt2!=null)
		{
			RequestDispatcher dispatcher =req.getRequestDispatcher("LogIn.jsp");
			dispatcher.forward(req, res);
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
