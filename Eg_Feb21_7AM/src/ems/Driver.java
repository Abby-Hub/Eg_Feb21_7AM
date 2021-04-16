package ems;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId("e101");
		emp.setName("Emp1");
		emp.setDateOfJoining(new Date());
		emp.setBasicSal(5500);
		
		System.out.println("Emp1 obj injected with valid inputs...");
		
		Employee emp2 = new Employee();
		emp2.setEmpId("e102");
		emp2.setName("Emp2");
		emp2.setDateOfJoining(new Date());
		emp2.setBasicSal(6500);
		
		System.out.println("Emp2 obj injected with valid inputs...");
		
		Employee emp3 = new Employee();
		emp3.setEmpId("e103");
		emp3.setName("Emp3");
		emp3.setDateOfJoining(new Date());
		emp3.setBasicSal(7500);
		
		System.out.println("Emp3 obj injected with valid inputs...");
		
		EmployeeCalc c = new EmployeeCalc();
		boolean status = c.addEmployee(emp);
		if(status)
			System.out.println("Emp Data Inserted...");
		else
			System.out.println("Emp Data not Inserted... pls contact Admin");
		
		 status = c.addEmployee(emp2);
		if(status)
			System.out.println("Emp2 Data Inserted...");
		else
			System.out.println("Emp2 Data not Inserted... pls contact Admin");
		
		 status = c.addEmployee(emp3);
		if(status)
			System.out.println("Emp3 Data Inserted...");
		else
			System.out.println("Emp3 Data not Inserted... pls contact Admin");
		
		System.out.println("*********************************");
		
		List<Employee > list  = c.showEmployees();
		System.out.println("************ with Iterator ***********");
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println(employee);
			
		}
		
		System.out.println("************ with For Each ***********");
		
		for (Employee e : list) {
			System.out.println(e);
		}
		
	}

}
