package service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;

import utils.StudentCollectionUtils;
public class StudentService {
//	 public static List<Student> populateList()
	List<Student> students=StudentCollectionUtils.populateList();
//	Map<Integer, Student> productMap = populateProductMap(populateStudentList());
//	3.0 Display all student details from the student map.
	public  void displayAllStudents(){
		System.out.println("3.0 Display all student details from the student map.");
		System.out.println("All Student Details >>");
		students.stream()
		.forEach(s->System.out.println(s) );
		System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
	}
//	3.1 Display  details of the students(from student list) from  specified subject
	
	public  void displayStudentDetailsSpecifiedSub(String subject){
	 Subject sub=Subject.valueOf(subject);
	 System.out.println("3.1 Display  details of the students(from student list) from  specified subject");
		System.out.println("All Student Details of  a specific subject >> "+subject);
		students.stream()
		.filter(s->s.getSubject()==sub)
		.forEach(s->System.out.println(s));
		System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
	}
	
//	3.2 Print sum of  gpa of students  from the specified state
//	i/p : name of the state
	public  void sumOfGpaOfStudents(Address add){
			double sumOfGpa=
			 students.stream()
			.filter(s->s.getAddress().getState().equals(add.getState()))
			.mapToDouble(s->s.getGpa())
			.sum();
			System.out.println("3.2 Print sum of  gpa of students  from the specified state");	

			System.out.println("sum of gpa from "+add.getState()+" State >> "+sumOfGpa);	
			System.out.println("-------------------------------------------------------------------------");	
			System.out.println();
		}
	

//	public  void AddressofStudents(){
//		students.stream()
//		.forEach(s->System.out.println(s.getAddress()) );
//	}
//	3.3 Print name of specified subject  topper	i/p : subject name
//	public  void getTopperInSubject(String sub){
//	Subject subject=Subject.valueOf(sub);
//	OptionalDouble max= students.stream()
//		.filter(sb->sb.getSubject()==subject)
//		.mapToDouble(s->s.getGpa())
//		.max();
//		System.out.println("hii"+max.getAsDouble());	
//	}
	
//	3.4 Print number  of  failures for the specified subject chosen  from user.
//
//	i/p : subject name
//
//	(failure is GPA < 5.0 , out of 1-10)
//	* stream , filter/s,count
	public  void getFailureInSubject(String sub){
		System.out.println("3.4 Print number  of  failures for the specified subject chosen  from user.");
		Subject subject=Subject.valueOf(sub);
	       students.stream()
			.filter(sb->sb.getSubject()==subject)
			.filter(p->p.getGpa()<5.0)
		    .forEach(p->	System.out.println(p.getName()));
	   	System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
			
		}
	
//	3.5 Display names of students enrolled in a specified subject , securing marks > specified marks
//
//	i/p : subject name , marks * stream , filters,forEach
	
	public  void displayStudentswithMarksCriteria(String sub,int marks){
		Subject subject=Subject.valueOf(sub);
		System.out.println("3.5 Display names of students enrolled in a specified subject , securing marks > specified marks");
		 students.stream()
			.filter(sb->sb.getSubject()==subject)
			.filter(p->p.getGpa()<5.0)
			.filter(m->m.getGpa()>marks)
			.forEach(sm->System.out.println(sm));
			System.out.println("-------------------------------------------------------------------------");	
			System.out.println();
		}
	
	public  void getTopperInSubject(String sub){
		Subject subject=Subject.valueOf(sub);

		Optional<Student> maxstudent= students.stream()
        .filter(sb->sb.getSubject()==subject)
		.sorted((s1,s2)->Double.compare(s2.getGpa(),s1.getGpa()))
		.findFirst();
		System.out.println("3.3 Print name of specified subject  topper");
		System.out.println(maxstudent.get().getName());
		System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
		}
	
//	3.6 Suppose a particular subject faculty is unavailable for few days. So you have to inform the students of specified subject.
//	Collect the specified subject students into the set n display it.
//	i/p : subject name
//	* stream , filter , collect(Collectors.toSet()) -> Set<Student>
	public  void notifyStudentsAboutFacultyUnavailable(String sub){
		Subject subject=Subject.valueOf(sub);
System.out.println("3.6 Suppose a particular subject faculty is unavailable for few days. So you have to inform the students of specified subject.	Collect the specified subject students into the set n display it.");
//		1.Collect the specified subject students into the set n display it.
		List<Student> subStudents= 
		students.stream()
        .filter(sb->sb.getSubject()==subject)
	    .collect(Collectors.toList());
		subStudents.stream().forEach(s->System.out.println(s));
		System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
}
	
//	3.9 Print distinct names of home cities (no dups please !) of all Students.	* distinct

	public void showDistinct() {
		System.out.println("3.9 Print distinct names of home cities (no dups please !) of all Students.	* distinct");
		students.stream()
		.map(i->i.getAddress().getCity())
		.distinct()
		.forEach(s->System.out.println(s));;
		System.out.println("-------------------------------------------------------------------------");	
		System.out.println();
	}
	
} 
