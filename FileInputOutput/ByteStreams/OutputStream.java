package ByteStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	
	public static void main(String[] args) {
		String filePath = "fileName.txt";
		
		try(FileOutputStream outputStream = new FileOutputStream(filePath)) {
			String data = "Hello, OutputStream";
			
			byte[] array = data.getBytes();
			outputStream.write(array);
			
			System.out.println("Data written to file successfully.");
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
