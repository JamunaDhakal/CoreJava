package ArrayList;

import java.util.ArrayList;

public class ArrayListClear {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		System.out.println("ArrayList before clear: " + arr);
		
		arr.clear();
		
		System.out.println("ArrayList after clear: "+arr);
	}
}
