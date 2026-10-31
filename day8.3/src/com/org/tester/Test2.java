package com.org.tester;

import com.org.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		Object e1=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		Object e2=new Employee(101, "Mihir Sen",12000, "mihir@gmail.com");
		Object e3=new Employee(100, "Kiran Patel",10000, "kiran@gmail.com");
		Object e4=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		System.out.println(e1.equals(e2));//f
		System.out.println(e1.equals(e3));//f
		System.out.println(e1.equals(e4));//t
		

	}

}
