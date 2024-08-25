package Iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iteratorxample {
	 
	public static void main(String[] args) {
	       
	       List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(21);
	        numbers.add(32);
	        numbers.add(43);
	        numbers.add(54);

	
	        Iterator<Integer> iterator = numbers.iterator();

	       
	        while (iterator.hasNext()) {
	            Integer number = iterator.next();
	            if (number % 2 == 0) {
	                iterator.remove();
	            }
	        }

	      
	        System.out.println("Modified list after removing even numbers: " + numbers);
	    }


}
