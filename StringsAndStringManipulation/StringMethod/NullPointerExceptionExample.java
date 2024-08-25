package StringMethod;

public class NullPointerExceptionExample {
	public static void main(String[] args)   {
		String str = null;
		@SuppressWarnings("null")
		int result = str.compareTo("hello world");
		System.out.print(result);
		
	}
	

}
