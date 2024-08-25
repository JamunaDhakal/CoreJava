package StringMethod;

public class CodePointBefore {

	    public static void main(String[] args) {
	
	        String str = "Hello, World";

	        int codePointBeforeIndex = str.codePointBefore(7);
	        
	        System.out.println("Code point before index 7: " + codePointBeforeIndex);
	    }
}
