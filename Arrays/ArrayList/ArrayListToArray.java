package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		Object[] numArray = arr.toArray();
		
		for(Object x : numArray) {
		      System.out.println(x);
		    }

	}

}
