package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class BuiltInFunctionalInterface {
	
	public static void main(String[] args) {
	 
		 Function<String, String> toUpperCaseFunction = (str) -> str.toUpperCase();
		 Function<String, Integer> lengthFunction = (str) -> str.length();
		 Function<String, Integer> combinedFunction = toUpperCaseFunction.andThen(lengthFunction);
		 int length = combinedFunction.apply("hello WORLD");
		 System.out.print(length);
		 
	     Function<Integer, String> integerToStringFunction =  (num) -> Integer.toString(num);
	     String result = integerToStringFunction.apply(2);
	     System.out.println(result);
	     
	     Consumer<String> printConsumer = (str) ->System.out.println(str);
	     printConsumer.accept("hello");
	     
	     Supplier<String> stringSupplier = () -> "hello wolrd";
	     System.out.println(stringSupplier.get());
	     
	     Predicate<Integer> isEven = (n) -> n % 2 == 0;
	     System.out.println(isEven.test(2));
	     
	     BiFunction<Integer, Integer, Integer> addFunction = (a,b) -> a + b;
	     int result1 = addFunction.apply(20, 10);
	     System.out.println(result1);
	     
	     BiConsumer<String, Integer> biConsumer = (str,num ) ->System.out.println(str +""+ num);
	     biConsumer.accept("Id", 20);
	     
	     BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
	     System.out.println(isGreater.test(2,3));
	     
	     UnaryOperator<Integer> square = (n)->n*n;
	     System.out.println(square.apply(2));
	     
	     BinaryOperator<Integer> multiply = (a,b)->a*b;
	     System.out.println(multiply.apply(2,4));
	     
	     List<String> names = Arrays.asList("user1","user2","user3");
	     List<String> longNames = names.stream()
                 .filter(name -> name.length() > 3)
                 .collect(Collectors.toList());
	     System.out.println(longNames);
	     List<String> name1 = Arrays.asList("user1","user2","user3");
	     List<Integer> nameLengths = name1.stream()
                 .map(name -> name.length())
                 .collect(Collectors.toList());
	     System.out.println(nameLengths);
	     
	     List<Integer> number = Arrays.asList(1,2,3,4,5);
	     number.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n));
		 
		 

		 

}

}
