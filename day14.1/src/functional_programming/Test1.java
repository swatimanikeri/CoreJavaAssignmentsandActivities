package functional_programming;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Apply some transformation to i/p arg T to produce result of R
	Eg. Use this to compute square of the input integer
	T : Integer
	R : Integer
	SAM (Functional method)
	R apply(T arg)

		 */
		Function<Integer,Integer> squareIt=a -> a*a;
		System.out.println(squareIt.apply(25));
		//find square root of given integer
		Function<Integer,Double> squareRoot=i -> Math.sqrt(i);
		System.out.println(squareRoot.apply(5));
		/*
		 * Consumer<T> - generic interface
T - type of the input
To consume the input & perform some action w/o returning any result
SAM (Functional method)
void accept(T arg)

		 */
		//Accept a String & print it on the console
		Consumer<String> printIt=s -> System.out.println(s);
		printIt.accept("Happy Dussehra !!!!!");
		/*
		 * Supplier<T> - generic interface
T - type of the result
Returns (supplies) T type of the result
SAM (Functional method)
T get()

		 */
		//Supply Immutable List of Integers - 10,20,30,40,50 & then print the same
		Supplier<List<Integer>> integerListSupplier=() -> List.of(10,20,30,40,50);
		System.out.println(integerListSupplier.get());
		Supplier<LocalDate> dateSupplier=() -> LocalDate.now();
		System.out.println(dateSupplier.get());
		/*
		 * Prdicate<T> - generic interface
T - type of the argument to be tested ,resulting into a boolean value
Functional Method(SAM) 
boolean test(T arg)

		 */
		//check if given string is empty & print result
		Predicate<String> checkForEmpty=s -> s.isEmpty();
		System.out.println(checkForEmpty.test("    "));//f
		//check if given int is even  & print result
		Predicate<Integer> checkForEven=i -> i %2 ==0;
		System.out.println(checkForEven.test(1234));//t
		Predicate<String> stringTesting=(s) -> {
			String s2=s.toUpperCase();
			s2 += "he";
			return s2.length()>5;
		};
		System.out.println(stringTesting.test("ab"));//t | f
		

	}

}
