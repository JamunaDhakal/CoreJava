package thread;

class MyThread extends Thread {
	
	@Override
	public void run() {
	
		for(int i=0;i<5;i++) {
			System.out.println("Thread running: " + i);
		}
		
		try {
			Thread.sleep(5000);
			
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
    
   
}

public class ThreadExample {
    
	public static void main(String[] args) {
       
    	MyThread thread = new MyThread();
    	
		thread.start();
    }
}
