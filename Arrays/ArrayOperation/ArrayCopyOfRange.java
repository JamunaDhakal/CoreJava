package ArrayOperation;

import java.util.Arrays;

public class ArrayCopyOfRange {
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7};
		int[] copy = Arrays.copyOfRange(original,2, 6);
		
		System.out.print("Copy array: "+ Arrays.toString(copy));
	}

}
