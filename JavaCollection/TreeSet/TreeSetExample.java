package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.remove(10);
		set.clear();
		System.out.print(set);
		System.out.print(set.contains(30));
		System.out.print(set.isEmpty());
		System.out.print(set.first());
		System.out.print(set.last());
		System.out.print(set.floor(20));
		System.out.print(set.ceiling(10));
		System.out.print(set.lower(30));
		System.out.print(set.higher(20));
		System.out.print(set.headSet(10));
		System.out.print(set.tailSet(20));
		System.out.print(set.subSet(10,20));
		System.out.print(set.size());
		
		for(int s : set) {
			System.out.println(s);			
		}
		
		Iterator<Integer> set1 = set.iterator();
		while(set1.hasNext()) {
			System.out.print(set1.next());
		}
		
	}


}
