package StringMethod;

public class FormatExample {
	
	public static void main(String[] args)   {
		
		String str2 ="hello my name is %s one killo is %,d byte";
        System.out.print(String.format(str2,"Jamuna", 1021));
		
	}

}
