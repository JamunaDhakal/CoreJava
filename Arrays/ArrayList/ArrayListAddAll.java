package ArrayList;

import java.util.ArrayList;


public class ArrayListAddAll {

	public static void main(String[] args) {
	
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);
		
		list1.addAll(1,list2);
		
		System.out.print(list1);
		
	}

}
