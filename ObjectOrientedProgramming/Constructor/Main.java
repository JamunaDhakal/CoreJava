package Constructor;

public class Main {
	
    int id;  
    String name;  
  
    Main(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    
   
    public static void main(String args[]){ 
    	
    	Main s1 = new Main(111,"Karan");  
        Main s2 = new Main(222,"Aryan");  
        System.out.print("Student id is "+s1.id +"Student name is "+s1.name +"\n");  
        System.out.print("Student id is "+s2.id +"Student name is "+s2.name);  
   }  

}


	

