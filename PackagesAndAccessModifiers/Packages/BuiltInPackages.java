package Packages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BuiltInPackages {
	
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("Python");
	        list.add("JavaScript");

	        System.out.println("Programming Languages: " + list);

	      
	        File file = new File("example.txt");
	        
	        try (FileWriter writer = new FileWriter(file)) {
	            writer.write("Hello, World!");
	            System.out.println("File written successfully.");
	        }
	        
	        catch (IOException e) {
	            System.err.println("Error writing to file: " + e.getMessage());
	        }
	    }

}
