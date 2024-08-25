package StringMethod;

public class copyValueOfExample {

	@SuppressWarnings("static-access")
	public static void main(String[] args)   {
	
		char[] myStr = {'w','e','l','c','o','m','e'};
		String str = "";
		str = str.copyValueOf(myStr,0,7);
		
		System.out.print(str);
		
	}

}
