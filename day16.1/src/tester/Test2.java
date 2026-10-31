package tester;
/*
 * Arrays are co variant in nature
 * When you use Object[] , you get flexibility to pass any array BUT 
 * you may get run time error(no type safety @ compile time)
 */
import static utils.GenericUtils.*;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		Integer[] ints = { 1, 23, 4, 5, 6, 7 };//auto boxing
		printAnyArray2(ints);
		Double[] doubles= {1.1,2.0,3.3,4.5,5.8,6.1};
		printAnyArray2(doubles);
		String[] strings= {"a","vv","cc"};
		printAnyArray2(strings);
		/*
		 * Arrays.asList - Generic method
		 * 
		 */
		List<Double> list1=Arrays.asList(1.1,2.0,3.3,4.1,5.5);
		System.out.println(list1);
		


	}

}
