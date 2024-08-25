package DefaultAndStaticMethodsInInterfaces;

public interface Animal {

	 default void makeSound() {
	        System.out.println("Some sound");
	    }
}
