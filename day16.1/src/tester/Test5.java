package tester;

import java.util.ArrayList;
import java.util.List;

import fruits.Mango;
import static utils.GenericUtils.printFruitTaste;

/*
 * Generic collections are 
 *  -invariant
 */
public class Test5 {

	public static void main(String[] args) {
	//ArrayList <Mango>
		ArrayList<Mango> mangoes=new ArrayList<>(List.of(new Mango(), new Mango()));
		 printFruitTaste(mangoes);
		 //list of any fruite LL<Orange>  cant replace mango by fruit
		
		

	}

}
