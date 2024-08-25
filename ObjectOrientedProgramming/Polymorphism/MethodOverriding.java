package Polymorphism;


class Student{
	
	int total = 2000;
	int a = 1000;
	int b = 1000;
	void run() {
		System.out.println("The total student is "+ total + "\n" );
	}
}

class studentA extends Student{
	void run() {
		super.run();
		System.out.println("The StudentA is" + a  +"\n");
	}
	
}
class studentB extends Student{
	void run() {
		super.run();
		System.out.println("The StudentA is" + b);
	}
	
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Student  sa = new studentA();
		Student  sb = new studentB();
		sa.run();
		sb.run();
		
		
		
	}
	
	

}
