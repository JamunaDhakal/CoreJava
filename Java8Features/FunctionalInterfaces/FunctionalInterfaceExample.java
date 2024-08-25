package FunctionalInterfaces;

import java.util.function.Function;

//Custom Functional Interfaces
@FunctionalInterface
interface MyFunctionInterface{
	int addition(int a, int b);
	 
 }

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		
	MyFunctionInterface add = (a, b) ->  a + b;
	System.out.println(add.addition(10, 5));
	
	Function<String, Integer> stringLength = String::length;
	System.out.println(stringLength.apply("Hello")); 
	
	 }
}
