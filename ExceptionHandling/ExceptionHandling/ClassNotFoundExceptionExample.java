package ExceptionHandling;

public class ClassNotFoundExceptionExample {

	public static void main(String[] args)  { 
	
		try {
			   Class.forName("contructor");	   
		   }
		  
		catch(ClassNotFoundException e) {
			   System.out.println("Class not found: " + e.getMessage());  
			   e.printStackTrace(); 
		   }
	   }

}
