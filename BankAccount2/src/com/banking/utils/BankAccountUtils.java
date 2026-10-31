//package com.banking.utils;
//import com.banking.core.BankAccount;
//public class BankAccountUtils {
//
//	public static String getAccountSummary(BankAccount b) {
//		String details="Account No.: "+b.getAccNum()+" balance: "+b.getBalance()+" Customer Name: "+b.getCustName();
//		return details;
//	}
//	public static double getBalance(BankAccount b) {
//		return b.getBalance();
//	}
//	//methods
//	public  void  deposit(double amount,BankAccount b) {
//	b.setBalance(b.getBalance()+amount);
//	}
//	public  void withdraw(double amount,BankAccount b) {
//		if(amount<0) {System.out.println("The entered amount is Invalid!!");}
//		else
//			b.setBalance(b.getBalance()-amount);
//	}
//	public String toString(BankAccount b) {
//		String details="Account No.: "+b.getAccNum()+" balance: "+b.getBalance()+" Customer Name: "
//	+b.getCustName();
//		return details;
//	}
//}
