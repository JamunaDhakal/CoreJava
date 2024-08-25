package ExceptionHandling;

public class StackOverflowErrorExample {
	
	public static void main(String[] args) {
        recursiveMethod(5);
    }

    private static void recursiveMethod(int count) {
    	
        if (count == 0) {
            System.out.println("Base case reached.");
            return;
        }
        
        System.out.println("Count: " + count);
        recursiveMethod(count - 1);
    } 

}
