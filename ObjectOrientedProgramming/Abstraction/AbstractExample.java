package Abstraction;

abstract class Person{
	
	public abstract void display();
	public void eat() {
		System.out.print("eating.......");
	}
}

class A extends Person{
	
	public void display() {
		System.out.println("The Total number of person is 200.....");
	}
	
}
public class AbstractExample {
	
	  public static void main(String[] args) {
		    A a = new A();
		    a.display();
		    a.eat();
		  }
	
	

}
