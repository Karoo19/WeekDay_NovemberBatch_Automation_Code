package oops_java_programming_Feb_1st;

public class StaticAndNonStatic {
	
	//Static can be used in certain entities
	//Variable (Class level it can be used)
	//Variable( level it can be used. will throw an error)
	//With methods
	//with blocks
	//with inner class
	//static cannot be used with outer class
	
	//Static belongs to class
	//non-static belongs to the object
	
	
	String name="John";    /// an instance variable
	static int i= 25;      // is static variable
	
	
	public static void display() {
		int x=2;     // local variable is neither static nor non static
	}
	
	public  void test() {
		System.out.println("This is static hello method");
	}
	
	public static void hello() {
		System.out.println("non static test method");
	}
	
	public static void main(String[] args) {
		display(1,2);
		StaticAndNonStatic.display(4,5);
		
		StaticAndNonStatic san = new StaticAndNonStatic();
		san.test();
		san.hello();
		
		
		
	}
	

}
