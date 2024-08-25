package ArrayList;

import java.util.ArrayList;

public class ArrayContain {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		System.out.println(arr.contains(20));
	}

}
