package threadLifeCycle;

public class NewStateExample {
	
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("This code won't run because the thread hasn't started.");
		});
		 System.out.println("Thread state before starting: " + thread.getState());
	
	}

}
