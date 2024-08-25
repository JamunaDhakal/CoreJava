package StringMethod;

public class StringCompareTo {
	
    public static void main(String[] args) {
    	
    	String str1 = "Hello";
    	String str2 = "Hello1";
    	
    	int compare = str1.compareTo(str2);
    	
    	System.out.print(compare);
    	
    	if(compare < 0) {
    		System.out.println(str1 + " come before " + str2 +" logicographically.");
    		
    	}
    	else if(compare > 0) {
    		System.out.println(str1 + "come after " + str2 +"logicographically.");
    		
    	}
    	else {
    		System.out.println(str1 + "and  " + str2 +"logicographically equal");
    		
    	}
    	
    	
    }

}
