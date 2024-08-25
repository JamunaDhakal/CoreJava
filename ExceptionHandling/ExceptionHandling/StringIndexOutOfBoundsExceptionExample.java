package ExceptionHandling;

public class StringIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) { 
		
		String str = "hello world";
		
		try {
			 char validChar = str.charAt(5);
			 System.out.println("Character at index 5: " + validChar);
			
		}
		
		catch(StringIndexOutOfBoundsException sexp) {
			System.out.print("String index is out of bounds :" + sexp.getMessage());
			
		}
	}

}
