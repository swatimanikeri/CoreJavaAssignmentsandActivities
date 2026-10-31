package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TreeSetEx {
	public static void main(String[] args) {
		List<Double> d=List.of(10.9,38.9);
		HashSet<Double> hs=new HashSet<>(d);
		System.out.println(hs);
		System.out.println("via iterator");
		Iterator<Double> itr=hs.iterator();
		while(!itr.hasNext()) {
			System.out.println(itr.next()+"");
		}
		
		//via for each
		System.out.println("vis for each");
		for(double s:hs) {
			System.out.println(s);
		}
		System.out.println("added"+hs.add(2.3));
	}

}
