package Pattern_programming_java;

public class Pattern1 {
	
	//for 1 run of outer for loop, all the iterations of inner for loop will occur

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {              //outer for loop: numbers of rows
			for(int j=1; j<=5; j++) {          //inner for loop: numbers of column
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
