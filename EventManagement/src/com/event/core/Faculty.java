package com.event.core;

public class Faculty extends Participant {

	
	private String designation;
	private String specialization;
	
	public Faculty(String name, String email, String contactNo, String department, String designation, String specialization) {
		super( name, email, contactNo, department);
		this.designation=designation;
		this.specialization=specialization;
	}
	@Override
	public String toString() {
		return  super.toString()+" designation "+designation+" specialization "+specialization;
	}
	
	public void studentEvaluation() {
		System.out.println("student evakuation by faculty");
	}
}
