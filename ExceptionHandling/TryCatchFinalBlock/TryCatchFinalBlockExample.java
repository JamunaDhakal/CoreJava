package TryCatchFinalBlock;

public class TryCatchFinalBlockExample {
	public static void main (String[] args) 
    {
		
		try {
			int result = 10 / 0;
            System.out.println("Result: " + result);
            }
		
		catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
			}
		
		finally {
        System.out.println("This block always executes.");
        }
		
    }

}
