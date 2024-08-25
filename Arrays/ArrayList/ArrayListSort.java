package ArrayList;

import java.util.ArrayList;

public class ArrayListSort {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.set(0, 5);
		arr.sort(null);

		System.out.print(arr);
	}
}
