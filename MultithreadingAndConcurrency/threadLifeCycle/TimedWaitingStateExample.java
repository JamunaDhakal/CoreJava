package threadLifeCycle;

public class TimedWaitingStateExample {
	 
	public static void main(String[] args) throws InterruptedException {
	        Thread timedThread = new Thread(() -> {
	           
	        	try {
	                Thread.sleep(2000); 
	                System.out.println("Thread resumed after sleep.");
	            } 
	        	
	        	catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        timedThread.start();

	
	        timedThread.join();
	    }

}
