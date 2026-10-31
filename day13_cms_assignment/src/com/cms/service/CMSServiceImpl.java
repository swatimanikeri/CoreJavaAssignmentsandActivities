//package com.cms.service;
//
//import static com.cms.service.CMSValidations.validateAllInputs;
//
//import java.time.LocalDate;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
//import com.cms.core.Customer;
//import com.cms.core.ServicePlan;
//import com.cms.custom_exceptions.AuthenticationException;
//import com.cms.custom_exceptions.CMSException;
//
//public class CMSServiceImpl implements CMSService {
//	private Map<String, Customer> customers;
//
//	public CMSServiceImpl() {
//
//		this.customers = new HashMap<>(32);//size=0,capacity=32,l.f=0.75 
//		//re-hashing= size grows beyond capacity*l.f
//		//new d.s (capacity=64-double) [costly] --> BUT better per.
//		//below line--->  
//		//Firslty it calls the hc and then create bucket id ,if hc is null it will saved in 0 th bucket
//		//put method return null if obj is not,there and ref obj already present.
//		//nre id with same id ,the value is replaced with new value,and returns ref.
//		//putIfAbbsent,hc-bucket-k1-v1,return ref(internally calls containKey())
//		//SLL has limit,(Treefy limit),>8,convert it to BT
//		//hs-->hm
//		//key=e1,nw-no
//		//
//		customers.put("amit@gmail.com", new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000,
//				LocalDate.of(1990, 5, 12), ServicePlan.SILVER));
//		customers.put("priya@gmail.com", new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000,
//				LocalDate.of(1995, 8, 23), ServicePlan.GOLD));
//		customers.put("rahul@yahoo.com", new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000,
//				LocalDate.of(1988, 1, 3), ServicePlan.DIAMOND));
//		customers.put("sneha@gmail.com", new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
//				LocalDate.of(1992, 11, 17), ServicePlan.PLATINUM));
//		customers.put("vikas@gmail.com", new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000,
//				LocalDate.of(1998, 6, 29), ServicePlan.GOLD));
//		customers.put("meera@gmail.com", new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000,
//				LocalDate.of(2000, 2, 14), ServicePlan.SILVER));
//		customers.put("arjun@gmail.com", new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000,
//				LocalDate.of(1985, 9, 5), ServicePlan.DIAMOND));
//		customers.put("kavya@gmail.com", new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000,
//				LocalDate.of(1993, 12, 25), ServicePlan.PLATINUM));
//		customers.put("rahul@yahoo.com", new Customer("Rahul1", "Patil1", "rahul@yahoo.com", "rahul@123", 5000,
//				LocalDate.of(1988, 1, 3), ServicePlan.DIAMOND));
////replaces old value ref & returns it to the caller
//	}
//
//	/*
//	 * In case of successful validations - add customer reference to the List &
//	 * return success message In case of failure - delegate exception further to the
//	 * tester
//	 */
//	@Override
//	public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
//			String dob, String plan) throws CMSException {
//		// invoke method of ValidationRules - to validate all i/ps
//		Customer customer = validateAllInputs(firstName, lastName, email, password, regAmount, dob, plan, customers);
//		// add customer ref to the list
//		customers.put(email, customer);
//		return "New customer registered!";
//	}
//
//	@Override
//	public void displayCustomerDetails() {
//		//Map are not Iterable so cant use any iteration loops/ways on it
//		//so have to convert it into any Coll -->(as those are iterable)
//		//Map===>Collection<Customer>=
//		for (Customer c : customers.values()) {
//			System.out.println(c);
//		}
//	}
//
//	/*
//	 * In case of successful authentication - return authenticated customer details
//	 * to the caller. In case of invalid login - throw new
//	 * AuthenticationException(......);
//	 */
//	@Override
//	public Customer signIn(String email, String password) throws AuthenticationException {
//		// searching by Key - ready made methods exist : get(Key) : value
//		Customer c = customers.get(email);
//		// 2. check if not null
//		if (c == null)
//			throw new AuthenticationException("Customer not found - email doesn't exist!!!!!");		
//		// 3. check password .
//		if (c.getPassword().equals(password))
//			return c;
//		throw new AuthenticationException("Wrong Password !!!");
//
//	}
//
//	@Override
//	public String changePassword(String email, String oldPassword, String newPassword) throws AuthenticationException {
//		// authenticate customer
//		Customer c = signIn(email, oldPassword);
//		// => auth successful -> set password
//		c.setPassword(newPassword);
//		return "password changed";
//	}
//
//	@Override
//	public String deleteCustomerDetails(String email) throws CMSException {
//		// delete by PK
//		Customer deletedCustomer=customers.remove(email);
//		if(deletedCustomer==null)
//			throw new CMSException("Delete Failed - Email doesn't exist!!!!");
//		return "Customer details deleted....";
//	}
//
//	@Override
//	public void displayCustomersByPlan(String plan) {
//		ServicePlan servicePlan=ServicePlan.valueOf(plan);
//				
//		/*
//		 * Display customer names by plan
//		 * 
//		 */
//		System.out.println("Customer names under plan - "+servicePlan.name());
//		for(Customer c : customers.values())
//		{
//			if(c.getPlan()==servicePlan)
//			{
//				System.out.println(c.getFirstName()+" "+c.getLastName());
//			}
//		}
//		
//		
//	}
//
//	@Override
//	public String upgradePlan(String date) {
//		//1. string -> LocalDate
//		LocalDate inputDate=LocalDate.parse(date);
//		for(Customer c : customers.values())
//		{
//			if(c.getPlan()==ServicePlan.GOLD && c.getDob().isAfter(inputDate))
//			{
//				c.setPlan(ServicePlan.DIAMOND);
//			}
//		}
//		return "Plan upgraded....";
//	}
//
//	@Override
//	public void sortCustomersByEmail() {
//		/*
//		 * sorting map details as per key based criteria
//		 * - use TreeMap 
//		 * Natural ordering or Custom ordering
//		 * - TreeMap() | TreeMap(Map) | TreeMap(Comparator)
//		 * - TreeMap(Map) 
//		 * JVM calls
//		 *  - String 's compareTo - asc order (as per Tim's sorting alogorithm)
//		 */
//		TreeMap<String , Customer> tm=new TreeMap<>(customers); 
//		System.out.println("Customers sorted as per email");
//		for(Customer c : tm.values())
//		{
//			System.out.println(c);
//		}
//		
//		
//			
//		
//	}
//	
//	
//
//}




