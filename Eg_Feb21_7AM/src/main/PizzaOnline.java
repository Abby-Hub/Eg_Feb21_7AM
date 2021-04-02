package main;

import com.sun.org.apache.regexp.internal.recompile;

public class PizzaOnline {
	private float totalSales;
	
	public float order(Pizza pizza) {
		float amt = pizza.caluclatePrice();
		totalSales += amt;
		return amt;
		
	}
	
	public float getTotalSales() {
		return totalSales;
	}
	
	public static void main(String[] args) {
		PizzaOnline po = new PizzaOnline();
		VegPizza vp1 = new VegPizza(6, "PLAIN");
		NonVegPizza nvp1 = new NonVegPizza(9, "DELUXE");
		VegPizza vp2 = new VegPizza(12, "SUPREME");
		
		float price = po.order(vp1);
		System.out.println(price);
		
		price = po.order(nvp1);
		System.out.println(price);
		
		price = po.order(vp2);
		System.out.println(price);
		
		
		
		
		VegPizza vp3 = new VegPizza(6, "SUPREME");
		price = po.order(vp3);
		System.out.println(price);
		
		System.out.println(po.getTotalSales());
	}

}
