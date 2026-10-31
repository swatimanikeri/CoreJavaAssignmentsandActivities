package com.cms.service;

import java.time.LocalDate;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSException;

/*
 * no dup customers 
(i.e if the customer tries to register using existing email
 , raise custom exception)


 */
public class CMSValidations {
//add a single method to validate all inputs
	//caller=Service layer
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			int regAmount, String dob, String plan, List<Customer> customers) throws CMSException {
		validateEmail(email);
		checkForDuplicate(email, customers);
		//ye main main class me kiya tha
		ServicePlan validPlan = parseAndValidatePlanAndAmount(plan, regAmount);//Validation Success,ValidationRule-->BL
		return new Customer(firstName, lastName, email, 
				password, regAmount, LocalDate.parse(dob),
				validPlan);//new returns the add 
	}//****************8yaha par original Customer obj create hoga yes*********************STARTING POINT ***********
	

	// add a static method to check for dup  ,well formed return,if not throws exception 
	public static void checkForDuplicate(String email, List<Customer> list) throws CMSException {
		
            
	}

	// add a static method to check if the email is well formed
	public static void validateEmail(String email) throws CMSException {
		String emailRegEx = "^[a-z][a-z0-9._-]*@[a-z]+\\.(com|org|net)$";
		
		if(!email.matches(emailRegEx)) {
			throw new CMSException("The email format is not well formeed try again");
		}
		else {
			System.out.println("Good.....");
		}
	}

	// add a static methd to validate a plan & reg amount
	//in case of success return 
	public static ServicePlan parseAndValidatePlanAndAmount
	(String plan, int regAmount) throws IllegalArgumentException
	,CMSException{
//		for(ServicePlan p:ServicePlan.values()) {
//			if(ServicePlan.valueOf(plan)==p){
//				return p;
//			}
//			else {
//				throw new IllegalArgumentException("heeeeeeee"); 
//			}
		//}
		ServicePlan p=ServicePlan.valueOf(plan);
		if(p.getPlanCost()!=regAmount) {
			throw new CMSException("Reg amount doesnt match with the chosen plan");
		}
		else {
			return p;
		}
	
		

	}

}