package com.cms.service;

import static com.cms.service.CMSValidations.validateAllInputs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.AuthenticationException;
import com.cms.custom_exceptions.CMSException;

public class CMSServiceImpl implements CMSService {

private Map<String, Customer> customers;

public CMSServiceImpl() {

this.customers = new HashMap<>(32);
customers.put("amit@gmail.com", new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000,
LocalDate.of(1990, 5, 12), ServicePlan.SILVER));
customers.put("priya@gmail.com", new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000,
LocalDate.of(1995, 8, 23), ServicePlan.GOLD));
customers.put("rahul@yahoo.com", new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000,
LocalDate.of(1988, 1, 3), ServicePlan.DIAMOND));
customers.put("sneha@gmail.com", new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
LocalDate.of(1992, 11, 17), ServicePlan.PLATINUM));
customers.put("vikas@gmail.com", new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000,
LocalDate.of(1998, 6, 29), ServicePlan.GOLD));
customers.put("meera@gmail.com", new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000,
LocalDate.of(2000, 2, 14), ServicePlan.SILVER));
customers.put("arjun@gmail.com", new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000,
LocalDate.of(1985, 9, 5), ServicePlan.DIAMOND));
customers.put("kavya@gmail.com", new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000,
LocalDate.of(1993, 12, 25), ServicePlan.PLATINUM));
customers.put("rahul@yahoo.com", new Customer("Rahul1", "Patil1", "rahul@yahoo.com", "rahul@123", 5000,
LocalDate.of(1988, 1, 3), ServicePlan.DIAMOND));
//replaces old value ref & returns it to the caller
}

