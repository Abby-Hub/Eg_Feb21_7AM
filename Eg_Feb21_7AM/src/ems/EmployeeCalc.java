package ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCalc {
	List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e) {
		return empList.add(e);
	}
	
public List<Employee> showEmployees() {
	if(empList.isEmpty())
		return null;
	else
		return empList;
	}

}
