package com.events.core;

//graduation year,course,fees,marks
public class Student extends Person {
	private int gradYear;
	private String course;
	private int fees;
	private int marks;

	public Student(String firstName, String ln, String adr, int year, String course, int fees, int marks) {
		super(firstName, ln, adr);// init fn ln , adr
		System.out.println("in student's ctor");
		this.gradYear = year;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	/*add instance method - to return Student's details
	 * Overriding form of the method - toString
	 * 
	 */
	@Override
		public String toString() {
			return "Student - "+super.toString()+" grad year "+gradYear+" course "+course+" Fees "+fees+" Marks "+marks;
		}
	/*
	 * Adding Student specific functionality
	 * - submit feedback
	 */
	public void submitFeedback(String comment)
	{
		//print first name of the student giving feedback ... to the faculty
		System.out.println("Student - "+super.getFirstName()+" submitting feedback for faculty  comment -"+comment);
	}
}
