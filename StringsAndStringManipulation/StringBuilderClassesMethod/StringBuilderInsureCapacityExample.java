package StringBuilderClassesMethod;

public class StringBuilderInsureCapacityExample {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		sb.append("hello");
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(50);  
		System.out.println(sb.capacity());
		
		
	}
}
