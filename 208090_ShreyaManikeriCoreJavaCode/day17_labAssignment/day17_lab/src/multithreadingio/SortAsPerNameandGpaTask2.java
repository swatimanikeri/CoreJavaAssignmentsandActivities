package multithreadingio;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import core.Student;
import utils.StudentCollectionUtils;

public class SortAsPerNameandGpaTask2 implements Runnable {
	
	  private Map<String, Student> studentMap;
	    private PrintWriter pw;

    public  SortAsPerNameandGpaTask2(Map<String, Student> studentMap, PrintWriter pw) {
        this.studentMap = studentMap;
        this.pw = pw;
    }

//1\. Get a map of student details with sample (hard coded) data
//2\. Sort the students details as per birth date n save the sorted results (on SEPARATE  lines) in the 1st text file 
@Override
public void run() {
	  studentMap.values().stream()
	  .sorted(
			 (d1,d2)->
	         d1.getName().compareTo(d2.getName()))
	         .sorted((d1,d2)-> Double.compare(d1.getGpa(),d2.getGpa())
  		  )
	         .forEach(s -> pw.println(s)); 
	   System.out.println("sorted as per name and Gpa added!!!!!!!!! ");
       
}
}

//below is wrong
//	@Override
//	public void run() {
//		  student1.values().stream()
//		  .sorted(
//				 (d1,d2)->
//		         d1.getName().compareTo(d2.getName()) &&  Double.compare(d1.getGpa(),d2.getGpa())
//				.forEach(s->System.out.println(s));
//	}
//	}
	
//4\. **Practical use case of threads.**
//Create a multi threaded application to solve these objective in async concurrent manner

//3\. Sort the student details as per subject name n gpa  n save the sorted results (on separate lines) in the 2nd text file 
//4\. Store the roll no , name n gpa of all the students , from the specified city , sorted in desc order of GPA n save it in the 3rd text file
//
//5\. Ensure no orphans.