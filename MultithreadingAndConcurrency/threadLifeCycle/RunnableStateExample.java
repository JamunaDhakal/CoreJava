package threadLifeCycle;

public class RunnableStateExample {
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(()->{
			System.out.println("Thread is running.");
		});
		
		thread.start();
		Thread.sleep(100);
		System.out.println("Thread state is"+ thread.getState());
		
		
	}

}
