package Oops_java_programming_Feb_7th;

public class Clarifying_Object {

	// How do we create Objects ??
		// 1. new keyword
		// 2. newInstance() method
		// 3. clone() method
		// 4. deserialization
		// 5. factory methods

		String name;
		int age;
		double height;
		static String name1;

		public static void main(String[] args) {

			Clarifying_Object co = new Clarifying_Object();

			Clarifying_Object co1 = new Clarifying_Object();

			co.name = "Guss";

			Clarifying_Object.name1 = "Jumbo";

			co.test1();
			co1.test1();

		}

		public void test1() {

		}

	
}
