package ArrayOperation;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	
	public static void main(String[] args) {
		
		 String[] array = {"Java", "Python", "C++"};
		 
		 List<String> list = Arrays.asList(array);
		 
		 System.out.println("List: " + list);
	}

}
