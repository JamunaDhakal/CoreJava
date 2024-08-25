package JavaTypeCasting;

public class NarrowingTypeCasting {
	
	public static void main(String[] args) {
	
		double d = 18888.8d;
		long l = (long)d;
		int i = (int)l;
				
		System.out.println("Before conversion: "+d);  
		System.out.println("After conversion into long type: "+l);    
		System.out.println("After conversion into int type: "+i);  
	}


}
