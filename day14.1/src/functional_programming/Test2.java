package functional_programming;

import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Iterable<T> generic interface 
 -  forEach method
public default void forEach(Consumer<? super T> action)
Consumer is a  functional interface
SAM : public void accept(T arg)
T : Type of the input element
Meaning - forEach(..) applies the specified action on all the elements of the underlying Collection.

		 */
		//Print list of integers - 10,20,30,40,50
		List<Integer> list=List.of(10,20,30,40,50);
//		for(Integer i : list)
//			System.out.println(i);
		 list.forEach(i -> System.out.println(i));
		 //print Set of Strings
		 Set<String> set=Set.of("one","two","three");
		 set.forEach(s -> System.out.println(s));
		 

	}

}
