package product;

public class Book implements Item {

	@Override
	public String getItemName() {
		return "Three Mistakes of My Life";
	}

	@Override
	public float getItemPrice() {
		return 450;
	}

}
