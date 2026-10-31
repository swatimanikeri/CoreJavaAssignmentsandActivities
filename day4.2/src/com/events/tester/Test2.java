package com.events.tester;

import com.events.core.Faculty;
import com.events.core.Student;

public class Test2 {

	public static void main(String[] args) {
		//direct referencing 
		//firstName, String ln, String adr, int year, String course, int fees, int marks
		Student s1=new Student("a1","b1","Pune",2025,"Java",12345,78);
		System.out.println(s1.getDetails());
		//String fn,String ln,String addr,int years,String sme
		Faculty f1=new Faculty("a2", "b2", "Mumbai", 10, "Java MERN");
		System.out.println(f1.getDetails());

	}

}
