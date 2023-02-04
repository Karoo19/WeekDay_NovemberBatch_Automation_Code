package java_code_jan_17th;

public class Test4 {

	public static void main(String[] args) {
		
		//WAP to print 20 multiples of 5 in decreasing 250 order to starting from 250 and add
		//250,245,240...20=sum
		
		int i = 250;
		int sum=0;
		while(i>=20) {   
		 
		        System.out.print(i + " ");
		        sum=sum+(5*i);
		        i=i-5;
     }
		System.out.println("the final summation will be : "+sum);

	}

}
