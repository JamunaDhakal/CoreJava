package Inheritance;

class A{
	
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
	
	public void display_A(){
		System.out.println("Class A: " +a);
	}
	
}

class B extends A{
	
	public void display_B(){
		System.out.println("Class B: " +b + "\n");
	}
	
}

class C extends A{
	
	public void display_C(){
		System.out.println("Class B: "+c + "\n");
	}

}

class D extends A{

	public void display_D(){
		System.out.println("Class B: "+d);
	}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		B b = new B();
		b.display_A();
		b.display_B();
		
		C c = new C();
		c.display_A();
		c.display_C();
		
		D d = new D();
		d.display_A();
		d.display_D();
	}
}
