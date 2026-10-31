package com.cdac.core;

public class SavingAccount extends BankAccount {
   private int interest_rate;

   public int getInterest_rate() {
	return interest_rate;
   }

   public void setInterest_rate(int interest_rate) {
	this.interest_rate = interest_rate;
   }

   public SavingAccount(int accountNumber, double balance, String customer_name, String phone_number,int interest_rate) {
	super(accountNumber, balance,customer_name,phone_number);
	this.interest_rate = interest_rate;
   }
   
}

//1. Open Saving account
//User i/p - accountNumber , balance  , customer name  , phone number , interest rate
//
//2. Open Current account
//User i/p - accountNumber , balance  , customer name  , phone number ,overdraftLimit ,boolean field useOverdraftFacility
//