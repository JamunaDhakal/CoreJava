package ArrayList;

import java.util.ArrayList;

public class ArrayListRemove {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		arr.remove(0);

		arr.remove(Integer.valueOf(10));
		
		System.out.println(arr);
	}

}
