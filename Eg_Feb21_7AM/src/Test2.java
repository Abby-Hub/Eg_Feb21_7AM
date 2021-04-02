
public class Test2 {
	
	public void add() {  // Instance (Non-static)
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println("From Test2  sum is : "+ c);
	}
	
	
	public static void getConnection() {
		System.out.println("logic to Connecting with MySQL DB");
	}

	public static void main(String[] args) {
		System.out.println("main starts...");
		Test2 t = new Test2(); // obj created
			t.add();
			Test2.getConnection();
		System.out.println("main ends...");
	}

}
