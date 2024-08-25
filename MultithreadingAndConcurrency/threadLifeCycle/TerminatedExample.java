package threadLifeCycle;

public class TerminatedExample {
	
	public static void main(String[] args) throws InterruptedException {
	        Thread terminatedThread = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                System.out.println("Thread is running.");
	                
	                try {
	                    Thread.sleep(500);
	                } 
	                
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        terminatedThread.start();
	        terminatedThread.join();
	        System.out.println("Thread state: " + terminatedThread.getState());	        
	    }
}



