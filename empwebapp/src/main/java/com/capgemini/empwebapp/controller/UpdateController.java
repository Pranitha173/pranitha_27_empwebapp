package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImpl;
import com.capgemini.empwebapp.dto.EmployeeTest;

@SuppressWarnings("serial")
public class UpdateController extends HttpServlet{

	@SuppressWarnings("unused")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("id");
		
		 String id=req.getParameter("id");
	 	 String emailid=req.getParameter("emailid");
	 	 
	 	 EmployeeTest demo=new EmployeeTest();
	 	 demo.setEmailId("emailid");
	 	 
	 EmployeeDAO dao=new EmployeeDAOImpl();
	 dao.updateEmployeetest(demo);
	 req.getRequestDispatcher("edit.jsp").forward(req, resp);
	 	}
	}