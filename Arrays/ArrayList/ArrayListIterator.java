package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(20);
		arr.add(40);
		arr.add(20);
		
		Iterator<Integer> arr1 = arr.iterator();
		
		while(arr1.hasNext()) {
			System.out.println(arr1.next());
		}
	}
}
