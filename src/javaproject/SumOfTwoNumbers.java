package javaproject;
import java.util.Scanner;

public class SumOfTwoNumbers {
	
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = sum(num1, num2);
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        
        scanner.close();
    }
}