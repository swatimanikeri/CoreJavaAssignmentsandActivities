package sets;

import java.util.List;
import java.util.TreeSet;

public class TestTreeSet1 {

	public static void main(String[] args) {
		/*
		 * Create a populated TreeSet containing Double references of -
		 * 10,5,2.3,4.5 ,6,7,8
		 */
		List<Double> doubleList = List.of(10.0, 5.0, 2.3, 4.5, 6.1, 7.6, 8.9,10.0,2.3);
		System.out.println("List contents - " + doubleList);
		TreeSet<Double> hs = new TreeSet<>(doubleList);//Internally calls Double's compareTo - Natural ordering - asc order (Tim's sorting algorithm)
		System.out.println(hs);// toString - asc order

	}

}
