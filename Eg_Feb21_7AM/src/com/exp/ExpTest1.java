package com.exp;

public class ExpTest1 {
	
	public void div(){
		int x =10;
		int y =0;
		try {
		/*int z = x/y;  
		System.out.println("Result "+ z);*/
			
			 throw new ArithmeticException("/ by zero  sdf;ljasdhfals;df");
		
		
		}catch (ArithmeticException e) {
			//System.err.println("Denomintor should not be zero... ");
			//System.err.println(e);
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Im Finally block logic");
		}
		System.out.println("Hello world...");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts...");
		new ExpTest1().div();
		System.out.println("Main Ends...");
	}

}
