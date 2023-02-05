package Practice_Code_1st_Feb;

public class Addition {
	
	public static int addTwoNumbers(int a, int b, int c) {
		int sum= a+b;
		return sum;
		
	}
	
	//Method to do multiples things in Java
	public static void main (String[] args) {
		
		Addition ad = new Addition();
		int result= ad.addTwoNumbers(5, 10, 30);
		
		System.out.println("the sum is: "+result);
		
		//System.out.println(addTwoNumbers(5, 10));
	}

}
