package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
	
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.remove(20);
		set.clear();
		System.out.println(set);	
		System.out.println(set.contains(20));	
		System.out.println(set.isEmpty());
		System.out.println(set.hashCode());	
		System.out.println(set.equals(set));	
		
		for(int s : set) {
			System.out.println(s);			
		}
		System.out.println(set.size());
		
		Iterator<Integer> set1 = set.iterator();
		while(set1.hasNext()) {
			System.out.print(set1.next());
		}
		
	}

	

}
