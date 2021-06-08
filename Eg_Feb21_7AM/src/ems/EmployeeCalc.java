package ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCalc {
	List<Employee> empList = new ArrayList<Employee>();

	public boolean addEmployee(Employee e) {
		return empList.add(e);
	}

	public List<Employee> showEmployees() {
		if (empList.isEmpty())
			return null;
		else
			return empList;
	}

	public Employee searchEmployee(String empId) {
		boolean flag = false;
		Employee emp = null;
		
		for(Employee e : empList) {
				if(empId == e.getEmpId()) {
					emp = e;
					flag = true;
					break;
				}
				
			}
		
		if(flag)
			return emp;
		else 
			throw new IdNotFoundException("Id Not Found  : "+ empId);
			
	}

	public boolean deleteEmployee(String empId) {
		boolean flag = false;
		Employee emp = null;
		
		for(Employee e : empList) {
				if(empId == e.getEmpId()) {
					emp = e;
					flag = true;
					break;
				}
				
			}
		
		if(flag)
			return empList.remove(emp);
		else 
			throw new IdNotFoundException("Id Not Found  : "+ empId);
	
	}
	
}
