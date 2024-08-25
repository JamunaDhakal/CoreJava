package ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveIf {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.removeIf( n -> n % 2 == 0);
		
		System.out.println(arr);
	}

}
