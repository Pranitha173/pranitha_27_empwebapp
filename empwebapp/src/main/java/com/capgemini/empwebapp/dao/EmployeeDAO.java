package com.capgemini.empwebapp.dao;



import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeTest;


public interface EmployeeDAO {
  public EmployeeTest getEmployeeDetailsByname(String name);
  public boolean deleteEmployeetest(int id);
  public boolean updateEmployeetest(EmployeeTest bean);
  public boolean createEmployeetest(EmployeeTest bean);
  public boolean addEmployeetest(EmployeeTest bean);
  public List<EmployeeTest> getAllEmployeeDetails();
}

