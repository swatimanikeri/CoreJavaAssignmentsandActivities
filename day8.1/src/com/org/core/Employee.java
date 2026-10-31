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

//	@Override
//	//javac error - it's NOT an overriding form - since different method parameter
//	public boolean equals(Employee anotherEmp) {
//		System.out.println("in emp's equals");
//		return this.empId == anotherEmp.empId;
//	}
	
//	@Override
//	public boolean equals(Object anotherObj) {
//		if(anotherObj instanceof Employee){
//			Employee e=(Employee)anotherObj;
//					if(e.empId==this.empId) {
//						return true;
//					}
//					else {
//						return false;
//					}
//		}
//		return false;
//	}

	
	//Overriding with email and empId
	@Override
	public boolean equals(Object anotherObj) {
		if(anotherObj instanceof Employee){
			Employee e=(Employee)anotherObj;
					if(e.empId==this.empId && e.email.equals(this.email)) {
						return true;
					}
					else {
						return false;
					}
		}
		return false;
	}

}
