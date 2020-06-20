package com.capgemini.empwebapp.services;

import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImpl;
import com.capgemini.empwebapp.dto.EmployeeTest;

public abstract class EmployeeServiceImpl implements EmployeeServices{
	
	EmployeeDAO dao = new  EmployeeDAOImpl();
	
	public boolean createEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(test);
	}
	
	public boolean addEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean updateEmployeeInfo(EmployeeTest test) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(test);
	}
	
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}
	
	public EmployeeTest getEmployeeDetailsByname(String name) {
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
	public boolean createEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeBean getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}