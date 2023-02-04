package java_code_january_24;

public class ForLoop_Program4 {

	public static void main(String[] args) {
		
		//use for loop to print first 20 multiples of 5 and add the multiples
		
		int sum=0;
		for( int i=1; i<=20; i++) {
			System.out.println(i*5);
			sum=sum+(i*5);
		}
		System.out.println("the sum is: "+ sum);

	}

}
