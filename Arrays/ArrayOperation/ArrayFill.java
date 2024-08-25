package ArrayOperation;

import java.util.Arrays;

public class ArrayFill {
	
	public static void main(String[] args) {
		
		int[] num= new int[5];
		Arrays.fill(num, 3);
		for(int x:num) {
			System.out.println(x);
		}

		
	}

}
