package OptionalClass;

import java.util.Optional;

public class OptionalClassExample {
	
	 public static void main(String[] args) {
	        Optional<String> name = getNameById(1);
	        name.ifPresentOrElse(
	            System.out::println,
	            () -> System.out.println("Name not found")
	        );
	    }

	    public static Optional<String> getNameById(int id) {
	        if (id == 1) {
	            return Optional.of("user");
	        } else {
	            return Optional.empty();
	        }
	    }

}
