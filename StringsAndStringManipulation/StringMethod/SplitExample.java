package StringMethod;

public class SplitExample {
	
	public static void main(String args[]){  
		
		String s1="java string split method by java method";  
		String[] words=s1.split("\\s",2);
		
		for(String w:words){  
			System.out.println(w);  
		}  
	}
}
