package Pattern_programming_java;

public class Pattern2 {
	
	//for 1 run of outer for loop, all the iterations of inner for loop will occur

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
