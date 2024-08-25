package ScopeOfVariable;

public class MethodLevelScope {
	
	public static void sum() {
		int a = 5;
		int b= 6;
		
		int sum = a + b;
		System.out.println("The sum is: " + sum);  
	}
	
	public static void main(String[] args) {
	sum();
	}

}
