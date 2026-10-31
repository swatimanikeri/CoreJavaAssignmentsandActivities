package iterators;

import java.util.ArrayList;
import java.util.List;

public class TestIterator1 {

	public static void main(String[] args) {
		/*
		 * List.of returns the instance of Immutable List instance 
		 */
		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		//copy immutable list -> mutable
		ArrayList<Integer> newList=new ArrayList<>(intList);
	//	System.out.println(intList.get(intList.size()));//IndexOfBoundsExceotion 
		System.out.println(intList.get(intList.size()-1));
		//replace 1st element by 99999
		System.out.println(newList.set(0,99999));//10
		newList.add(1,11);
		System.out.println(newList);//[99999,11,20,30,40,50]
		
		

	}

}
