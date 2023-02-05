package Practice_Code_31st;

public class Animal1 {

	   public static void main(String[] args) {
	   System.out.println("I am coding");
		secret();
		Animal1.secret();
		
		jail();
		Animal1.jail();
		
		//Object non-static method
		Animal1 animal=new Animal1();
		animal.loginTest();
		
	    }
		
		
		private static void secret() {
			System.out.println("I have written some secret in this method");
		}
		
		protected static void jail() {
			System.out.println("I have written some protected in this method");
		}
		
		void loginTest() {
			System.out.println("I have written some default in this method");
		}
		
		

	}

	

