package com.events.core;

public class Faculty extends Person {
	private int experienceInYears;
	private String sme;
	public Faculty(String fn,String ln,String addr,int years,String sme) {
		super(fn,ln,addr);
		System.out.println("in facutly's ctor");
		this.experienceInYears=years;
		this.sme=sme;
	}
	/*add instance method - to return Faculty's details
	 * Overriding form of the method (inherited from Person class)
	 * 
	 */
		public String getDetails() {
			return "Faculty - "+super.getDetails()+" exp in years "+experienceInYears+" SME "+sme;
		}
}
