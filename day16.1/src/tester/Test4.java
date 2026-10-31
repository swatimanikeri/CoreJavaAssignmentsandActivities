package tester;

import static utils.GenericUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * Generic collections are 
 *  -invariant
 */
public class Test4 {

	public static void main(String[] args) {
		HashSet<Integer> integerSet = new HashSet<>(List.of(1, 2, 3, 5, 45, 123, 10, 3, 5));
		printAnySet2(integerSet);
		LinkedHashSet<String> stringSet = new LinkedHashSet<>(Arrays.asList("one", "two", "three"));
		printAnySet3(stringSet);
		/*
		 * shuffle elements of ArrayList<Integer>
		 */
		ArrayList<Integer> list1=new ArrayList<>(List.of(10, 20, 30,40));
		Collections.shuffle(list1);
		//Vector<String> , LinkedList<Double> , LinkedList<Emp>

	}

}
