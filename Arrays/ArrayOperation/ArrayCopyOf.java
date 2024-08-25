package ArrayOperation;

import java.util.Arrays;

public class ArrayCopyOf {
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3};
		int[] copy = Arrays.copyOf(original,5);
		
		System.out.print("Copy array: "+ Arrays.toString(copy));		
	}

}
