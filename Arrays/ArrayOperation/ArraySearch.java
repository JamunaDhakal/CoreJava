package ArrayOperation;

import java.util.Arrays;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		int index = Arrays.binarySearch(numbers,3);
		
		System.out.print(index);
		
	}

}
