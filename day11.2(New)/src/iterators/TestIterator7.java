package iterators;
import java.util.List;
import java.util.ListIterator;

public class TestIterator7 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(10, 20, 30, 40, 50,60,70,80,90,100);
		/*
		 * Display list elements in reverse order
		 */
		ListIterator<Integer> listItr=intList.listIterator(intList.size());//cursor placed at after last positionn
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previousIndex()+" "+listItr.nextIndex());
			System.out.println(listItr.previous());			
		}
//		listItr.previous();// exception 
		

	}//no error 

}
