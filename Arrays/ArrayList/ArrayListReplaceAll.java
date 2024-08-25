package ArrayList;

import java.util.ArrayList;

public class ArrayListReplaceAll {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.replaceAll(n -> n+1);
		
		System.out.print(arr);
	}

}
