/*
 * Tests overriding of toString method
 */
package com.events.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cms.core.Customer;
import com.events.core.Faculty;
import com.events.core.Person;
import com.events.core.Student;

public class Test1 {

	public static void main(String[] args) {
//		//indirect referencing 
//		Person p=new Student("a1","b1","Pune",2025,"Java",12345,78);//up casting : Student ---> Person
//		System.out.println(p);  // p.toString student details
//		
//		p=new Faculty("a2", "b2", "Mumbai", 10, "Java MERN");//up casting
////		System.out.println(p);//p.toString Faculty's getDetails
/// 
//	 List<Integer> i=new ArrayList<>();
//	 i.add(10);
//	 i.add(37);
//	 i.add(45);
//	 
//	 System.out.println(i.indexOf(7));
		 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 56));

	        // Find the index of the number 3
	        int index = numbers.indexOf(3);

	        System.out.println("The index of 3 is: " + index); // Outputs: 2
	

	}

}
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create the ArrayList with your numbers
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 56));
//
//        // Find the index of the number 3
//        int index = numbers.indexOf(3);
//
//        System.out.println("The index of 3 is: " + index); // Outputs: 2
//    }
//}
