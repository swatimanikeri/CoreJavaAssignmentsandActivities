package tester;
/*
 * Arrays are co variant in nature
 * When you use Object[] , you get flexibility to pass any array BUT 
 * you may get run time error(no type safety @ compile time)
 */
import static utils.GenericUtils.*;

public class Test1 {

	public static void main(String[] args) {
//		Integer i1=128;
//		Integer i2=128;//range of Integer literal pool - 1byte (-128-127)
//		System.out.println(i1==i2);//
		Integer[] ints = { 1, 23, 4, 5, 6, 7 };//auto boxing
		printAnyArray(ints);
		Double[] doubles= {1.1,2.0,3.3,4.5,5.8,6.1};
		printAnyArray(doubles);
		String[] strings= {"a","vv","cc"};
		printAnyArray(strings);


	}

}
