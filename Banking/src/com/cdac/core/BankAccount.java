package com.cdac.core;

public class BankAccount {
	private int accountNumber;
	private double balance ;
	private String customer_name;
	private  String phone_number;
	
	
	
	public BankAccount(int accountNumber, double balance, String customer_name, String phone_number) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer_name = customer_name;
		this.phone_number = phone_number;
	}
	
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;//getBalance
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", customer_name="
				+ customer_name + ", phone_number=" + phone_number + "]";
	}
	
	
	public void deposite(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	
	public String getAccountSummary(){
		return "Account Number is"+accountNumber+"Balance is" +balance+"Customer name "+customer_name+"phone number" +phone_number;
	}
	
}

//deposit(double amount)
//
//withdraw(double amount) (should not allow negative balance by default)
//
//getAccountSummary() - returns complete details of the account , in string format
//- replace by toString
//
//getBalance() - returns account balance.


