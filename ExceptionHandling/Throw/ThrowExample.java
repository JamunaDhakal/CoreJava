package Throw;

public class ThrowExample {
	public static void show() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException nulls) {
			System.out.print("caught in side the show");
			throw nulls;
			
		}
		
	}
	
	public static void main(String[] main) {
		try {
			show();
		}
		catch(NullPointerException nulls) {
			 System.out.println("Caught in main.");
		}
	}
//	 public static void main(String[] args) throws InterruptedException
//	    {
////	        System.out.println(1 / 0);
//	        Thread.sleep(10000);
//	        System.out.println("hello nhhhh");
//	        
//	    }
	

	
}
