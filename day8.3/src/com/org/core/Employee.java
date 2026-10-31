package com.org.core;

public class Employee {
	// emp id : int , name : String , salary : int , email :String
	private int empId;
	private String name;
	private int salary;
	private String email;

	public Employee(int empId, String name, int salary, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}

	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in emp's equals");
		if (anotherObject instanceof Employee) {
			Employee e=((Employee) anotherObject);
			return this.empId ==e.empId && this.email.equals(e.email);
		}
		return false;
	}

}
