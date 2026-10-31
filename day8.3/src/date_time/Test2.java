package date_time;

import java.time.LocalDate;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * LocalDate Methods
		 * - MUST revise using java docs
		 * 
		 */
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		LocalDate d2=LocalDate.of(2020, 10, 5);
		System.out.println(d2);
		System.out.println(d1.isBefore(d2));
		System.out.println(d1.isAfter(d2));
		System.out.println(d1.isEqual(d2));
		System.out.println(d1.compareTo(d2));
		LocalDate earlierDate=d1.minusMonths(10);
		System.out.println(earlierDate);
		/*
		 * How will you compute age of the user in years ?
		 * Hint - Use Period class's between method
		 * Try it !
		 */

	}

}
