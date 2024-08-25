package StringBuilderClassesMethod;

public class StringBuilderCapacityExample {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		sb.capacity();
		System.out.println(sb);
		
		sb.append("welcome to java");
		System.out.println(sb.capacity());
		
	}

}
