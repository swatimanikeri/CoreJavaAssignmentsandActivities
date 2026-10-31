package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIntegerList {
	public static void main(String[] args) {
		int[] data = { 10, 1, 34, 5, 6, 11, 23, 10, 1, -10, 1 };
		/*
		 * 1. Create empty ArrayList to store Integer type of refs 2. Populate the list
		 * from toString Iterator & for-each) 4. Check if specified element exists -
		 * prints present | absent 5. Display index of 1st & last occurrence of
		 * specified element 6. Display element at specified index 7. Remove element at
		 * the specified index 8. Double all the elements whose intValue > 15 9. Create
		 * un modifiable List with 10,20,30,40,50 10. Check if we can modify it ? 11.
		 * Add these elements in earlier list 12. sort the list
		 */
		ArrayList<Integer> list = new ArrayList<>();// size : 0 , init capa =10
		for (int i : data) {
			list.add(i);// int -> Integer (auto boxing)
		}
		System.out.println("ArrayList via toString " + list);
		System.out.println("ArrayList via Iterator");
		// attach Iterator
		Iterator<Integer> itr = list.iterator();// itr is placed BEFORE 1st element (index =0)
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n ArrayList via for-each");
		for (Integer i : list)
		{
			System.out.print(i+" ");
		}
		System.out.println("Checking if 233 exists "+list.contains(233));
	}
}
