package StringBufferClassMethodExample;

public class StringBufferReplaceExample {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("hello ");
		sb.replace(1,2,"java");
		System.out.println(sb);
	}

}
