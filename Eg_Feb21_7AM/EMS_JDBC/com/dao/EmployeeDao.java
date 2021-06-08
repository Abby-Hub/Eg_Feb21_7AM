package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmployeeDao {
	
	boolean save(Employee emp);    // returns 'true' if emp data inserted, otherwise returns 'false'
	List<Employee> getEmployees(); //fetch Emplyee records and return as List collection
	Employee get(String empId);
	boolean delete(String empId);
	boolean search(String empId);
	
}
