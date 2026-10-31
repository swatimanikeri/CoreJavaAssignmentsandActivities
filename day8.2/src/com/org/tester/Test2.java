package com.org.tester;

import com.org.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		Object e1=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		Object e2=new Employee(101, "Mihir Sen",12000, "mihir@gmail.com");
		Object e3=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		System.out.println(e1.equals(e2));//false
		System.out.println(e1.equals(e3));//true - 
		Object o="Hello";//up casting
		System.out.println(e1.equals(o));//false 

	}

}
