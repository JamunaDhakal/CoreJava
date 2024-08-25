package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamExample {

	public static void main(String[] args) {
	    List<Person> people = Arrays.asList(
                new Person("user1", 25),
                new Person("user2", 17),
                new Person("user3", 30),
                new Person("user4", 15)
                
        );
	    
	    List<String> namesOfAdults = people.stream()
	    		.filter(person -> person.getAge() >= 18)
	    		.sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
	    		.map(Person::getName)
	    		.collect(Collectors.toList()); 
	    
	    System.out.println(namesOfAdults);
	}

}
