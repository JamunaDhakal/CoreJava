package ArrayOperation;

import java.util.Arrays;

public class ArrayDeepEqual {
	public static void main(String[] args) {
	 int[][] array1 = {{1, 2}, {3, 4}};
     int[][] array2 = {{1, 2}, {3, 4}};
     System.out.println("Array1 deep equals Array2: " + Arrays.deepEquals(array1, array2));
	}
}
