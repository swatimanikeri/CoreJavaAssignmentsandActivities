package functional_streams;

import java.util.stream.IntStream;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * Display sum of all odd numbers within some range(1-100)

		 */
		int sum = IntStream.range(1, 101) 
		.filter(i -> i % 2 != 0)
		.sum();
		System.out.println("Sum="+sum);

	}

}
