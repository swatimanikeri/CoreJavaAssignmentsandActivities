package com.banking.tester;

import java.util.Scanner;

import com.banking.core.BankAccount;
import com.banking.core.CurrentAccount;
import com.banking.core.SavingAccount;
import com.banking.exceptions.InsufficientBalanceException;

public class TestBankAccount {
/*1.6 Write a Tester class in a separate package 
- TestBank
Given - This bank can support max accounts = 100.

Options
1. Open Saving account
User i/p - accountNumber , balance  , customer name  , phone number , interest rate

2. Open Current account
User i/p - accountNumber , balance  , customer name  , phone number ,overdraftLimit ,boolean field useOverdraftFacility

3.Display account summary
User i/p - account number

4.Deposit
User i/p - account number , amount

5. Withdraw
User i/p - account number , amount

6. Apply Interest 
- on all saving accounts
(Simple interest formula . T = 1year)

7. Update overdraft limit
User i/p - account number , new overdraft limit

0. Exit

*/
	public static void main(String[] args) {
		
		try( Scanner sc=new Scanner(System.in))
	
//		System.out.println("Enter the Bank Account details-accounNumber,balance,customer");
//		  BankAccount bankAccount=new BankAccount(sc.nextInt(),sc.nextDouble(),sc.next());
//		  System.out.println("Enter amount to deposit..");
//			BankAccountUtils.deposit(sc.nextDouble(),bankAccount);
//			  Syste.out.println("Enter amount to withdraw..");
//			BankAccountUtils.withdraw(sc.nextDouble(),bankAccount);
//			System.out.println("Account details are: ");
//			System.out.println(BankAccountUtils.getAccountSummary(bankAccount));
//			System.out.println("The balnce of your account is:"+BankAccountUtils.getBalance(bankAccount));
		{
//			System.out.println("Enter maximum no.of accounts.");

			
//		BankAccount[] bankAccount=new BankAccount[sc.nextInt()];
		BankAccount[] bankAccount=new BankAccount[2];
		boolean exit=false;
		int counter=0;
		bankAccount[0] = new SavingAccount(101, 50000.0, "Swati", 7.5);
		bankAccount[1] = new SavingAccount(101, 75000.0, "Shreya", 8.0);
		System.out.println(bankAccount[0].equals(bankAccount[1] ));
//		try {
//		while(!exit) {
//			System.out.println("0. Exit\n1. Open Saving account\n2. Open Current account\n3. Display account summary\n4. Deposit\n5. Withdraw\n");
//			System.out.println("6. Apply Interest\n7. Update overdraft limit\n");
//			
//			switch(sc.nextInt()) {
//			case 0: exit=true;
//			       System.out.println("Exiting!!");
//			       break;
//			
//			case 1: 
//			       System.out.println("Enter The account details to open Saving account..accNum, balance, custName, interestRate");
//			       bankAccount[counter]=new SavingAccount(sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextDouble());
//			       //int accNum,double balance, String custName,double interestRate){ super(accNum, balance,  custName
//			       counter++;
//			       
//			       System.out.println("Created Saving account successfully!!");
//			       break;
//			case 2: 
//			       System.out.println("Enter The account details to open Current account.- accNum, balance, custName, overdraftLimit, useOverdraftFacility");
//			       bankAccount[counter]=new CurrentAccount(sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextDouble(),sc.nextBoolean());
//			       //int accNum,double balance, String custName,double overdraftLimit,boolean useOverdraftFacility
//			       System.out.println("Created current account successfully!!");
//			       counter++;
//			       break;
//			case 3:for(BankAccount accounts:bankAccount) {
//				  System.out.println(accounts);
//			      }
//			    	break;
//			 case 4:
//			    System.out.println("Enter account number:");
//			    int accNum = sc.nextInt();
//
//			    System.out.println("Enter the amount to deposit:");
//			    double amount = sc.nextDouble();
//
//			    for (int i = 0; i < counter; i++) {
//			        if (bankAccount[i].getAccNum() == accNum) {
//			            bankAccount[i].deposit(amount);
//			            System.out.println("Amount deposited successfully!");
//			            break;
//			        }
//			    }
//		
//				    break;
//			 case 5:
//				    System.out.println("Enter account number:");
//				    int accNum1 = sc.nextInt();
//
//				    System.out.println("Enter the amount to withdraw:");
//				    double amount1 = sc.nextDouble();
//
//				    boolean found = false;
//
//				    for (int i = 0; i < counter; i++) {
//				        if (bankAccount[i].getAccNum() == accNum1) {
//				            bankAccount[i].withdraw(amount1);
//				            System.out.println("Withdrawal successful!");
//				            found = true;
//				            break;
//				        }
//				    }
//
//				    if (!found) {
//				        System.out.println("Account not found!");
//				    }
//
//				    break;
//			} //switch
//		} //while
//	}//try catch
//catch(InsufficientBalanceException e) {
//	System.out.println(e.getMessage());
//}
	}
	}//main
	
}//class