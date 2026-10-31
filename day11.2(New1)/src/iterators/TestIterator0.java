package iterators;

import java.util.List;

public class TestIterator0 {

	public static void main(String[] args) {
		List<Integer> intList = List.of(10, 20, 30, 40, 50);
		System.out.println("Before setting "+intList);
		intList.set(0, 99);
		System.out.println("Before setting "+intList);
		

	}

}
