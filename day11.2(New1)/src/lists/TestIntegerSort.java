package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestIntegerSort {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 1, 30, 23, 11,34,-10,45,22);
		ArrayList<Integer> anotherList=new ArrayList<>(intList);
		System.out.println("Unsorted list");
		System.out.println(intList);
		Collections.sort(anotherList);//generic is used here Integer implements comparable ,it calls the Integer class's compareTo method  
		 //i1>i2 swap ,we're not sorting the elements ,we're calling only 
		System.out.println("List after sorting - ");
		System.out.println(anotherList);

	}

}
