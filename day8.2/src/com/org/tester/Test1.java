package com.org.tester;

import com.org.core.Employee;

public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		Employee e2=new Employee(100, "Mihir Sen",12000, "mihir@gmail.com");
		System.out.println(e1.equals(e2));//true | false
	//	System.out.println(e1==e2);//f

	}

}
