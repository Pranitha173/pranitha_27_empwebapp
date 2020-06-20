package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dto.EmployeeTest;
import com.capgemini.empwebapp.services.EmployeeService;
import com.capgemini.empwebapp.services.EmployeeServiceImpl;

@SuppressWarnings("serial")
public class EmployeeServlets extends HttpServlet {
	
	private EmployeeService service= new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get query string
		String empIdVal = req.getParameter("empId");
		String empId =req.getParameter(empIdVal);
		String empName = req.getParameter("empName");
		String designation = req.getParameter("designation");
		
		
		EmployeeTest test  = new EmployeeTest();
		test.getEmpId();
		test.getEmpName();
		test.getDesignation();
		
		boolean isAdded= service.addEmployeeInfo(test);
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		if(isAdded) {
			out.println("<h2 style'color: green'>Employee Added susscessfully.....</h2>");
		}else {
			out.println("<h2 style'color: red'>unable to add employee!!!</h2>");
			
		}
		out.println("</body>");
		out.println("</html>");

		

		
		
	}

}