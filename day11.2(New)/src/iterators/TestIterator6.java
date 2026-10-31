package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator6 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		ArrayList<Integer> list2 = new ArrayList<>(intList);
		Iterator<Integer> itr = list2.iterator();		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();//no error 
		}
		System.out.println("List after remove "+list2);

	}

}
