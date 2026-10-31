package com.cms.service;

import com.cms.core.Customer;
import com.cms.custom_exceptions.CMSException;

//business logic layer (service layer) interface
public interface CMSService {
//register customer
	String registerCustomer(String firstName, String lastName, String email, String password, int regAmount, String dob,
			String plan) throws CMSException;
//Who is goint to call this method==>tester 
	void displayCustomerDetails();

//	Customer signIn(String email, String password) throws CMSException;
	Customer signIn(String email, String password) throws CMSException;
	
//
}