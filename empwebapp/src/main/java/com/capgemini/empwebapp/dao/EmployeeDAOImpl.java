package com.capgemini.empwebapp.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeTest;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public EmployeeTest getEmployeeDetailsByname(String name) {
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/emp_db?useSSL=false&user=root&password=root";
		String query = "select * from employee_info where name=?";
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");

			preparedStatement.setString(1, name);
			res = preparedStatement.executeQuery();
			EmployeeTest test = new EmployeeTest();
			if (res.next()) {
				test.setEid(res.getInt("eid"));
				test.setName(res.getString("name"));
				test.setEmailId(res.getString("email"));
				test.setMobilenono(res.getLong("mobilenono"));
				test.setGender(res.getString("gender"));
				return test;
			} else {
				return null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (res != null) {
					res.close();
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		return null;
	}


	@Override
	public boolean deleteEmployeetest(int id) {
		// TODO Auto-generated method stub
				String url = "jdbc:mysql://localhost:3306/emp_db?useSSL=false&user=root&password=root";
				String query = "delete from employee_info where eid=?";

				try (Connection connection = DriverManager.getConnection(url);
						PreparedStatement preparedStatement = connection.prepareStatement(query);) {
					Class.forName("com.mysql.jdbc.Driver");
					preparedStatement.setInt(1, id);
					int res = preparedStatement.executeUpdate();
					if (res != 0) {
						return true;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return false;
			}

	@Override
	public boolean updateEmployeetest(EmployeeTest test) {
		String query = "update employee_info set name=? where eid=?";
		String url = "jdbc:mysql://localhost:3306/emp_db?useSSL=false&user=root&password=root";
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");
			preparedStatement.setString(1, test.getName());
			preparedStatement.setInt(2, test.getEid());
			int res = preparedStatement.executeUpdate();
			if (res != 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean createEmployeetest(EmployeeTest test) {
		String url = "jdbc:mysql://localhost:3306/emp_db?useSSL=false&user=root&password=root";
		String query = "insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url);
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");
			preparedStatement.setInt(1, test.getEid());
			preparedStatement.setString(2, test.getName());
			preparedStatement.setString(4, test.getEmailId());
			preparedStatement.setLong(3, test.getMobilenono());
			preparedStatement.setString(5, test.getGender());
			preparedStatement.setInt(6, test.getAge());
			preparedStatement.setLong(7, test.getDob());
			preparedStatement.setString(8, test.getDesignation());
			preparedStatement.setLong(9, test.getSalary());
			preparedStatement.setLong(10, test.getDeptid());
			preparedStatement.setLong(11, test.getDoj());
			preparedStatement.setString(12, test.getBloodgroup());

			

			int res = preparedStatement.executeUpdate();

			if (res != 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<EmployeeTest> getAllEmployeeDetails() {
		String url = "jdbc:mysql://localhost:3306/emp_db?useSSL=false&user=root&password=root";
		String query = "select * from employee_info ";

		List<EmployeeTest> test = new LinkedList<EmployeeTest>();
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet res = preparedStatement.executeQuery();) {
			Class.forName("com.mysql.jdbc.Driver");
			while (res.next()) {
				EmployeeTest beans = new EmployeeTest();

				((EmployeeTest) test).setEid(res.getInt("eid"));
				((EmployeeTest) test).setName(res.getString("name"));
				((EmployeeTest) test).setEmailId(res.getString("email"));
				((EmployeeTest) test).setMobilenono(res.getLong("mobilenono"));
				((EmployeeTest) test).setGender(res.getString("gender"));
				((EmployeeTest) test).setAge(res.getInt("age"));
				((EmployeeTest) test).setDeptid(res.getInt("deptid"));
				((EmployeeTest) test).setDesignation(res.getString("designation"));
				((EmployeeTest) test).setDoj(res.getLong("doj"));
				((EmployeeTest) test).setDob(res.getLong("dob"));
				((EmployeeTest) test).setBloodgroup(res.getString("bloodgroup"));
				((EmployeeTest) test).setSalary(res.getLong("salary"));
				test.addAll(test);
			}

			if (test.isEmpty()) {
				return null;
			} else {
				return test;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}


	@Override
	public boolean addEmployeetest(EmployeeTest bean) {
		// TODO Auto-generated method stub
		return false;
	}

	
}

