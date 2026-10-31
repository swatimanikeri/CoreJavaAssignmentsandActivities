package linked_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("one","two","three","four","five");//strings - fixed size list - add | remove : throw exception , BUT set , get , shuffle , sort...no exc
//		strings.add("zero");
		strings.set(0, "zero");
		System.out.println(strings);
		Collections.sort(strings);
		System.out.println(strings);//[five, four, three, two, zero]
		/*
		 * Can you create a linked list containg above elements ? YES
		 */
		LinkedList<String> strings2=new LinkedList<>(strings);
		//Can you add | remove elements from this LinkedList ? Yes
		strings2.addFirst("six");
		strings2.offerFirst("seven");
		System.out.println(strings2);//[seven,six,five, four, three, two, zero]
		strings2.addLast("ten");
		System.out.println(strings2);//[seven,six,five, four, three, two, zero,ten]
		strings2.removeFirst();
		System.out.println(strings2);//[six,five, four, three, two, zero,ten]
		
		strings2.removeLast();
		System.out.println(strings2);//[six,five, four, three, two, zero]
		System.out.println("1st elem "+strings2.getFirst());//six
		System.out.println(strings2);//[six,five, four, three, two, zero]
		System.out.println(strings2.getLast());//zero
		System.out.println(strings2.get(3));//three - O(n) - Better time complexity for accessing the element by index - will be offered by ArrayList
		//print elements of LinkedList in reverse manner - descendingIterator
		System.out.println("Printing LinkedList in reverse order");
		Iterator<String> itr=strings2.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
