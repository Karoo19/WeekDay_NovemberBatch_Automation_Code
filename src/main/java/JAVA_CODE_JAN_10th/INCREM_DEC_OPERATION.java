package JAVA_CODE_JAN_10th;

public class INCREM_DEC_OPERATION {

	public static void main(String[] args) {
		
		int i=1;
		i++;            //post increment operator
		++i;            //pre increment operator
		i--;            //post decrement operator
		--i;            //pre decrement
		
		int a = 5;      // latest value of a is 5
		int b = a++;    // 
		// the latest value of b is 5
		// the latest value of a is 6
		System.out.println(a);    // 6
		System.out.println(b);    //5
		
		
		int s = 1;      // latest value of i is 1
		int j= s++;    // here j pickup s so the value of j is 1
		               // s will s++ mean 2
		System.out.println(s);
		System.out.println(j);

	}

}
