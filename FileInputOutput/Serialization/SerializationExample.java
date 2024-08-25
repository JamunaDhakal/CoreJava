package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	 public static void main(String[] args) {
		 Person person = new Person("user", 20);
		 
		 try (FileOutputStream fileOut = new FileOutputStream("person.ser");
			  ObjectOutputStream out = new  ObjectOutputStream(fileOut)){
			 
			  out.writeObject(person);
			  System.out.println("Serialized data is saved in person.ser");
		 }
		 
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	 }

}
