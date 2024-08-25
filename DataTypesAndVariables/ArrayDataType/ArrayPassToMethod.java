package ArrayDataType;

public class ArrayPassToMethod {
	
	public static void main(String[] args) {
		
		int[] numbers = {32,10,80,2};
		int min = min(numbers);
		System.out.print("The minimum value in the array: " + min);
		
	}
	
	public static int min(int[] arr) {
		
		int min = arr[0];
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				return min = arr[i];
			}
		
		}
		return min;
	}

}
