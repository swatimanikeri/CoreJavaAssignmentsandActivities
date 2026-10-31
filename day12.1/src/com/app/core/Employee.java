package com.app.core;

public class Employee {
	private String empId;
	private String name;
	private int deptId;
	private double salary;
	public Employee(String empId, String name, int deptId, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
	
}
