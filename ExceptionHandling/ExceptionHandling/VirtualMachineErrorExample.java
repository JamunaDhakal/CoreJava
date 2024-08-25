package ExceptionHandling;

public class VirtualMachineErrorExample {
	
	 public static void main(String[] args) {
		   
	        try {
	            recursiveMethod();
	        } 
	        
	        catch (StackOverflowError e) {
	            System.err.println("Caught StackOverflowError: " + e.getMessage());
	        }
	    }

	    private static void recursiveMethod() {
	        recursiveMethod();
	    }

}
