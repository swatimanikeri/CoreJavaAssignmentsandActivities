package com.events.tester;

import com.events.core.Faculty;
import com.events.core.Person;
import com.events.core.Student;

public class Test3 {

	public static void main(String[] args) {
		//indirect referencing 
		Person p; //super class reference
		/*
		 * Super class reference can DIRECTLY (i.e w/o any type casting) refer to ANY 
		 * sub class object - up casting (widening) - implicitly performed by javac
		 */
		p=new Student("a1","b1","Pune",2025,"Java",12345,78);//up casting : Student ---> Person
		System.out.println(p.getDetails()); //run time polymorphism 
		/*
		 * JVM - applies run time polymorphism
		 *  - JVM invokes getDetails () -> Student type of instance
		 *  => Late binding
		 */
		p=new Faculty("a2", "b2", "Mumbai", 10, "Java MERN");//up casting
		System.out.println(p.getDetails());//Faculty's getDetails

	}

}
