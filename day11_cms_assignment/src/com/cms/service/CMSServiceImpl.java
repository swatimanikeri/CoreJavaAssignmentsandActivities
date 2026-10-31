package com.cms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.AuthenticationException;
import com.cms.custom_exceptions.CMSException;
import static com.cms.service.CMSValidations.validateAllInputs;

public class CMSServiceImpl implements CMSService {
	private List<Customer> customers;

	public CMSServiceImpl() {

		this.customers = new ArrayList<>(1024);
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

	}

	/*
	 * In case of successful validations
	 *  - add customer reference to the List & return success message
	 * In case of failure 
	 *  - delegate exception further to the tester
	 */
	@Override
	public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
			String dob, String plan) throws CMSException {
		// invoke method of ValidationRules - to validate all i/ps
		Customer customer = validateAllInputs(firstName, lastName, email, password, regAmount, dob, plan, customers);
		//add customer ref to the list
		customers.add(customer);
		return "New customer registered!";
	}

	@Override
	public void displayCustomerDetails() {
		for (Customer c : customers)
		{
			System.out.println(c);
		}
	}

	/*
	 * In case of successful authentication
	 *  - return authenticated customer details to the caller.
	 * In case of invalid login 
	 * - throw new AuthenticationException(......);
	 */
	@Override
	public Customer signIn(String email, String password) throws AuthenticationException {
		//searching by  PK - ready made methods exist
		//1. get index of customer with matching email - indexOf
//		int index=customers.indexOf(email); //problem - Internally String's (arg) equals is getting called
		Customer customer=new Customer(email);
		int index = customers.indexOf(customer);
		//2. check if not -1 => get customer by email - get
		if(index == -1)
			throw new AuthenticationException("Customer not found - email doesn't exist!!!!!");
		Customer c=customers.get(index);
		//3. check password . 
		if(c.getPassword().equals(password))
			return c;
	    throw new AuthenticationException("Wrong Password !!!");	
	
	}

	@Override
	public String changePassword(String email, String oldPassword, String newPassword) throws AuthenticationException {
		//authenticate customer
		Customer c=signIn(email, oldPassword);
		//=> auth successful -> set password
		c.setPassword(newPassword);
		return "password changed";
	}

	@Override
	public String deleteCustomerDetails(String email) throws CMSException {
		//delete by PK
		//indexOf
		int index=customers.indexOf(new Customer(email));
		if(index == -1)
			throw new CMSException("Customer deletion Failed - Email doesn't exist!!!!");
		System.out.println(customers.remove(index));
		return "Customer details deleted....";
	}
	
	

	}
