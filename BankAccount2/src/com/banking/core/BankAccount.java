package com.banking.core;
import com.banking.exceptions.*;
public class BankAccount {
	
private int accNum;
private double balance ;
private String custName;
//constr.
public BankAccount(int accNum,double balance, String custName){
	this.accNum=accNum;
	this.balance=balance;
	this.custName=custName;
}
//getters setters for accessing private ele.
public int getAccNum() {
	return accNum;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public  double getBalance(BankAccount b) {
	return balance;
}


public static String getAccountSummary(BankAccount b) {
	String details="Account No.: "+b.getAccNum()+" balance: "+b.getBalance()+" Customer Name: "+b.getCustName();
	return details;
}
//override equals method
@Override
public boolean equals(Object o) {
	BankAccount b=null;
	if(o instanceof BankAccount)
		 b=(BankAccount)o;
	if(this.accNum== b.accNum)
		return true;
	return false;
}
//methods
public  void  deposit(double amount) {
balance+=amount;
System.out.println("withdraw of parent called");
}
public  void withdraw(double amount) throws InsufficientBalanceException {
	if(amount<0) throw new InsufficientBalanceException("Insufficient Balance!!");
	else
		balance=amount;
}
public String toString() {
	String details="Account No.: "+accNum+" balance: "+balance+" Customer Name: "
+custName;
	return details;
}
}
