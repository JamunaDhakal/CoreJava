package CustomException;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
 
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
	
    public static void main(String[] args) {
    
    	try {
            validateAge(160);  
        } 
    	
    	catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

 
    public static void validateAge(int age) throws InvalidAgeException {
        
    	if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        } 
    	
    	else {
            System.out.println("Valid age: " + age);
        }
    }
}