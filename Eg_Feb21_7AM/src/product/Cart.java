package product;

public class Cart {
	
	private float totalPrice;
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void addItem(Item item) {  // upcasting
	
		System.out.println(item.getItemName()+" Item Added to Cart...");
		totalPrice += item.getItemPrice();

	}

}
