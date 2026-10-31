package com.events.tester;

import java.util.Scanner;
import com.events.core.*;

public class EventOrganizerApp {

	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);
		// prompt user for event capacity
		System.out.println("Enter even capacity");
		// create suitable D.S to hold student | faculty .....
		Person[] participants = new Person[sc.nextInt()];
		boolean exit = false;
		int counter = 0;//insted of for loop
		while (!exit) {
			System.out.println(
					"Options - 1.Register Student 2. Register Faculty 3. Display All 4.Display by seat no 5. Evaluate Student 6. Submit Feedback 0. Exit");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {//ArrayIndexOutOfBound 
					System.out.println(
							"Enter student details - firstName, lastname,  adr,  year,  course,  fees,  marks");
					participants[counter] = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextInt(), sc.nextInt());//Person class get loaded,student class loaded ,obj is created in heap 
					//array[0] me obj1 ka ref gaya,Indirect reference upcasting
					counter++;
					System.out.println("student registered");

				} else
					System.out.println("Event capacity Full !!!!!");
				break;
			case 2:
				if (counter < participants.length) {
					System.out.println("Enter faculty details - firstName, lastname,  adr,  exp in years ,  sme");
					participants[counter] = new Faculty(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next());
					counter++;
					System.out.println("faculty registered");

				} else
					System.out.println("Event capacity Full !!!!!");
				break;

			case 3:
				System.out.println("All registered participants - ");
				// {s1,s2,f1,s3,s4,f2,null....null}..............to check
				for (Person p : participants) // p=participants[0]=>copy of s1 reference 
				{
					if (p != null) {//println checks if is null then prints 
						System.out.println(p);//p.toString();
					}
				}
				break;
			case 4:
				System.out.println("Enter Seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Person ref = participants[index];
					if (ref != null) {
						System.out.println(ref);
					}
				} else
					System.out.println("Invalid seat no !!!!!!!!!!");
				break;

			case 5:
				System.out.println("Enter seat no of the faculty & grade");
				// Hint - call evaluateStudent method
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					//null checking & run time type checking using instanceof
					Person ref=participants[index];
					if (ref instanceof Faculty) {						
							((Faculty) ref).evaluateStudent(sc.next());	//downcasting happens here ,if not typecasting here,compilerr checks by ref type and no method found in person class.			
					} else 
						System.out.println("Invalid type - not a Faculty");
				} else
					System.out.println("Invalid seat no !!!!!!!!!!");
				break;
				
			case 6:
				System.out.println("Enter seat no of the student & comment");
				// Hint - call submitFeedback method of the student
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					//null checking & run time type checking using instanceof
					Person ref=participants[index];
					if (ref instanceof Person) {						
							((Student) ref).submitFeedback(sc.next());					
					} else 
						System.out.println("Invalid type - not a Student");
				} else
					System.out.println("Invalid seat no !!!!!!!!!!");
				break;

			case 0:
				exit = true;
				break;

			}
		}

		sc.close();

	}

}


