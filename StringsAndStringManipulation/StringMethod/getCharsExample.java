package StringMethod;

public class getCharsExample {
	public static void main(String[] args) {
		
		  String str = "Hello, World!";
		  
	        int sBegin = 0; 
	        int sEnd = 5;  
	        char[] dst = new char[sEnd - sBegin];
	        int dstBegin = 0; 

	        str.getChars(sBegin, sEnd, dst, dstBegin);

	        String result = new String(dst);
	        System.out.println("Extracted substring: " + result); 
		}


}
