package com.cms.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;

public class UpgradeSeniorCustomers {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>(1024);
		customers.add(new Customer("Amit", "Sharma", "amit@gmail.com", "amit@123", 1000, LocalDate.of(1965, 5, 12),
				ServicePlan.SILVER));
		customers.add(new Customer("Priya", "Verma", "priya@gmail.com", "priya@123", 2000, LocalDate.of(1995, 8, 23),
				ServicePlan.GOLD));
		customers.add(new Customer("Rahul", "Patil", "rahul@yahoo.com", "rahul@123", 5000, LocalDate.of(1960, 1, 3),
				ServicePlan.SILVER));
		customers.add(new Customer("Sneha", "Kulkarni", "sneha@gmail.com", "sneha@123", 10000,
				LocalDate.of(1961, 11, 17), ServicePlan.PLATINUM));
		customers.add(new Customer("Vikas", "Rao", "vikas@gmail.com", "vikas@123", 2000, LocalDate.of(1998, 6, 29),
				ServicePlan.GOLD));
		customers.add(new Customer("Meera", "Joshi", "meera@gmail.com", "meera@123", 1000, LocalDate.of(2000, 2, 14),
				ServicePlan.SILVER));
		customers.add(new Customer("Arjun", "Deshmukh", "arjun@gmail.com", "arjun@123", 5000, LocalDate.of(1962, 9, 5),
				ServicePlan.SILVER));
		customers.add(new Customer("Kavya", "Iyer", "kavya@gmail.com", "kavya@123", 10000, LocalDate.of(1993, 12, 25),
				ServicePlan.PLATINUM));
		System.out.println("original  list");
		for (Customer c : customers)
			System.out.println(c);
		System.out.println("--------------------------------");
		/*
		 * Upgrade all senior(age > 60) customers having  SILVER plan to GOLD plan

		 */
		LocalDate now =LocalDate.now();
		
		for(Customer c:customers) {
			int ageInYears=Period.between(c.getDob(),now).getYears();
			if(ageInYears>60 && c.getPlan()==ServicePlan.SILVER) {
				c.setPlan(ServicePlan.GOLD);
			}
		}

	}

}
