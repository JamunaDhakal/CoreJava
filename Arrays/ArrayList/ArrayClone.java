package ArrayList;

import java.util.ArrayList;

public class ArrayClone {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> copy =(ArrayList<Integer>) arr.clone();
		
		System.out.println(arr);
		copy.set(0, 5);
		
		System.out.println(copy);
		
		
		
	}
	

}
