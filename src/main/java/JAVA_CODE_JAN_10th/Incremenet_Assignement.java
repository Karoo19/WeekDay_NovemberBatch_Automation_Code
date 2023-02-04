package JAVA_CODE_JAN_10th;

public class Incremenet_Assignement {

	public static void main(String[] args) {
		
		int i = 1;         //the latest value of i is 2
		int j = i++;       // the latest value of j is 1 and i is 2
		int k = ++j;       // the latest value of k is 2 and j is 2
		int m = k++ + ++i;   // the latest value of m is 3
		
		// k become 3
		//i become 3
		// m=
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);

	}

}
