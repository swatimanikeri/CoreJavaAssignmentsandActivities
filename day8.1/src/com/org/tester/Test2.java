package com.org.tester;

import com.org.core.Employee;

public class Test2 {

	public static void main(String[] args) {
		Object e1=new Employee(100, "Rama Patil",10000, "rama@gmail.com");
		Object e2=new Employee(100, "Mihir Sen",12000, "mihir@gmail.com");
		System.out.println(e1.equals(e2));//true | false ---------1
	//	System.out.println(e1==e2);//f
      // in 1st one  the equals methos get called is of Object not Employee.We have to override that 
		//,override only with  empId ,not the whole think
		
	}

}
