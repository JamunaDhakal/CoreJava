package Polymorphism;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("Car is running");
	}
	
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}
	
}

public class PolymorphismExample {
	
	public static void main(String[] args) {
		Vehicle vc = new Vehicle();
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		vc.run();
		car.run();
		bike.run();
		
		
	}
	
	

}
