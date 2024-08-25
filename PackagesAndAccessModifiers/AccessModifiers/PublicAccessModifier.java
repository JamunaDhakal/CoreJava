package AccessModifiers;

public class PublicAccessModifier {
	String name;

	
	public PublicAccessModifier(String name) {
		this.name = name;
	}

	public void display( ) {
		System.out.println("One of AccessModifier is "+ name);
	}
	
	  public static void main(String[] args) {
		  
		  PublicAccessModifier pm = new PublicAccessModifier("public");
		  pm.display();
		  
	  }
	

}
