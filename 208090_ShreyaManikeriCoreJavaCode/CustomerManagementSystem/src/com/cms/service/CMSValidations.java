package com.cms.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
			int regAmount, String dob, String plan, Map<String,Customer> customers) throws CMSException {
		validateEmail(email);
		checkForDuplicate(email, customers);
		ServicePlan validPlan = parseAndValidatePlanAndAmount(plan, regAmount);
		// => validation success
		return new Customer(firstName, lastName, email, 
				password, regAmount, LocalDate.parse(dob),
				validPlan);
	}

	/* add a static method to check for dup
	 * in case of duplicate customer (i.e having same email id) found 
	 *  - raise the custom exception
	 *  
	 */
	public static void checkForDuplicate(String email, Map<String,Customer> map) throws CMSException {
		
		if(map.containsKey(email))
			throw new CMSException("Dup email !!!!!");

	}

	/*
	 * In case of invalid email 
	 *  - throw custom exception
	 *  - otherwise simply return 
	 */
	public static void validateEmail(String email) throws CMSException {
		String emailRegEx = "^[a-z][a-z0-9._-]*@[a-z]+\\.(com|org|net)$";
		if(!email.matches(emailRegEx))
			throw new CMSException("Invalid Email Format !!!!");
			
	}

	/*
	 * Parse (String -> ServicePlan : enum)
	 * In case of invalid plan , JVM throws IllegalArgumentException
	 * In case of valid plan , validate reg amount for the plan
	 *  - in case of invalid amount , throw custom exception
	 * - otherwise return parsed & validated ServicePlan to the caller
	 */
	public static ServicePlan parseAndValidatePlanAndAmount
	(String plan, int regAmount) throws IllegalArgumentException
	,CMSException{
		//parse
		ServicePlan servicePlan=ServicePlan.valueOf(plan);
		//valid plan -> now validate reg amount
		if(servicePlan.getPlanCost() != regAmount)
			throw new CMSException("Reg amount doesn't match with the chosen plan!!!!");
		// success
		return servicePlan;

	}

}
