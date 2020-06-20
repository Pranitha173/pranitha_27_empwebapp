package com.capgemini.empwebapp.services;

import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImpl;
import com.capgemini.empwebapp.dto.EmployeeTest;

public abstract class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDAO dao = new  EmployeeDAOImpl();
	
	public boolean createEmployeeTest(EmployeeTest test) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(test);
	}
	
	public boolean addEmployeeTest(EmployeeTest test) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean updateEmployeeTest(EmployeeTest test) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(test);
	}
	
	public boolean deleteEmployeeTest(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}
	
	public EmployeeTest getEmployeeDetailsByname1(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailsByname(name);
	}

	public List<EmployeeTest> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeTest authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeTest getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeTest authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeTest getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeTest authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}