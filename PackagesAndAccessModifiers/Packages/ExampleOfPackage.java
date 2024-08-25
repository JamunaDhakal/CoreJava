package Packages;

import java.util.Scanner;

public interface ExampleOfPackage {
	
	public static void main(String[] args) {
		
		int x,y,z,result;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		x = s.nextInt();
		
		System.out.print("Enter the second number: ");
		y = s.nextInt();
		
		System.out.print("Enter the second number: ");
		z = s.nextInt();
		
		result = sum(x,y,z);
		System.out.print("The sum of the three numbers is: "+ result);
	}
	
	
	public static int sum(int a, int b, int c) {
	
	int sum = (a + b + c);
	return sum;	
	
}


}
