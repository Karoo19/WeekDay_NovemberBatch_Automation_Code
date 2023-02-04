package Java_Code_Jan_11th;

public class LeapYear_orNot {
	
	//WAP to prove which one is leap Year or not

	public static void main(String[] args) {
		
		int year1 =1994;
		int year2 = 2000;
		
		if((year2 % 400== 0) || ((year2 % 4 == 0) && (year2 % 100 !=0)))
		{
			System.out.println("2000 is leap year");
		}else {
			System.out.println("2000 is not leap year");
		}
		

	}

}
