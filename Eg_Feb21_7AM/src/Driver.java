import com.sample.Caluclator;
import com.sample.Car;
import com.sample.MyCalc;
import com.sample.Toy;

public class Driver {

	public static void main(String[] args) {
		System.out.println("main Starts...");
		
		Caluclator c = new MyCalc();  // upcasting
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(10, 20));
		System.out.println(c.mul(12, 15));
		System.out.println(c.div(10, 2));
		
		
		/*Toy t1 = new Car();
		t1.move();
		t1.makeSound();*/
		
		
		
		/*A a1 = new A();
		System.out.println(a1.x);
		a1.m1();
	
		
		B b1 = new B();
		System.out.println(b1.y);
		System.out.println(b1.x);
		b1.m1();
		b1.m2();
		
		
		System.out.println("*****************");
		
		A a2 = new B();  // up casting
		System.out.println(a2.x);
		a2.m1();*/
//		System.out.println(a2.y);  // invlid
//		a2.m2();
//		
		
		
		
		
		
		
		
		
		/*BankAccount cust1 = new BankAccount(1234, "Frist Cust", 3000);
		BankDb.saveAccInfo(cust1);*/
		
	/*	Student st = new Student();
		st.showStudent();
		System.out.println("*****************");
		Student st2 = new Student(101, "AnyName", true);
		st2.showStudent();
		*/
		/*Test3 t = new Test3(1, "anyName");
			t.addition();
			Test3.getConnection();
			
			System.out.println("***************");
			Test2 t2 = new Test2();
			t2.add();*/
			
			System.out.println("main ends...");
	}

}
