package JAVA_CODE_JAN_10th;

public class CONCATENATION_IN_JAVA {

	public static void main(String[] args) {
		
		// concatenation is adding (no is wrong answer)
				//concatenation is joining and we use+operator
				
				int i =2;
				int j =3;
				String S1= "Hello";
				String S2= "world";
				
				System.out.println(i+j);           //5
				System.out.println(i+j+S1);        // 5Hello
				System.out.println(i+j+S1+S2);     // 5HelloWorld
				System.out.println(S1+S2+i+j);     //HelloWorld23
				System.out.println(S1+S2+(i+j));   //HelloWorld5
				System.out.println("The value of i joining i with j I:" +i+j);
				System.out.println("The value of i joining i with j:"+(i+j));
				
				//assigning spaces
				
				System.out.println(S1+" "+ S2);
				System.out.println(S1+" "+S2+ " "+ i +" "+ j);
				
				String S10= "My name is karima";
				String S11= ",I am 35";
				System.out.println(S10+ " "+ S11);

	}

}
