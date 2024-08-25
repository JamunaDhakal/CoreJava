package FileClass;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

	public static void main(String[] args) {
		
		try {
			File file = new File("fileName.txt");
			File file1 = new File("output.txt");
			
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
				System.out.println("File created: " + file1.getName());
			}
			
			else {
                System.out.println("File already exists.");
            }
			System.out.println("Absolute Path: "+file.getAbsolutePath());
			System.out.println("Absolute Path of File2: "+file1.getAbsolutePath());
			System.out.println("Path: "+file.getPath());
			System.out.println("FileName: "+file.getName());
			System.out.println("FileName1: "+file1.getName());
			System.out.println("Parent directory path: "+file.getParent());
			System.out.println("Readble: "+file.canRead());
			System.out.println("Writeable: "+file.canWrite());
			System.out.println("Executeable: "+file.canExecute());
			System.out.println("File Exist: "+file.exists());
			System.out.println("This is Directory: "+file.isDirectory());
			System.out.println("This is File: "+file.isFile());
			System.out.println("File size in bytes: " + file.length());
			System.out.println("Writeable1: "+file.setWritable(true));
			

		}
		catch(IOException e) {
			System.out.println("An error occurred.");
            e.printStackTrace();
		}
	}
}
