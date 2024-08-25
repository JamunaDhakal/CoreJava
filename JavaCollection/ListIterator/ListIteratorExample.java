package ListIterator;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> list1 = list.listIterator();
		
		
		while(list1.hasNext()) {
			Integer lists = list1.next();
			System.out.println(lists);
			
			if(lists== 50) {
				list1.add(60);
			System.out.println(lists);
		}
			
		}
		System.out.println("\nModified list: " + list);
		
	}


}
