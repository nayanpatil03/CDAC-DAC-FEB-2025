//Q2.Write a program to check whether a given number is‬‭ even or odd‬‭ using only‬‭ bitwise‬ operators‬‭ .‬ 
//Hint‬‭ : Use‬‭ n & 1‬‭ to check

class EvenOdd{
	public static void main(String[] args){
		int num=7;
		
		String result=((num&1)==0) ? "Even" : "Odd";
		
		System.out.println(result);
		
	}	
}