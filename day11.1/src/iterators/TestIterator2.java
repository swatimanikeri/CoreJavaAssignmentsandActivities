package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator2 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		Iterator<Integer> itr = intList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	//	System.out.println(itr.next());//NoSuchElementException

	}

}
