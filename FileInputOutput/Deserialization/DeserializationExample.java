package Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Serialization.Person;

public class DeserializationExample {
	
	public static void main(String[] args) throws ClassNotFoundException{ 
		 
		 try (FileInputStream fileIn = new FileInputStream("person.ser");
			  ObjectInputStream in = new  ObjectInputStream(fileIn)){
			 
			  Person person = (Person) in.readObject();
			  System.out.println("Deserialized ");
			  System.out.println(person);
		 }
		 
	     catch (IOException e) {
         e.printStackTrace();
     }
	 }

}
