// Sum Of Digit :3. Find the sum of digits of a given number.
//input 1234 : Sum of digits of 1234: 10


class SumOfDigit {

	static int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;		
            num = num / 10;
        System.out.println(sum);
		}
		
        return sum;
    }

	public static void main(String[] args) {
			
			int num = 1234;
			int result = sumOfDigit(num);
			System.out.println("Sum of digits of 1234: " + result);
	}
}
