package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

	public static void main(String[] args) {
		
        try {
            List<byte[]> memory = new ArrayList<>();

            while (true) {
                byte[] bytes = new byte[10 * 1024 * 1024]; // 10 MB
                memory.add(bytes); 
                System.out.println("Allocated 10 MB");
                
                Thread.sleep(100);
            }
            
        } 
        
        catch (OutOfMemoryError e) {
            System.err.println("Caught OutOfMemoryError: " + e.getMessage());
        } 
        
        catch (InterruptedException e) {
            System.err.println("Interrupted: " + e.getMessage());
        }
    }
}

