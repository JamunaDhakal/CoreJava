package AccessModifiers;

public class PrivateAccessModifier {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	   public static void main(String[] main){
		   
		   PrivateAccessModifier pm  = new PrivateAccessModifier();
		   pm.setName("Private");
		   System.out.println(pm.getName());
		   
	   }
	
	

}
