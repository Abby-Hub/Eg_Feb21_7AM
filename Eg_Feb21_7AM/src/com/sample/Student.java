package com.sample;

public class Student {
	int id;
	String name;
	boolean status;
	
	public Student() {
		System.out.println("Deafult Constructor of Student class...");
	}
	
	public Student(int id, String name, boolean status){
		System.out.println("Param Constructor of Student class...");
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public void showStudent() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(status);
	}
	

}
