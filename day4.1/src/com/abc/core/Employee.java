package com.abc.core;
//id:int , name : String, salary: double , deptId:int

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private int deptId;
	
	public static int idCounter;
	static {
		System.out.println("in emp's static init block");
		idCounter=1000;
	}
	public Employee(String firstName, String lastName, double salary, int deptId) {
		this.id=idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.deptId = deptId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void incrementSalary(double increment)
	{
		this.salary += ((this.salary*increment) /100);
	}
	public int getDeptId() {
		return deptId;
	}	
	

}
