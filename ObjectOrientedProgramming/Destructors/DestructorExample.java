package Destructors;

public class DestructorExample {
	
	protected void finalize() {
		System.out.print("object is destroyed by garbage collector" +"\n");
	}
	
	public static void main(String[] args) {
		
		DestructorExample De = new DestructorExample();
		De.finalize();
		De = null;
		System.gc();
		
	}

}
