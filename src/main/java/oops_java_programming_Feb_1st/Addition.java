package oops_java_programming_Feb_1st;

public class Addition {

	public static int addition(int a, int b) {
			int sum= a+b;
			return sum;
		}

	public static void main(String[] args) {

		Addition ad = new Addition();
		int result = ad.addition(2, 5);
		System.out.println("the sum is: " + result);
		System.out.println();

		System.out.println(addition1(2, 5, result));
	}

	public static int addition1(int a, int b, int result) {

		return 8;
	}
}
