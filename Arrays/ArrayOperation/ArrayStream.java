package ArrayOperation;

import java.util.Arrays;

public class ArrayStream {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
        System.out.println("Sum of array elements: " + Arrays.stream(numbers).sum());
	}

}
