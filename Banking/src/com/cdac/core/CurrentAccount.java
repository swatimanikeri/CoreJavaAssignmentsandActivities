package com.cdac.core;

public class CurrentAccount extends BankAccount {

	double overdraftLimit;
	boolean useOverdraftFacility;
	  

	   public CurrentAccount (int accountNumber, double balance, String customer_name, String phone_number, double overdraftLimit,
		boolean useOverdraftFacility) {
		super(accountNumber, balance,customer_name,phone_number);
		this.overdraftLimit=overdraftLimit;
	    this.useOverdraftFacility=useOverdraftFacility;
	   }
	   
	   
	   
//	   if(this.balance<0) {
//		   useOverdraftFacility=true;
//	   }
	   @Override
	   public void withdraw(double amount) {
		 if(amount>super.getBalance()) {
			 double  remaining=amount-super.getBalance();
			 overdraftLimit=overdraftLimit-remaining;
		 }
		
		}
	   
	   
	   
	}

	//1. Open Saving account
	//User i/p - accountNumber , balance  , customer name  , phone number , interest rate
	//
	//2. Open Current account
	//User i/p - accountNumber , balance  , customer name  , phone number ,overdraftLimit ,boolean field useOverdraftFacility
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