//package tester;
//
//import java.io.FileWriter;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//import java.io.PrintWriter;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//import core.Student;
//import multithreadingio.SortAsPerBirthDateTask;
//import utils.StudentCollectionUtils;
//
//public class Test2 {
//	public static void main(String[] args) throws InterruptedException {
//		try(Scanner sc=new Scanner(System.in);
//				FileWriter fw=new FileWriter(sc.nextLine());
//				PrintWriter pw=new PrintWriter(fw);
//				OutputStream os=new OutputStream(fw);
//				ObjectOutputStream oos=new ObjectOutputStream();
//				
//				){}catch(Exception e){}
//		 List<Student> student= StudentCollectionUtils.populateList();
//		 Map<String, Student> student1=StudentCollectionUtils.populateMap(student);
//		 
//		 SortAsPerBirthDateTask dobTask=new SortAsPerBirthDateTask(student1,pw);
//		 Thread t1=new Thread(dobTask,"dob");
//		 
//		 t1.start();
//		 t1.join();
//		 
//		 
//	}
//}


package tester;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

import core.Student;
import multithreadingio.DetailsOfStudentOfSpecifiedCity;
import multithreadingio.SortAsPerBirthDateTask;
import multithreadingio.SortAsPerNameandGpaTask2;
import utils.StudentCollectionUtils;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Enter file name for birth date sorting:");
        
   
        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter(sc.nextLine());
             PrintWriter pw = new PrintWriter(fw)) {
             
      
            Map<String, Student> studentMap = StudentCollectionUtils.populateMap(
                StudentCollectionUtils.populateList()
            );
            
            
//            SortAsPerBirthDateTask dobTask = new SortAsPerBirthDateTask(studentMap, pw);
//            Thread t1 = new Thread(dobTask, "dob-thread");
//            
//            t1.start();
//            t1.join(); 
//            
//            SortAsPerNameandGpaTask2 NameandGpaTask = new SortAsPerNameandGpaTask2(studentMap, pw);
//            Thread t2 = new Thread(NameandGpaTask, "NameandGpaTask");
//            
//            t2.start();
//            t2.join(); 
            
            System.out.println("Enter the city ");
            DetailsOfStudentOfSpecifiedCity specifiedcity = new DetailsOfStudentOfSpecifiedCity(studentMap, pw,sc.nextLine());
            Thread t3 = new Thread(specifiedcity, "specifiedcity");
            
            t3.start();
            t3.join(); 
            
            
         
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}