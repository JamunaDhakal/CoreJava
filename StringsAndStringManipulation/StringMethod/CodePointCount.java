package StringMethod;

public class CodePointCount {

	  public static void main(String[] args) {
			
	        String str = "Hello, World";
	        int codePoint = str.codePointCount(0, 6);
	        
	        System.out.println("Code point before index 7: " + codePoint);
	    }
}
