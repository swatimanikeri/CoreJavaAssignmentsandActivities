package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator5 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		ArrayList<Integer> list2 = new ArrayList<>(intList);
		Iterator<Integer> itr = list2.iterator();
		System.out.println(itr.getClass());//ArrayList$Itr
	//	list2.add(0, 11);
		//list2.remove(0);
		list2.set(0,11);//no error
		list2.add(39);//error
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
