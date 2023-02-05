package oops_java_programming_Feb_1st;



public class StaticAndNonStatic {

	//Static can be used in certain entities
		//Variable (Class level it can be used)
		//Variable( level it can be used. will throw an error)
		//With methods
		//with blocks
		//with inner class
		//static cannot be used with outer class
	
	String name="John";    /// an instance variable
	static int i= 25;      // is static variable
	
	public static void display(int j, int k) {
		int i = 2;    // local variable is neither static nor non static
		
	}
	
	public static void hello() {
		System.out.println("this is static hello method");
		
	}
	
	public void test() {
		System.out.println("Non static test method");
	}
	
	public static void main(String[] args) {
		display(1,2);
		StaticAndNonStatic.display(4,5);
		StaticAndNonStatic sam =new StaticAndNonStatic();
		
		sam.test();
		sam.hello();
		
		StaticAndNonStatic sam1 = new StaticAndNonStatic();
	}

	

}
