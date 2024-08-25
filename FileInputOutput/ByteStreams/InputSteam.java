package ByteStreams;

import java.io.FileInputStream;

import java.io.IOException;

public class InputSteam {

	public static void main(String[] args) {
	
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
