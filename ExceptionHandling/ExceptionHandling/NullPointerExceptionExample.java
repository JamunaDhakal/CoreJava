package ExceptionHandling;

public class NullPointerExceptionExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {

	        String str1 = null;
	        
	        try {
	            System.out.println(str1.length());
	        } 
	        
	        catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: The string is null!");
	        }	 
	}
}
