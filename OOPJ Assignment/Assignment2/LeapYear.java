//Q7: Implement a Java program that checks whether a given year is a leap year or not. using logical ( && , || ) operators.

import java.util.Scanner;
class LeapYear {

		public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter a year: " );
				int year = sc.nextInt();
				
		
		
		if ((year % 400 == 0) || (year%4 ==0 && year % 100 != 0)){
			System.out.println(year + "Is a Leap Year!");
		} else {
					
			System.out.println(year + "Is not Leap Year!");
				
		}
			sc.close();		
	}
	
}	
