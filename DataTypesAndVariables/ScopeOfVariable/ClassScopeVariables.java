package ScopeOfVariable;

public class ClassScopeVariables {

	public static int a ;
	public static int b;
	
	public static void sum() {
		int sum = a + b;
		System.out.println("The sum is: " + sum);  
	}
	
	public static void main(String[] args) {
		sum();
	}

}
