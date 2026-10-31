package lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
//import customcomparators.CustomerDobComparator;
public class SortCustomersByDob {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>(1024);
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1990, 5, 12),
				ServicePlan.SILVER));
		customers.add(new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000, LocalDate.of(1995, 8, 23),
				ServicePlan.GOLD));
		customers.add(new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000, LocalDate.of(1988, 1, 3),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
				LocalDate.of(1992, 11, 17), ServicePlan.PLATINUM));
		customers.add(new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000, LocalDate.of(1998, 6, 29),
				ServicePlan.GOLD));
		customers.add(new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000, LocalDate.of(2000, 2, 14),
				ServicePlan.SILVER));
		customers.add(new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000, LocalDate.of(1985, 9, 5),
				ServicePlan.DIAMOND));
		customers.add(new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000, LocalDate.of(1993, 12, 25),
				ServicePlan.PLATINUM));
		System.out.println("Un sorted list");
		for (Customer c : customers)
			System.out.println(c);
		System.out.println("--------------------------------");
		//sort the customer list as per email & display it again
		Collections.sort(customers);//compareTo method of customer ,The Customer implements the comparable
		System.out.println("Sorted list");
		for (Customer c : customers) {
			System.out.println(c);
     	}
	  
//	Collections.sort(customers,new CustomerDobComparator());

//	Collections.sort(customers,
//			new Comparator<Customer>() {
//	      	@Override
//		     public int compare(Customer c1,Customer c2) {
//	      		int i1=c1.getLastName().compareTo(c2.getLastName());//mene to quals use kiya ths ,to mat karana
//			  int i2=c1.getDob().compareTo(c2.getDob());
//			  if(i1==i2) {
//				  return 1;
//			  }
//			  return -1;
//				}
//			});
//	
	
	customers.sort(new Comparator<Customer>() {
	      	@Override
		     public int compare(Customer c1,Customer c2) {
	      		int i1=c1.getLastName().compareTo(c2.getLastName());//mene to quals use kiya ths ,to mat karana
			  int i2=c1.getDob().compareTo(c2.getDob());
			  if(i1==i2) {
				  return 1;
			  }
			  return -1;
				}
			});
	//creating instance/annonymous inner class instace which implements comparator
	//sort customers by their email
}}
