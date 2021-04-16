package com.exp;

public class ExpTest2 {
	
	public void m1() throws ClassNotFoundException{
	
		
			throw new ClassNotFoundException(".class file not found");
	
		
	}

	public static void main(String[] args)  {
		System.out.println("main Starts...");
		try {
			new ExpTest2().m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		System.out.println("main ends...");
	}

}
