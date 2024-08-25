package InterThreadCommunication;

class SharedResource{
	
	private int data;
	private boolean dataAvailable = false;
	
	public synchronized void produce(int value) {
		while(dataAvailable) {
	
			try {
				wait();
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		data = value;
		dataAvailable = true;
		System.out.print("Product :" +value);
		notify();
		
	}
	
	public  synchronized void comsume() {
		while(!dataAvailable) {
		
			try {
				wait();
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		dataAvailable = false;
		System.out.print("Consume: "+ data);
		notify();
		
	}
	
}

public class InterThreadCommunicationExample {
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		
		Thread producer = new Thread(()->{
			for(int i = 0; i < 5; i++ ) {
				sharedResource.produce(i);
				
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		
		Thread consumer = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				sharedResource.produce(i);
				
				try {
					Thread.sleep(10000);
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		
		
		
		
		
	}

}
