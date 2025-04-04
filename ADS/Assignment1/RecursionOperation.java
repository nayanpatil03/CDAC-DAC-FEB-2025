// chech if a number is prime recursion

class RecursionOperation {
	
	// chech if a number is prime recursion
	static int divisor = 2;
	static boolean isPrime(int num) {
		if(divisor == num) {
			return true;
		} else if(num%divisor == 0) {
			return false;
						
		} else {
			divisor = divisor + 1;
			return isPrime(num);
		}
	}

	public static void main(String[] args){
		
		// chech if a number is prime recursion
		int num = 7;
		System.out.println("Is Prime: "+ isPrime(num));  // o/p: Is Prime: true
	}
}