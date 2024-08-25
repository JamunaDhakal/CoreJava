package JavaTypeCasting;

public class WideningCasting {
	
	public static void main(String[] args) {
	
		int x = 100;
		long y = x;
		float z = y;
		double a = z;
		char text = 's';
		int a1 = text;
		
		System.out.print("befre conversion, int value " + x);
		System.out.print("After conversion, long value " + y);
		System.out.print("After conversion, float value " + z);
		System.out.print("After conversion, int value " + a1);
		System.out.print("After conversion, double value " + a);		
	}

}
