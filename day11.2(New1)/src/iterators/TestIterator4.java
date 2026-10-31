package iterators;

import java.util.ArrayList;
import java.util.List;

public class TestIterator4 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		ArrayList<Integer> list2 = new ArrayList<>(intList);
		for (Integer i : list2) {//attached implicit iterator ,positions are marked ,mpdification using list api ,the Jvm prefers to fail fast 
			System.out.println(i);
	//		list2.remove(i);	//trigger for ConcurrentModificationException
			list2.add(1234);
		}

	}

}
