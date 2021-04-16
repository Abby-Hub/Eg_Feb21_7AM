package com.exp;

public class VoteTest {
	  
	public boolean validate(int age) throws InvalidAgeException {
		if(age < 18)
			throw new InvalidAgeException("U r not valid to vote");
		else
			return true;
	}
	
	

	public static void main(String[] args) {
		System.out.println("main starts...");
		VoteTest v = new VoteTest();
		try {
		boolean flag = v.validate(20);
		if(flag == true)
			System.out.println("U r valid to vote");
		}catch (InvalidAgeException e) {
			System.err.println(e);
		}
		
		System.out.println("main ends...");

	}

}
