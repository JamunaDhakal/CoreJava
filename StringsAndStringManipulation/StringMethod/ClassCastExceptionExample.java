package StringMethod;

public class ClassCastExceptionExample {
	
	 public static void main(String[] args) {
	       
	        Object obj = "Hello, World!";
	        
	        try {
	            Integer number = (Integer) obj; 
	            System.out.println("Integer: " + number);
	        } 
	        
	        catch (ClassCastException e) {
	            System.out.println("Caught ClassCastException: " + e.getMessage());
	        }
	    }
}