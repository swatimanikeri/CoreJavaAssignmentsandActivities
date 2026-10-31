package com.events.core;
//firstName,lastName , address

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	
	public Person(String firstName, String lastName, String address) {
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//override toString method - to return Person's details
	@Override 
	public String toString() {
		return firstName+" "+lastName+" Address - "+address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	

}
