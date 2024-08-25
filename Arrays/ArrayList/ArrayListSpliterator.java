package ArrayList;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSpliterator {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		Spliterator<Integer> arr1 = arr.spliterator();
		
		System.out.println("First spliterator");
		
		while(arr1.tryAdvance( (n)->{System.out.println(n);})) ;
	}
}
