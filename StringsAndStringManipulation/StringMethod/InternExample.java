package StringMethod;

public class InternExample {

	public static void main(String[] args)   {
	
		String s1=new String("hello");  
		String s11="hello";
		String s2 = s11.intern();  
		String s3=new String("hello2");  
		String s4="hello";
		
		System.out.print(s11==s2);
		System.out.print(s1==s2);
		System.out.print(s3==s4);
		System.out.print(s1==s3);
		
	}

}