/*
* In case of successful validations - add customer reference to the List &
* return success message In case of failure - delegate exception further to the
* tester
*/
@Override
public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
String dob, String plan) throws CMSException {
// invoke method of ValidationRules - to validate all i/ps
Customer customer = validateAllInputs(firstName, lastName, email, password, regAmount, dob, plan, customers);
// add customer ref to the list
customers.put(email, customer);
return "New customer registered!";
}

@Override
public void displayCustomerDetails() {
for (Customer c : customers.values()) {
System.out.println(c);
}
}

// @Override
// public void displayCustomerDetails1() {
//    customers.values().forEach(c -> System.out.println(c));
//    }


/*
* In case of successful authentication - return authenticated customer details
* to the caller. In case of invalid login - throw new
* AuthenticationException(......);
*/
@Override
public Customer signIn(String email, String password) throws AuthenticationException {
// searching by Key - ready made methods exist : get(Key) : value
Customer c = customers.get(email);
// 2. check if not null
if (c == null)
throw new AuthenticationException("Customer not found - email doesn't exist!!!!!");
// 3. check password .
if (c.getPassword().equals(password))
return c;
throw new AuthenticationException("Wrong Password !!!");

}

@Override
public String changePassword(String email, String oldPassword, String newPassword) throws AuthenticationException {
// authenticate customer
Customer c = signIn(email, oldPassword);
// => auth successful -> set password
c.setPassword(newPassword);
return "password changed";
}

@Override
public String deleteCustomerDetails(String email) throws CMSException {
// delete by PK
Customer deletedCustomer=customers.remove(email);
if(deletedCustomer==null)
throw new CMSException("Delete Failed - Email doesn't exist!!!!");
return "Customer details deleted....";
}

@Override
public void displayCustomersByPlan(String plan) {
ServicePlan servicePlan=ServicePlan.valueOf(plan);

/*
* Display customer names by plan
*
*/
System.out.println("Customer names under plan - "+servicePlan.name());
for(Customer c : customers.values())
{
if(c.getPlan()==servicePlan)
{
System.out.println(c.getFirstName()+" "+c.getLastName());
}
}


}

// @Override
// public String upgradePlan(String date) {
// //1. string -> LocalDate
// LocalDate inputDate=LocalDate.parse(date);
// for(Customer c : customers.values())
// {
// if(c.getPlan()==ServicePlan.GOLD && c.getDob().isAfter(inputDate))
// {
// c.setPlan(ServicePlan.DIAMOND);
// }
// }
// return "Plan upgraded....";
// }


// @Override
// public String upgradePlan(String date) {
// //1. string -> LocalDate
// LocalDate inputDate=LocalDate.parse(date);
// customers.values()
// .stream()
// .map(f->f.getPlan()==ServicePlan.GOLD && f.getDob().isAfter(inputDate))
// .collect(Collectors.toList());
// return "Plan upgraded....";
// }

@Override
public String upgradePlan(String date) {
//1. string -> LocalDate
	System.out.println("hello i amm in upgrade plan");
LocalDate inputDate=LocalDate.parse(date);
customers.values()
.stream()
.filter(f->f.getPlan()==ServicePlan.GOLD && f.getDob().isAfter(inputDate))
.forEach(f->f.setPlan(ServicePlan.DIAMOND));

return "Plan upgraded....";
}


@Override
public void sortCustomersByEmail() {
/*
* sorting map details as per key based criteria
* - use TreeMap
* Natural ordering or Custom ordering
* - TreeMap() | TreeMap(Map) | TreeMap(Comparator)
* - TreeMap(Map)
* JVM calls
*  - String 's compareTo - asc order (as per Tim's sorting alogorithm)
*/
TreeMap<String , Customer> tm=new TreeMap<>(customers);
System.out.println("Customers sorted as per email");
for(Customer c : tm.values())
{
System.out.println(c);
}
}}

