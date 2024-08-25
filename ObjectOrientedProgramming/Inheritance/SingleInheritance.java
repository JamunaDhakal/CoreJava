package Inheritance;

class Employee{
	int salary = 10000;	
}

class Designer extends Employee{
	
	void display() {
		System.out.print("The Salary of Employee is: 2" + salary);
	}
}
public class SingleInheritance {
	
	public static void main(String[] args) {
		Designer ds = new Designer();
		ds.display();		
	}
}
