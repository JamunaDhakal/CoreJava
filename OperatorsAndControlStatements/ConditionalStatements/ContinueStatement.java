package ConditionalStatements;

public class ContinueStatement {
	
	public static void main(String[] args) {
	
		for(int i=0;i<=20;i++) {
			if(i == 12) {
				continue;
			}
			System.out.print(i);
		}
	
		int i = 0;
		while(i <= 8) {
			if(i == 2) {
				i++;
				continue;
			}
		
			System.out.println(i);
			  i++;
		}
	}

}
