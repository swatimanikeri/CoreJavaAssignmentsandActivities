
////4\. **Practical use case of threads.**
////Create a multi threaded application to solve these objective in async concurrent manner
//
////3\. Sort the student details as per subject name n gpa  n save the sorted results (on separate lines) in the 2nd text file 
////
////4\. Store the roll no , name n gpa of all the students , from the specified city , sorted in desc order of GPA n save it in the 3rd text file
////
////5\. Ensure no orphans.



package multithreadingio;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Map;
import core.Student;

public class SortAsPerBirthDateTask implements Runnable,Serializable {
    
    private Map<String, Student> studentMap;
    private PrintWriter pw;
     
    public SortAsPerBirthDateTask(Map<String, Student> studentMap, PrintWriter pw) {
        this.studentMap = studentMap;
        this.pw = pw;
    }

    @Override
    public void run() {
        studentMap.values().stream()
            .sorted((s1, s2) -> s1.getDob().compareTo(s2.getDob()))
            .forEach(s -> pw.println(s)); 
        System.out.println("sorted as per birt date added!!!!!!!!! ");
       
        pw.flush();
    }
}