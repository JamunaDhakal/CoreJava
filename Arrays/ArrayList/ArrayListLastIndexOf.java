package ArrayList;

import java.util.ArrayList;

public class ArrayListLastIndexOf {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(20);
		arr.add(40);
		arr.add(20);
		
		System.out.println(arr.lastIndexOf(20));
		
		System.out.println(arr);
	}

}
