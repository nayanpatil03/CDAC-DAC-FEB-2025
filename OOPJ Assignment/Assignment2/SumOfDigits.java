//Q3:‬‭ Implement a program that calculates the‬‭ sum of digits‬‭ of an integer using‬‭ modulus (%) and division (/) operators.

class SumOfDigits {
		public static void main(String[] args){
			int n = 527;
			int res = 0;
			while(n > 0){
				//loop  to extract and sum of the digits‬‭
				res = res + (n%10); 
				n = n / 10; 
				
			}
		      System.out.println("Sum of Digits: "+res);
		}

}