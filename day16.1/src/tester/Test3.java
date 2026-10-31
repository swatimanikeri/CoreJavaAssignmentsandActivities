package tester;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import static utils.GenericUtils.printAnySet;
/*
 * Generic collections are 
 *  -invariant
 */
public class Test3 {

	public static void main(String[] args) {
		//
		HashSet<Integer> integerSet=new HashSet<>(List.of(1,2,3,5,45,123,10,3,5));//populated Collection<? extends Integer> c
	//	printAnySet(integerSet);
		LinkedHashSet<String> stringSet=new LinkedHashSet<>(Arrays.asList("one","two","three"));
//		printAnySet(stringSet);
		List<String> strings=List.of("aa", "bb");//even though string is subtype of obj ,List<String> not a subtype of List<Object>
//		public static <T> void printAnySet(Set<? extends Set> set) {
//			for(Object o:set) {
//				
//			}
//			
		}
	//	List<Object> objectList=strings;
		/*
		 * Even though String is a sub type of Object
		 * List<String> IS NOT a sub type of List<Object>
		 */
		List<?> anyList=strings;
		

	}

}
