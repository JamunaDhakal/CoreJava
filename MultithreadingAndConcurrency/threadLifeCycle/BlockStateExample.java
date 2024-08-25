package threadLifeCycle;

public class BlockStateExample {
	
	public static void main(String[] args) throws InterruptedException {
		final Object lock = new Object();
		Thread thread = new Thread(()->{
			synchronized(lock) {
		
				try {
					Thread.sleep(2000);
					System.out.println("Thread is Blocking.");
				}
				
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(()->{
			synchronized(lock) {
				 System.out.println("Thread 2 running.");
			}
		});
		
		thread.start();
		thread2.start();
		
		thread.join();
		thread2.join();
		
	}

}
