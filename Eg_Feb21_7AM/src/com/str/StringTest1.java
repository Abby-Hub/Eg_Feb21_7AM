package com.str;

public class StringTest1 {

	public static void main(String[] args) {
	     String s1 = new String("java");
	     System.out.println(s1);
		
	     String s2 = "JAVA";
	     
	    boolean flag =  s1.equals(s2);
	     System.out.println(flag); // false
	     
	     flag = s1.equalsIgnoreCase(s2);
	     System.out.println(flag); // true
	     
	     
	     int  i = s2.compareTo(s1);
	     System.out.println(i ); // non zero
	     
	     i = s1.compareToIgnoreCase(s2);
	     System.out.println(i); //0
	     
		
		
	}

}
