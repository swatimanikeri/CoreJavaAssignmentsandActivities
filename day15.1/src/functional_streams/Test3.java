package functional_streams;

import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		// Create stream of ints between 1-100 & display all even elements.
		//DICTATE the answer
		IntStream.rangeClosed(1, 100) //IntStream with 1---100
		.filter(i -> i % 2 == 0) //IntStream with even nos
		.forEach(i -> System.out.print(i+" "));

	}

}
