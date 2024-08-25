package StringBufferClassMethodExample;

public class StringBufferCapacityExample {
	
	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("hello,welcome to java");
		System.out.println(sb.capacity());
		
	}


}
