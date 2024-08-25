package ArrayOperation;

import java.util.Arrays;

public class ArraySort {
	
	 public static void main(String[] args) {
		 
	        int[] numbers = {5, 3, 8, 1, 2};
	        Arrays.sort(numbers);
	        for(int x:numbers) {
	        	System.out.println(x);
	        }
	        
	        System.out.println("Sorted Array: " + Arrays.toString(numbers));
	        
	    }

}
