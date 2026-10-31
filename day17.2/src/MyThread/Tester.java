package MyThread;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try {
		
			//we cant pass the para to resp class
//			MyRunnableTask task = new MyRunnableTask();
		    Scanner sc=new Scanner(System.in);
			System.out.println("enter input");
			int begin=sc.nextInt();
			int end=sc.nextInt();
//			2.Execute these tasks in async concurrent manner
//
//			2.1 Print all even nos in the user supplied range
//
//			2.2 Print sum of squares of all odd nos in the range
//
//			2.3 Print average of sqrts of all nos in the range
			
			
			EvenPrinter taskEven = new EvenPrinter(begin,end);
			Thread even=new Thread(taskEven,"even"); 
			
			OddSquareTask OddSquareTask  = new OddSquareTask (begin,end);
			Thread Odd=new Thread(OddSquareTask ,"oddSqr"); 
			
			AvgOfSqrt avgOfSqrt  = new AvgOfSqrt (begin,end);
			Thread avg=new Thread(avgOfSqrt ,"avgOfSqr"); 
			
			even.start();
			Odd.start();
			avg.start();
			
			even.join();
	Odd.join();
	avg.join();
//		square.join();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
