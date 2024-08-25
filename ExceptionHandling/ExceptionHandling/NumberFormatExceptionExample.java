package ExceptionHandling;

public class NumberFormatExceptionExample{
	
	  public static void main(String[] args) {
	        String validNumber = "1234";
	     
	        try {
	            int number = Integer.parseInt(validNumber);
	            System.out.println("Converted number: " + number);
	        } 
	        
	        catch (NumberFormatException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }


	        
	    }

}
