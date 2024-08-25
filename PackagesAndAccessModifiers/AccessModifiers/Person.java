package AccessModifiers;

class Person {
	
	protected String fname = "Bunny";
	protected String lname = "Dao";
	
	protected void display() {
		System.out.println("This is protect access modifier");
		
	}
	

}

class Student extends Person {
	  
	  public static void main(String[] args) {
	    Student obj = new Student();
	    System.out.println("Name: " + obj.fname + " " + obj.lname);
	    obj.display();
	    
	  }
	}