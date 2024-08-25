package Throws;

public class ThrowsExample {
	
	static void show() throws IllegalAccessException{
		try {
			throw new IllegalAccessException("demo");
		}
		catch(IllegalAccessException i){
			System.out.println("inside show");
			throw i;
			
		}
	}
		public static void main(String[] args) throws IllegalAccessException {
			try {
				show();
				
			}
			catch(IllegalAccessException i){
				System.out.println("inside main");
			
				
				
			}
		}

}
