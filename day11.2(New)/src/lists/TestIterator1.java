package lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;

public class TestIterator1 {

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
		
		//display all customers using for-each
		System.out.println("all customers -");
		for(Customer c : customers)
		{
			System.out.println(c);
		}
		//remove customer details -under DIAMOND service plan
		//JVM throws - ConcurrentModificationException
//		for(Customer c : customers)
//		{
//			System.out.println(customers.remove(c));
//		}
		//alternate elements got removed
//		for (int i=0;i<customers.size();i++)
//		{
//			customers.remove(i);
//		}
		//using Iterator - remove the  customers with Diamond plan
		Iterator<Customer> customerItr=customers.iterator();
		while(customerItr.hasNext())
		{
//			customerItr.next();
//			customerItr.remove();
			Customer c=customerItr.next();
			if(c.getPlan()==ServicePlan.DIAMOND){
				//customers.remove(c);
				customerItr.remove();
			}
		}
		System.out.println(customerItr.next());
		System.out.println("List after remove - ");
		for(Customer c : customers)
		{
			System.out.println(c);
		}

	}

}
