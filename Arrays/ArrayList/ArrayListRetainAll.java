package ArrayList;

import java.util.ArrayList;

public class ArrayListRetainAll {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(4);
		arr1.add(6);
		
		arr.retainAll(arr1);
		
		System.out.println(arr);
	}
		

}
