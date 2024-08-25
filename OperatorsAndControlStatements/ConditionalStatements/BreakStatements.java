package ConditionalStatements;

public class BreakStatements {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=20;i++) {
			if(i == 8) {
				break;
			}
			System.out.print(i);
		}
	
		int x = 0;
		while(x <10) {
			System.out.print(x);
			x++;
			if(x == 3) {
				break;
		}	
			
		}
	}
		
}
