package customcomparators;

import java.util.Comparator;

import com.cms.core.Customer;

public class CustomerDobComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1,Customer c2) {//mene to quals use kiya ths ,to mat karana
		return c1.getDob().compareTo(c2.getDob());
			}
	}
//we can replace this with anonymous inner class
