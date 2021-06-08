package com.col;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new Hashtable<Integer, String>();
		m1.put(101, "Sam");
		m1.put(111, "Dev");
		m1.put(115, "Scott");
		m1.put(105, "Fana");
		m1.put(109, "Sana");
		//m1.put(101, "New Name");
		System.out.println("m1: "+m1);
		
		Set<Integer> keys = m1.keySet();
	   System.out.println(keys);	
	   
	 for (Integer i : keys) {
		System.out.println(i+"  --->  "+m1.get(i));
	}
		
		
	/*	Map<Integer, String> m2 = new Hashtable<Integer, String>();
		m2.put(201, "Pen");
		m2.put(202, "Laptop");
		m2.put(203, "Book");
		m2.putAll(m1);
		System.out.println("m2: "+m2);
		
		System.out.println("**************************");
		System.out.println(m1.get(101));
		System.out.println("m1: "+m1);
		System.out.println("m2: "+m2);*/
	}

}
