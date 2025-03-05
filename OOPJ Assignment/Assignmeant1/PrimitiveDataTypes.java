//1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.
/*1.byte
2.	short
3.	int
4.	long
5.	float
6.	double
7.	char
8.	boolean
*/
class PrimitiveDataTypes {
    public static void main(String args[]) {
        // Declaring and initializing primitive data types
        byte b1 = 127;
        short sh = -32768;
        int a = 50;
        long l = 10800 * 60 * 24;
        float f = 123.4f;
        double d = 99.999d;
        char ch = 'B';
        boolean b = true;

        // Printing variable values (NOT data types)
        System.out.println("Byte value: " + b1);
        System.out.println("Short value: " + sh);
        System.out.println("Integer value: " + a);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + ch);
        System.out.println("Boolean value: " + b);
	}
}