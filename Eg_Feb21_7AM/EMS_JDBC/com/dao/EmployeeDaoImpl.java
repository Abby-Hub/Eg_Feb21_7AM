package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public static Connection con = null;

	static {
		try {
			if (con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_march7am", "root", "root");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (con != null)
			System.out.println("Connected with MySQL DB");
		else
			System.out.println("connection Failed...");
	}

	@Override
	public boolean save(Employee emp) {
		int i = 0;
		try {
			String qry = "insert into Emp values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(qry);
			pst.setString(1, emp.getEmpId());
			pst.setString(2, emp.getName());
			pst.setDate(3, new java.sql.Date(emp.getDateOfJoining().getTime()));
			pst.setFloat(4, emp.getBasicSal());
			i = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i != 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getEmployees() {
		Employee emp = null;
		List<Employee> empList = new ArrayList<Employee>();
		try {
			String qry = "Select * from Emp";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(qry);
			
			while (rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getString(1));
				emp.setName(rs.getString(2));
				emp.setDateOfJoining(rs.getDate(3));
				emp.setBasicSal(rs.getFloat(4));
				empList.add(emp); // emp obj inserted into list collection
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if (empList.isEmpty())
			return null;
		else
			return empList;
	}

	@Override
	public Employee get(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
