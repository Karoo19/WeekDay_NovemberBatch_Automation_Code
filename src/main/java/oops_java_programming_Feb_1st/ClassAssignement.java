package oops_java_programming_Feb_1st;

import Practice_Code_1st_Feb.Classassignement;

public class ClassAssignement {

	public int addition(int a, int b) {
		int sum=a + b;
		return sum;
		}
		
		public int substraction(int a, int b) {
			int sub=a - b;
			return sub;
			}
		
		public int multiplication(int a, int b) {
			int mult=a * b;
			return mult;
			}
		
		public int division(int a, int b) {
			int div= a / b;
			return div;
			}
		
		
		public static void main(String[ ] args) {
			
			Classassignement holly = new Classassignement();
			
			int sumresult = holly.addition(20, 30);
			System.out.println("the holly is: "+ sumresult);
			
			int subresult = holly.substraction(20, 30);
			System.out.println("the holly is: "+ subresult);
			
			int multresult = holly.multiplication(20, 30);
			System.out.println("the holly is: "+ multresult);
			
			int divresult = holly.division(20, 30);
			System.out.println("the holly is: "+ divresult);
		}
	



}
