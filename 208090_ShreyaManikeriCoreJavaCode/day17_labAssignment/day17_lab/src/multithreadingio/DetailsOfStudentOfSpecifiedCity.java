
////4\. **Practical use case of threads.**
////Create a multi threaded application to solve these objective in async concurrent manner
//
////3\. Sort the student details as per subject name n gpa  n save the sorted results (on separate lines) in the 2nd text file 

////4\. Store the roll no , name n gpa of all the students , from the specified city , sorted in desc order of GPA n save it in the 3rd text file

////5\. Ensure no orphans.



package multithreadingio;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Map;
import core.Student;

public class DetailsOfStudentOfSpecifiedCity implements Runnable,Serializable {
    
    private Map<String, Student> studentMap;
    private PrintWriter pw;
     
    String yourCity;
    public DetailsOfStudentOfSpecifiedCity(Map<String, Student> studentMap, PrintWriter pw,String yourCity) {
        this.studentMap = studentMap;
        this.pw = pw;
        this.yourCity=yourCity;
    }
//    sorted((s1, s2) -> s1.getDob().compareTo(s2.getDob()))
////4\. Store the roll no , name n gpa of all the students , from the specified city , sorted in desc order of GPA n save it in the 3rd text file
    @Override
    public void run() {
        studentMap.values().stream()
            .filter(v->v.getAddress().getCity().equals(yourCity))
            .sorted((d1,d2)-> Double.compare(d2.getGpa(),d1.getGpa()))
            
            .forEach(s -> pw.printf("%s %s %.2f %s ", 
                    s.getRollNo(), s.getName(), s.getGpa(), s.getAddress().getCity())); 
        
        System.out.println("Details of students with specified city added!!!!!!!!! ");
             pw.flush();
    }
}