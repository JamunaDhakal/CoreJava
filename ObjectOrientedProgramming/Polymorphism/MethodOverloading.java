package Polymorphism;

class Add{
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading {
	 public static void main(String[] args) {
	 Add ad = new Add();
	 int sum1 = ad.add(5,6);
	 double sum2 = ad.add(4, 9);
	 System.out.print(sum1 +"\n");
	 System.out.print(sum2);
	 
	 
	 }
	
	

}
