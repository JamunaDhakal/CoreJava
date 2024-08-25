package Encapsulation;

class Person{
	String name;
	String city;
	
	public Person(String name, String city) {
		this.name= name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
    }
	
	public void myMethod() {
	System.out.print("name: " +name + " \n"+ "city: " + city );
	}
}

public class Encapsulation {

	public static void main(String[] args) {
	
		Person p = new Person("person1","pokhara");
		 p.myMethod(); 
	 }
}
