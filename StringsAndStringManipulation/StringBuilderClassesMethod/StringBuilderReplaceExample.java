package StringBuilderClassesMethod;

public class StringBuilderReplaceExample {
	
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("hello ");
		sb.replace(1,2,"java");
		System.out.println(sb);
	}

}
