package com.render.To_Do_List.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.render.To_Do_List.dao.ListDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(value="/delete")
public class TaskDeleteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String task=req.getParameter("task");
		ListDao dao = new ListDao();
		int a=dao.deleteTaskByTasklDao(task);
		
		if(a!=0)
		{
			req.getRequestDispatcher("display.jsp").include(req, resp);
		}
		else
		{
			PrintWriter printWriter = resp.getWriter();
			printWriter.write("<html><body>Data Not Deleted</body></html>");
			req.getRequestDispatcher("display.jsp").include(req, resp);
		}
		
	}

}
