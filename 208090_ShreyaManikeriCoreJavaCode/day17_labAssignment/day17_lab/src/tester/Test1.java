package tester;

import java.util.Scanner;

import runnable_tasks.AverageSquareRootsTask;
import runnable_tasks.EvenNumberTask;
import runnable_tasks.OddNumberSquareTask;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter begin & end values");
			int begin=sc.nextInt();
			int end=sc.nextInt();
			//create task -> attach it to thread -> start thread
			Thread t1=new Thread(new EvenNumberTask(begin, end), "even");
			Thread t2=new Thread(new OddNumberSquareTask(begin, end), "odd");
			Thread t3=new Thread(new AverageSquareRootsTask(begin, end), "avg");
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting form child threads to complete exec");
			t1.join();
			t2.join();
			t3.join();
			System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
