package com.event.tester;

import java.util.Scanner;

import com.event.core.Faculty;
import com.event.core.Participant;
import com.event.core.Student;

public class TestEvent {
//	1. Prompt user for the event capacity.
//	2 Create suitable data structure to hold the participant details
//	3 Options
//	2. Register Student -
//	i/p : student details
//	3. Register Faculty -
//	i/p : faculty details
//	4. Display all participant details (use  for-each)
//	5. Display specific participant details
//	i/p : seat no
//	6. Student Evaluation By Faculty
//	i/p : faculty seat no , student name , student grade (A+ , A , B+ , B , C+ , C)
//	7. Feedback submission By student
//	i/p : student seat no , faculty name, feedback comment
//	8. Exit

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in);) {
		System.out.println("Enter the maximum capacity.");
		Participant[] participants=new Participant[sc.nextInt()];
		
		int cnt=0;
		
		boolean exit=false;
		while(!exit) {
			try {
				System.out.println("1. Register Student.\n2.Register Faculty\n3.Display all participant details");
				System.out.println("4.Student Evaluation By Faculty\n5.Display specific participant details\n8.Exit");
				System.out.println("Enter the choice");
				int choice=sc.nextInt();
				sc.nextLine(); 
				
				switch(choice) {
				case 1: 
					System.out.println("You selected Student.Enter details");
					//public Student(int seatNo, String name, String email, String contactNo, String department, int year, String grade, String course)
					participants[cnt++]=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.next(),sc.nextLine());
					 sc.nextLine(); 
					break;
				case 2:
					System.out.println("You selected Faculty. Enter details");
//					//public Faculty(int seatNo, String name, String email, String contactNo, String department, String designation, String specialization)
					
					participants[cnt++]=new Faculty(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
					
					break;
				case 3:
					System.out.println("The Participant Details are: ");
					for (Participant p : participants) {
				    if (p != null) {
				        System.out.println(p);
				    }
				}
					break;
				case 4:if(participants[cnt] instanceof Faculty)
					Faculty f=participants[cnt];
					participants[cnt].studentEvaluation();
				}
			}
			catch(Exception e) {
			    System.out.println("Invalid input! Please enter a number.");
			    sc.nextLine();
			}
			
		}
	}

	}

}
