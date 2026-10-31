package com.cms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSException;
import static com.cms.service.CMSValidations.validateAllInputs;
public class CMSServiceImpl implements CMSService {
	private List<Customer> customers;//state ,Non static  ,heap pe obj banega
//tester calls this 
	
	//the main method depndent on this so the main ethiod call the constructor of this
	public CMSServiceImpl() {
//predefinedddddddddd sample data 
		this.customers = new ArrayList<>(1024);//capacity is greater 
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1990, 5, 12),
				ServicePlan.SILVER));
		//
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
//In case of succ validations:add custoner ref to list & return succ msg 
//and in case of failure:the exception automatically delegate to caller
	@Override
	public String registerCustomer(String firstName, String lastName, String email, String password, int regAmount,
			String dob, String plan) throws CMSException {
		// invoke method of ValidationRules - to validate all i/ps
		//we have to inkoke the method to validate ,yess,
		//validateAllInputs()
		
		
		//CMSValidations. nhi vapraych static kel tr
		customers.add(validateAllInputs( firstName, lastName,  email, password,  regAmount,dob,  plan,customers));//ctrl+1
				return "Successfully Registered!!!";
	}

	@Override
	public void displayCustomerDetails() {
            for(Customer c:customers) {
            	//.c.iterator calls hasnext
            	System.out.println(c);
            }
	}

	@Override
//	public Customer signIn(String email, String password) throws CMSException {
////		  if(email.equals(this.email) && password.equals(this.password)) {
////			  
////		  }
//		for(Customer c:customers) {
//			if(!c.getEmail().equals(email) && !c.getPassword().equals(password)) {
////				return throw new Exception();
//			}
//			
//		}
//		return c;
//	}

//
//	public Customer signIn(String email, String password) throws CMSException {
////		  if(email.equals(this.email) && password.equals(this.password)) {
////			  
////		  }
//		Customer c=null;
//		if(customers.indexOf(email)>=0){
//			c=customers.get(customers.indexOf(email));
//			if(!c.getPassword().equals(password)) 
//			{
//				throw new CMSException("Hiiiii sign in error");
//		    }
//			
//		}
//		return c;
//}
	

//	public Customer signIn(String email, String password) throws CMSException {
////		  if(email.equals(this.email) && password.equals(this.password)) {
////			  
////		  }
//		Customer c=customers.get(customers.indexOf(customers.contains(email)));
//			if(!c.getPassword().equals(password)) 
//			{
//				throw new CMSException("Hiiiii sign in error");
//		    }
//			
//	
//		return c;
//}
//	
	
	
	public Customer signIn(String email, String password) throws CMSException {
//		  if(email.equals(this.email) && password.equals(this.password)) {
//			  
//		  }
		Customer c=customers.get(customers.indexOf(customers.contains(email)));
			if(!c.getPassword().equals(password)) 
			{
				throw new CMSException("Hiiiii sign in error");
		    }
			
	
		return c;
}
	
	
	
//	  int index = numbers.indexOf(3);
//
//      System.out.println("The index of 3 is: " + index);
	}

