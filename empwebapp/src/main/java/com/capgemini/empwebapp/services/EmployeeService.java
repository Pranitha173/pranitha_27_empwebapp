package com.capgemini.empwebapp.services;

import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeTest;

public interface EmployeeService {
		
	  public boolean createEmployeeInfo(EmployeeTest test);
	  public boolean addEmployeeInfo(EmployeeTest test);
	  public boolean updateEmployeeInfo(EmployeeTest test);
	  public boolean deleteEmployeeInfo(int id);
	  public EmployeeTest getEmployeeDetailsByname(String name);
	  public List<EmployeeTest> getAllEmployeeDetails();
	public EmployeeTest authenticate(int id, String empPass);
	
}