package LinkListMethod;

import java.util.LinkedList;
import java.util.Spliterator;

public class LinkListExample {
	
	public static void main(String[] args) {
	
		LinkedList<Integer> list = new LinkedList<Integer>();
//		For add method 
//		list.add(1);
//		list.addFirst(2);
//		list.addLast(3);
//		list.add(2,4);
//		list.clear();
//		System.out.print(list);
		
//		For clone method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		LinkedList list1 = (LinkedList)list.clone();
//		System.out.print(list1);
		
//		For contain method
//		System.out.print(list.contains(60));
		
//		For foreach method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		list.forEach((n)->{System.out.println(n);});
		
//		For get method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.get(0));
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
		
//		For indexOf method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.indexOf(20));
		
//		For isEmpty method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.isEmpty());
		
		
//		For iterator method
//		list.add(20);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		
//		Iterator<Integer> list2 = list.iterator();
//		
//		while(list2.hasNext()) {
//			System.out.println(list2.next());
//		}
		
		
//		For lastIndexOf method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.lastIndexOf(80));
		
		
//		For ListIterator method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		
//		ListIterator<Integer> list1 = list.listIterator();
//		
//		while(list1.hasNext()) {
//			System.out.println(list1.next());
//		}
//		
//		System.out.println("---");
//		
//		while(list1.hasPrevious()) {
//			System.out.println(list1.previous());			
//		}
		
//		For remove method
//		list.add(20);
//		list.add(3);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);	
//		list.remove();
//		list.remove(2);
//		list.removeFirst();
//		list.removeLast();
//		list.removeAll(list);
//		list.removeIf(n->n%2==0);
//		System.out.println(list);
		
//		For replace method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		list.replaceAll(n -> n + 1);
//		System.out.println(list);
		
//		For retainAll method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		
//		LinkedList<Integer> list2 = new LinkedList<Integer>();
//		list2.add(20);
//		list2.add(30);
//		list2.add(40);
//		list2.add(60);
//		list2.add(80);
//		list.retainAll(list2);
//		System.out.println(list);
		
		
//		For sort method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		Collections.sort(list);
//		System.out.println(list);
		
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		list.sort(null);
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
		
//		For set method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		list.set(2,30);
//		System.out.println(list);
		
//		For size method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.size());
		
		
//		For Spliterator method
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);

		Spliterator<Integer> list1 = list.spliterator();
		Spliterator<Integer> list2 = list1.trySplit();
		
		System.out.println("First spliterator");
		while(list1.tryAdvance((n) -> {System.out.println(n);}));
	
		
		System.out.println("\nSecond trySplit");
		while(list2.tryAdvance((n) -> {System.out.println(n);}));
		
//		For sublist method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		System.out.println(list.subList(2,4));
		
//		For toArray method
//		list.add(20);
//		list.add(80);
//		list.add(40);
//		list.add(60);
//		list.add(80);
//		
//		
//		Object[] array = list.toArray();
//		for(Object x : array) {
//			System.out.println(x);			
//		}
					
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
