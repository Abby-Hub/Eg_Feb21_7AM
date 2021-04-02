package com.sample;

import java.sql.Connection;

public class Test3 {
	
	public Test3() {
			System.out.println("Deafault Constructor....");
	}
	
	public Test3(int id, String name){
		System.out.println("param caonstructor...");
	}
	
	
	public void addition() {
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println("  sum is : "+ c);
	}
	
	public static void getConnection() {
		System.out.println("logic to Connecting with MySQL DB");
		Connection con =null;
		
		
	}
}
