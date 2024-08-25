package CharacterStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) {
		String filePath = "Output.txt";
		
		String data = "Hello, BufferedWriter!\nThis is a more efficient file writing example in Java.";
		
		try(FileWriter fileWriter = new FileWriter(filePath);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write(data);
			bufferedWriter.write("Additional line using BufferedWriter.");

            System.out.println("Data written to file successfully.");
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
