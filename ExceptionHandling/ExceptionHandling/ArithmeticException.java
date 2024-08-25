package ExceptionHandling;

public class ArithmeticException {
	
	public void divide(int a, int b) {
		int result = a/b;
		System.out.println("Division process has been done successfully.");  
		System.out.println("Result: "+ result);  
	}
	
	public static void main(String argvs[])  
	{  
		ArithmeticException ae = new ArithmeticException();
		ae.divide(2, 0);
	}

}
