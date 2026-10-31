package com.cms.ui;

import java.util.Scanner;

import com.cms.core.Customer;
import com.cms.service.CMSService;
import com.cms.service.CMSServiceImpl;

public class TestCMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CMSService service = new CMSServiceImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Register Customer " + "2.Display All 3. Sign In 4. Change Password " +"5. Unsubscribe Customer 6. Display customer names subscribed to specific plan 7. Upgrade Plan (from Gold -> Diamond) for the customers born after specific date 8. Sort customer details by email 0.Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter customer details - firstName,  lastName, email,  password,  regAmount,dob,  plan");
						// invoke service layer method to exec B.L(business logic)
						System.out.println("Reg status " + service.registerCustomer(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.next(), sc.next().toUpperCase()));
						break;
					case 2:
						System.out.println("All customer Details");
						service.displayCustomerDetails();
						break;
					case 3:// sign in (login)
						System.out.println("Enter email & password for sign in");
						Customer customer = service.signIn(sc.next(), sc.next());
						System.out.println("Login Successful !");
						System.out.println(customer);
						break;
					case 4:// change password(update)
						System.out.println("Enter email ,  old password & new password ");				
						System.out.println(service.changePassword(sc.next(), sc.next(), sc.next()));
						break;
					case 5:// un subscribe customer (delete customer details)
						System.out.println("Enter email to un subscribe");
						System.out.println(service.deleteCustomerDetails(sc.next()));
						break;
					case 6:// Display customer names subscribed to specific plan
						System.out.println("Enter service plan name");
						service.displayCustomersByPlan(sc.next().toUpperCase());
						break;
					case 7:// Upgrade Plan (from Gold -> Diamond) for the customers born after specific date
						System.out.println("Enter date");
						service.upgradePlan(sc.next());
						break;
					case 8://display customer details sorted by email (asc)						
						service.sortCustomersByEmail();
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();// read all of the pending tokens from Scanner's buffer till new line
					System.out.println(e);
					System.out.println("Please retry - ");
				}
			}

		} // sc.close()

	}

	

}
