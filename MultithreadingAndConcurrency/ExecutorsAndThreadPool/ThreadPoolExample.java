package ExecutorsAndThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadPoolExample {
	
	public static void main(String[] args) {
	      
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        for (int i = 1; i <= 5; i++) {
	            int taskNumber = i;
	            executor.submit(() -> {
	                System.out.println("Executing task " + taskNumber + " with thread " + Thread.currentThread().getName());
	
	                try {
	                    Thread.sleep(2000);
	                }
	                
	                catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }
	            });
	        }

	        executor.shutdown();
	    }
}
