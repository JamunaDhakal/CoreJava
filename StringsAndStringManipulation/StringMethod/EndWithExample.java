package StringMethod;

public class EndWithExample {

	public static void main(String[] args)   {
	
		String str = "Hello,Welcome to Java";
		System.out.print(str.endsWith("to Java"));
		
		System.out.print(str.contentEquals("Hello,Welcome"));
	}

}
