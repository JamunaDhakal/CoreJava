package ExceptionHandling;

import java.io.IOException;

class Exception{
	void method () throws IOException{
		  System.out.println("device operation performed"); 
		  }
}
public class ExceptionExample {
	
	public static void main(String[] agrs)throws IOException{
	
		Exception ex = new Exception();
		ex.method();
		System.out.println("Normal flow");
		
	}
	
	

}
