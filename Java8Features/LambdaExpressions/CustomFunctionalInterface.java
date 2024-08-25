package LambdaExpressions;


@FunctionalInterface
interface MyFunction{
	void pringMsg(String message);
	
}

public class CustomFunctionalInterface {
	 
	public static void main(String[] args) {
		 
	     MyFunction myFunction = (message) ->System.out.print("Message: "+ message);
	     myFunction.pringMsg("Hello, This is lamba Expression with a custom functional interface");
	    
	}

}
