package com.event.core;

public class Student extends Participant {


	private String course;
	private int year;
	private String grade;
	
	public Student( String name, String email, String contactNo, String department, int year, String grade, String course) {
		super( name, email, contactNo, department);
		this.course=course;
		this.year=year;
		this.grade=grade;
	}
	@Override
	public String toString() {
		return  super.toString()+" course "+course+" year " +year+" grade "+grade;
	}
}
