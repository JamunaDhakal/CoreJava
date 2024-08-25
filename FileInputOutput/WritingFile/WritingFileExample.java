package WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFileExample {
	
	public static void main(String[] args) {
	 String filePath = "output.txt";
	 String data = "Hello, BufferedWriter!\nThis is a more efficient file writing example in Java.........";
	 
	 try (FileWriter fileWriter = new FileWriter(filePath);){
		 
		
		 fileWriter.write(data);
		 System.out.println("Data written to file successfully.");
		 
	 }
	
	 catch(IOException e) {
		 e.printStackTrace();
		 
	 }
	}

}
