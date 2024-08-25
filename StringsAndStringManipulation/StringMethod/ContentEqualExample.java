package StringMethod;

public class ContentEqualExample {

	public static void main(String[] args)   {
	
		String str = "Hello,Welcome to Java";
		System.out.print(str.contentEquals("Hello,Welcome to Java"));
		
		System.out.print(str.contentEquals("Hello,Welcome"));
	}

}
