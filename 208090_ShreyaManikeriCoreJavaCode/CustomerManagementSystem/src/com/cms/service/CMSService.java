package com.cms.service;

import com.cms.core.Customer;
import com.cms.custom_exceptions.AuthenticationException;
import com.cms.custom_exceptions.CMSException;

//business logic layer (service layer) interface
public interface CMSService {
//register customer
	String registerCustomer(String firstName, String lastName, String email, String password, int regAmount, String dob,
			String plan) throws CMSException;

	void displayCustomerDetails();

	Customer signIn(String email, String password) throws AuthenticationException;

	String changePassword(String email, String oldPassword, String newPassword) throws AuthenticationException;

	String deleteCustomerDetails(String email) throws CMSException;

	void displayCustomersByPlan(String plan);

	String upgradePlan(String date);

	void sortCustomersByEmail();

}
