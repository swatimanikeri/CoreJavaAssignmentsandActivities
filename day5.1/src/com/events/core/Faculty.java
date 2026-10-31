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
	/*override toString - to return Faculty's details
	 * Overriding form of the method (inherited from Person class)
	 * 
	 */
	@Override
		public String toString() {
			return "Faculty - "+super.toString()+" exp in years "+experienceInYears+" SME "+sme;
		}
	/*
	 * Adding Faculty specific functionality
	 * - evaluate student
	 */
	public void evaluateStudent(String grade)
	{
		//print last name of the faculty giving grade ... to the student
		System.out.println("Faculty - "+super.getLastName()+" evaluted student with grade "+grade);
	}
}
