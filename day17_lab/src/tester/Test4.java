//package tester;
//
//import java.util.List;
//import java.util.Map;
//
//import core.Student;
//import multithreadingio.SortAsPerBirthDateTask;
//import utils.StudentCollectionUtils;
//
//public class Test4 {
//	public static void main(String[] args) throws InterruptedException {
//		 List<Student> student= StudentCollectionUtils.populateList();
//		 Map<String, Student> student1=StudentCollectionUtils.populateMap(student);
//		 
//		 SortAsPerBirthDateTask dobTask=new SortAsPerBirthDateTask(student1);
//		 Thread t1=new Thread(dobTask,"dob");
//		 
//		 t1.start();
//		 t1.join();
//		 
//	}
//}
