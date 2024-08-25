package ConditionalStatements;

public class ReturnStatement {
	
	public static void main(String[] args) {
	
		ReturnStatement rt = new ReturnStatement();
		int result = rt.comparedNum();
		System.out.print("The greater number among x and y is: " + result);
	}
	
	public int comparedNum() {
	
		int x = 4;
		int y = 5;
		
		System.out.print("x = "+x + "\n y = "+y +"\n");
		
		if(x >y) {
			return x;
		}
		
		else {
			return y;
		}
		
	}
	

	
}