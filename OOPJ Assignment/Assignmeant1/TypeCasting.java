//Q3.Write a program to convert a double value to int using typecasting and explain the data loss.

public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.75; // A double value
        int a = (int) d; // Typecasting double to int

        System.out.println("Original double value: " + d);
        System.out.println("Converted int value: " + a);
    }
}