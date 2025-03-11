//Q1:‬‭ Write a program to swap two numbers‬‭ without using a third variable‬‭ and without‬ using  arithmetic operators like + or -. 
//use bitwise XOR^operator.

class BitwiseXor{
	public static void main(String[] args){
		
		int a = 3;
		int b = 8;
		
	System.out.println("Befor swapping:a="+a+",b="+b);
		 
		 a=a^b;
		 b=a^b;
		 a=a^b;
		
		 
	System.out.println("After swapping:a="+a+",b="+b);
		}
}