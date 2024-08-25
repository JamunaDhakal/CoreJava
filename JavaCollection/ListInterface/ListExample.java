package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
//		System.out.print(list);
		list.set(1, 20);
		
		for(int x : list) {
			System.out.println(x);
		}
		
//		list.get(2);
//		System.out.println(list.get(2));
//		
//		list.remove(3);
//		System.out.println(list);
//		
//		list.clear();
//		System.out.println(list);
		
//		list.size();
//		System.out.println(list.size());
		
		List<Integer> list2 =new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(16);
		list2.add(18);
		
		
//		list2.addAll(1,list);
		
//		list2.removeAll(list);
//		System.out.println(list2);
		
		boolean lists = list.containsAll(list2);
		System.out.println(lists);
		
		
		System.out.println(list.indexOf(2));
		System.out.println(list.indexOf(2));
		System.out.println(list.subList(0,2));
		
		
	}

}
