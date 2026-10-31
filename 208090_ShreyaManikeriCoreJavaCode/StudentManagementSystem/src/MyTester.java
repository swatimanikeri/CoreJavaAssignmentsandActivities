import java.util.Scanner;

import com.app.core.Address;

import service.StudentService;


public class MyTester {

	public static void main(String[] args) {
		StudentService s=new StudentService();
		try(Scanner sc =new Scanner(System.in)){
		

			try {
				s.displayAllStudents();
                System.out.println("Enter the subject for which you want to see detials of student");
            	s.displayStudentDetailsSpecifiedSub(sc.nextLine().toUpperCase());
             	Address add=new Address("indore","MP","752446");
         		s.sumOfGpaOfStudents(add);;
				System.out.println("hIIIIIIIII");
                s.getTopperInSubject("JAVA");
                   s.getTopperInSubject("JAVA");
                   s.getFailureInSubject("DBT");
                   s.displayStudentswithMarksCriteria("JAVA",20);
                  s.notifyStudentsAboutFacultyUnavailable("DBT");
                 s.showDistinct();
                  
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}



//3.0 Display all student details from the student map.
//
//
//
//3.1 Display  details of the students(from student list) from  specified subject



//3.2 Print sum of  gpa of students  from the specified state
//
//i/p : name of the state
//
//
//
//3.3 Print name of specified subject  topper
//
//i/p : subject name





