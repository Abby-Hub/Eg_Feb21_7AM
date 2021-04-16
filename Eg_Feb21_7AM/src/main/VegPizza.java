package main;

public class VegPizza extends Pizza {
	private int size;
	private String type;
	
	
	
	public VegPizza(int size, String type) {
		if(validate(size, type)) {
		this.size = size;
		this.type = type;
		}
		else
				System.out.println("Invalid Veg Pizza you Choose... Pls Check :-(");
		       // throw InvalidPizzaException("Invalid Veg Pizza you Choose... Pls Check :-(");
	}



	@Override
	public float caluclatePrice() {
		float price = 50 * size  ;
		
		if(type.equalsIgnoreCase("DELUXE"))
			price = price + 100;
		else
			if(type.equalsIgnoreCase("SUPREME"))
				price = price + 200;
		
		return price;
	}

}
