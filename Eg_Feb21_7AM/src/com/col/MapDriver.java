package com.col;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class MapDriver {

	public static void main(String[] args) {
		ProductService service = new ProductServieImpl();  // up casting
		
		
		// create product obj's
		Product p1 = new Product();
		p1.setId(101);
		p1.setName("Soap");
		p1.setPrice(25);
		p1.setMfd(new Date());
		
		service.add("Product1", p1);
		System.out.println("P1 data inserted to Map");
		
		Product p2 = new Product();
		p2.setId(102);
		p2.setName("Book");
		p2.setPrice(250);
		p2.setMfd(new Date());
		
		service.add("Product2", p2);
		System.out.println("P2 data inserted to Map");
		
		
		Map<String, Product> map = service.getProducts();
		System.out.println(map);	
		System.out.println();
	
		System.out.println("**************************");
	     Set<String> keys =  map.keySet();
	     System.out.println(keys);
	     for (String key : keys) {
	    	 System.out.println(map.get(key));
		}
	    System.out.println("***********Deleted product ************");
	     Product p = service.delete(101);
	   System.out.println(p);
	   
	   System.out.println("****************Get**************");
	   Product product = service.get(101);
	   System.out.println(product);
	
	}

}
