package com.str;

public class StringTest2 {

	public static void main(String[] args) {
		                     // 0  1   2      3     4        5
	/*	String s1 = "Java is very Cool prog lang";
		System.out.println(s1);
		String [] tokens = s1.split(" ");
		
		int size = tokens.length;
		
		for(int i =0; i<size; i++)
	    	System.out.println(tokens[i]);*/
		
		String s1 = "2/4/2021";
		System.out.println(s1);
		String [] tokens = s1.split("/");
		
		int size = tokens.length;
		
		for(int i =0; i<size; i++)
	    	System.out.println(tokens[i]);
		
		
		
		
	}

}
