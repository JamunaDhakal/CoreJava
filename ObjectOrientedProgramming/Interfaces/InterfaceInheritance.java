package Interfaces;

interface Showable extends Printable{
	void show();
}


class TestInterface implements Showable{
	public void print() {
		System.out.println("Hello...."); 
	}
	public void show() {
		System.out.println("Welcome....."); 
	}
	

}



public class InterfaceInheritance {
	public static void main(String args[]){  
		TestInterface ti = new TestInterface();
		ti.print();
		ti.show();
		
	}

}
