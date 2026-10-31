package com.cdac.tester;
import com.cdac.core.BankAccount;
import com.cdac.core.CurrentAccount;
import com.cdac.core.SavingAccount;
import java.util.*;


//int accountNumber, double balance, String customer_name, String phone_number, int overdraftLimit,
//boolean useOverdraftFacility
public class BankMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter accounts to be added: ");
		System.out.println("1.Current account\n2.Saving Account");
		BankAccount arr[]=new BankAccount[sc.nextInt()];
		
		boolean exit=false;
		int cw=0;
		System.out.println("Enter your choice ");
		int c=sc.nextInt();
			while(!exit) {
				switch(c) {
				case 1:
					arr[cw]=new  CurrentAccount(1234,4500.99,"swati","887666",400,true);
					System.out.println("Added pp");
					cw++;
				       break;
				case 2:
					System.out.println("Entering in saving");
					arr[cw]=new SavingAccount(1234,4500.99,"shreya","8984666",4);
					cw++;
					System.out.println("Added swatiiiii");
					break;
				case 3:
					System.out.println("Exitingggggggggggg");
					break;
				case 0:
					exit=true;
					break;
				
				}
			
		}
		
			
			
		}
		
	}

//00 500 bank will give if(balance<0);


//
//Problem Statement
//
//A bank(eg HDFC)  offers support for creating  different types of accounts to its customers:
//
//Saving Account  -> applicable for earning interest.
//
//Current Account ->  allows overdraft facility.
//
//Bank Account  -> defines general features of all accounts.
//
//You are required to build a simple banking system using Java OOP concepts.
//
//Task 
//Q1. Basic Inheritance
//
//1.1 Create a class BankAccount with:
//
//Fields: accountNumber (int), balance (double) , customer name (String) , phone number (String)
//
//Add suitable constructor
//
//Methods:
//
//deposit(double amount)
//
//withdraw(double amount) (should not allow negative balance by default)
//
//getAccountSummary() - returns complete details of the account , in string format
//- replace by toString
//
//getBalance() - returns account balance.
//
//
//1.2 SavingAccount -> add interestRate field and method applyInterest().
//getAccountSummary() - returns complete details of the account along with interest rate ,  in string format
//
//1.3 CurrentAccount ->  add overdraftLimit field and boolean field useOverdraftFacility
//add a method to update overdraftLimit (NEW)
//
//1.4 SavingAccount -> should not allow any negative balance in  withdraw operation .It should fail in such case.
//
//1.5 CurrentAccount -> If customer has set useOverdraftFacility 
//then only 
//It should  allow any negative balance, in withdraw operation .It should not fail till it exceeds the overdraft limit. After overdraft limit is exceeded then withdraw operation should fail.
//
//Meaning
//Eg. 
//current a/c balance=1000
//overdraft limit set = 500
//customer tries to withdraw
//1. withdraw amount =700
//After withdraw 
//balance =300 , overdraft limit 500
//
//2. withdraw amount =1200
//After withdraw 
//balance =0 , overdraft limit 300
//
//3. withdraw amount =1600
//withdrawl failed
//
//
//1.6 Write a Tester class in a separate package 
//- TestBank
//Given - This bank can support max accounts = 100.
//
//Options
//1. Open Saving account
//User i/p - accountNumber , balance  , customer name  , phone number , interest rate
//
//2. Open Current account
//User i/p - accountNumber , balance  , customer name  , phone number ,overdraftLimit ,boolean field useOverdraftFacility
//
//3. Display account summary
//User i/p - account number
//
//4. Deposit
//User i/p - account number , amount
//
//5. Withdraw
//User i/p - account number , amount
//
//6. Apply Interest 
//- on all saving accounts
//(Simple interest formula . T = 1year)
//
//7. Update overdraft limit
//User i/p - account number , new overdraft limit
//
//0. Exit
//
//
//
//
//
