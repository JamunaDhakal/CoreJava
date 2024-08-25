package ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	
	public static void main(String[] args) {
	
		try (FileInputStream inputStream = new FileInputStream("fileName.txt");
				FileOutputStream outputStream = new FileOutputStream("fileName.txt");){
				
			int byteData;
			while((byteData = inputStream.read()) !=-1) {
				outputStream.write(byteData);
			}
			
			System.out.println("File copied successfully.");
		}
		
		catch (IOException e) {
            e.printStackTrace();
        }
	}
}
