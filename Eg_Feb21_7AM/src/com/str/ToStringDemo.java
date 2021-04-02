package com.str;

class Student{
	int id;
	public Student(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
}


public class ToStringDemo {

	public static void main(String[] args) {
		String name = new String("Abdul");
		System.out.println(name.toString());  // Abdul
		System.out.println("******************");
		Student st = new Student(101);
		System.out.println(st.toString()); // 101
		
	}

}
