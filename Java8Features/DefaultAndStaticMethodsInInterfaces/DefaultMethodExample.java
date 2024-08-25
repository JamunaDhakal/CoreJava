package DefaultAndStaticMethodsInInterfaces;

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); 
    }
}
