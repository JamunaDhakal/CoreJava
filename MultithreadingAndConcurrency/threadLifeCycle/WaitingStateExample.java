package threadLifeCycle;

public class WaitingStateExample {
	
	public static void main(String[] args) throws InterruptedException {
		Object lock =new Object();
		Thread thread = new Thread(()->{
			synchronized(lock) {
				
				try {
					lock.wait();
					System.out.println("Thread is waiting state");
				}
	
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread.start();
		Thread.sleep(100);
		
		synchronized(lock) {
			lock.notify();
		}
		
		thread.join();
	}

}
