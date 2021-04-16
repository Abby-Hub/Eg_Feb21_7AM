package com.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColTest {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
	//	Set<String> c1 = new TreeSet<String>();
		c1.add("Scott");
		c1.add("Tiger");
		c1.add("Raja");
		c1.add("Dev");
		c1.add("Tiger");
		
		System.out.println("C1 : "+ c1);
		
		Iterator<String> itr = c1.iterator();
		
		while (itr.hasNext()) {
			String s1 = itr.next();
			System.out.println(s1);
		}
		
		System.out.println("*******************");
		
		for (String s : c1) {
			System.out.println(s);
		}
		
		/*//Collection<String> c2 = new ArrayList<String>();
		Set<String> c2 = new TreeSet<String>();
		c2.add("Pen");
		c2.add("Book");
		c2.add("Laptop");
		System.out.println(c2.addAll(c1));
		
		System.out.println("C2 :"+ c2);
		System.out.println("*************************");
		
		c1.remove("Tiger");
		System.out.println("C1 : "+ c1);
		System.out.println("C2 :"+ c2);
		
		System.out.println("*********************");
		c2.removeAll(c1);
		System.out.println("C2 :"+ c2);
		
		System.out.println(c2.size()); // 3
		System.out.println(c2.isEmpty()); // false
		c2.clear();
		System.out.println(c2.isEmpty()); // true
*/	}

}
