package ems;

import java.util.Date;

public class Employee {
	private String empId;
	private String name;
	private Date dateOfJoining;
	private float basicSal;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) { // e01
		int size = empId.length();
		if(size >=4)
		this.empId = empId;
		else
			throw new InvalidDataException("Empid should not lessthan 4 digits but found "+size+" : " + empId);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public float getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(float basicSal) {
		if(basicSal >= 5000)
		this.basicSal = basicSal;
		else
			throw new InvalidDataException("Basic salary should not lessthan 5000 but found  :"+ basicSal);

	}
	
	@Override
	public String toString() {
		return getEmpId()+"\t"+ getName()+"\t"+ getDateOfJoining()+"\t"+getBasicSal();
	}

}
