package functional_streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Create int[] , attach stream , display elements of the stream
		 */
		int[] ints= {10,1,2,3,4,11,23,100,-10};
		Arrays.stream(ints).forEach(i -> System.out.print(i+" "));
		System.out.println();
		DoubleStream doubleStream=DoubleStream.of(1.2,3.4,5,6,7,8);
		doubleStream.forEach(d -> System.out.print(d+" "));
		System.out.println();
	//	doubleStream.forEach(d -> System.out.print(d+" "));//IllegalStateException - stream is already closed.
		

	}

}
