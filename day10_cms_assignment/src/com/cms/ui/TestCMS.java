package com.cms.ui;

import java.util.Scanner;

import com.cms.service.CMSService;
import com.cms.service.CMSServiceImpl;

public class TestCMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CMSService service = new CMSServiceImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Register Customer " + "2.Display All 3. Sign In  " + "0.Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter customer details - firstName,  lastName, email,  password,  regAmount,dob,  plan");
						// invoke service layer method to exec B.L(business logi); 
						service.registerCustomer(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),sc.next(),sc.next().toUpperCase());
						break;
					case 2:
						System.out.println("All customer Details");
                         //call service layes methos
						 service.displayCustomerDetails();
						break;
					case 3:// sign in (login)
						System.out.println("Enter email & password for sign in");
						System.out.println( (service.signIn(sc.nextLine(),sc.nextLine())).toString());
                     
                    	  
   
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {		
					sc.nextLine();//read all pending tokens from scanners buffer till new line
					System.out.println(e);
				}
			}

		}

	}

}
