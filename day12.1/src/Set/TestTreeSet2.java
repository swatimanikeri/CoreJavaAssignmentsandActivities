package Set;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {

		List<Double> doubleList = List.of(10.0, 5.0, 2.3, 4.5, 6.1, 7.6, 8.9, 10.0, 2.3);
		System.out.println("List contents - " + doubleList);
		/*
		 * Remove dups & sort the doubles in desc order & display
		 */
		TreeSet<Double> ts = new TreeSet<>(new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				System.out.println("in compare - ano innner class");
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(ts);//[]
		System.out.println(ts.addAll(doubleList));
		System.out.println(ts);

	}

}
