package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionExample {

	
	public static void main(String[] args) throws IOException  {
		
			try (FileInputStream inputStream = new FileInputStream("fileName.txt")) {
				int byteData;
				while((byteData = inputStream.read()) !=-1) {
					 System.out.print((char) byteData);
				}
				 System.out.println("File copied successfully.");
			}
			catch (IOException e) {
	            e.printStackTrace();
	        }
			
		}
	

}
