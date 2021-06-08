package com.test;

import java.util.Date;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class Client {

	public static void main(String[] args) {
/*		Employee emp = new Employee();
		emp.setEmpId("e103");
		emp.setName("Emp3");
		emp.setDateOfJoining(new Date());
		emp.setBasicSal(6600);
		*/
	EmployeeDao dao = 	new EmployeeDaoImpl();
	/*boolean status = dao.save(emp);
		System.out.println(status);
	*/	
	
	List<Employee> list = dao.getEmployees();
	for (Employee employee : list) {
		System.out.println(employee);
	}
		
	
	}

}
