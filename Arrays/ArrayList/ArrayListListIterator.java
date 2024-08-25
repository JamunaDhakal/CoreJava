package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		ListIterator<Integer> arr1 = arr.listIterator();
		
		 while(arr1.hasNext()) {
		      System.out.println(arr1.next());
		      }
		 
		System.out.println("---");
		
		while(arr1.hasPrevious()) {
			System.out.println(arr1.previous());	
		}
	}
}
