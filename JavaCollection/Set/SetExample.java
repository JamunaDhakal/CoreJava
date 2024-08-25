package Set;

//import java.util.LinkedHashSet;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		System.out.print(set);
		
//		Set<Integer> set = new LinkedHashSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(40);
//		System.out.print(set);
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.remove(20);
		set.clear();
		
		if(set.contains(20)) {
			System.out.println("The set contains 20");
		}
		
		
		for(int s : set) {
			System.out.println(s);			
		}
	}

}
