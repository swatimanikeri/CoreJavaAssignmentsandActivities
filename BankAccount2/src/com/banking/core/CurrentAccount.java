package com.banking.core;

public class CurrentAccount extends BankAccount {

	private double overdraftLimit;//100
	private boolean useOverdraftFacility;//true

	public CurrentAccount(int accNum,double balance, String custName,double overdraftLimit,boolean useOverdraftFacility ) {
		super(accNum, balance,  custName);
		this.overdraftLimit=overdraftLimit;
		this.useOverdraftFacility=useOverdraftFacility;
	}
	
	//getters and setters 
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public boolean isUseOverdraftFacility() {
		return useOverdraftFacility;
	}
	public void setUseOverdraftFacility(boolean useOverdraftFacility) {
		this.useOverdraftFacility = useOverdraftFacility;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	//toString to getAccountDetails
	@Override
	public  String toString() {
		String details=super.toString()+" overdraftLimit "+overdraftLimit+" useOverdraftFacility "+useOverdraftFacility;
		return details;
	}
	
	//withdraw
	@Override 
	public  void withdraw(double amount) {
//		double total=super.getBalance()+amount;
	 double extraAmount=0.00;
	 double remainDraft=0.00;
	 setBalance(getBalance()-amount);
	 
			if(getBalance()<0) {
			amount=amount-getBalance();
				remainDraft-=extraAmount;
				
				if(remainDraft==0) {
					System.out.println("withdraw Failed!!!");
				}
			}
			
		}
	
}
