package com.banking.core;
import java.util.*;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(int accNum,double balance, String custName,double interestRate){
		super(accNum, balance,  custName);
		this.interestRate=interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public static void applyInterest(SavingAccount s) {
		System.out.println("We applied the intersert rate "+s.getInterestRate());
		s.setBalance((s.getBalance()*s.getInterestRate())/100);
	}
	
	
}
