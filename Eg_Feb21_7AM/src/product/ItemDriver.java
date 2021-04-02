package product;

public class ItemDriver {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem(new Pen());
		cart.addItem(new Laptop());
		cart.addItem(new Book());
		
		float price = cart.getTotalPrice();
		System.out.println("Total Amunt to Paid : "+ price);
	}

}
