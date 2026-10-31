package com.event.core;

public class Participant {

	//data members
	private static int counter;
	private int seatNo;
	private String name;
	private String email;
	private String contactNo;
	private String department;
	
	static {
		counter++;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Participant(String name, String email, String contactNo, String department) {
		super();
		this.seatNo = counter;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.department = department;
	}
	
	@Override
	public String toString() {
//		super.toString();
		return  " seatNo "+seatNo+" name "+ name+" email "+ email+" contactNo "+contactNo+" department "+department;
	}

}
