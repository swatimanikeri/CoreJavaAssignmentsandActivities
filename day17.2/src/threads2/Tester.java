package threads2;

public class Tester {

	public static void main(String[] args) {
		try {
			//Thread classes toString is overriden to print thread details
			System.out.println(Thread.currentThread());// Thread[name: main , 5 , main: thread group]
			// create & start new thread
			MyRunnableTask task = new MyRunnableTask();
			//constr
			//attaching runnable task to a thread
			Thread t1=new Thread(task,"one");
			System.out.println(t1.getState());// NEW
			t1.start();// RUNNABLE
			System.out.println(t1.getState());//RUNNABLE
	//		Thread.sleep(5000);
			System.out.println("main is waiting for the child thread to complete exe....");
			t1.join();//main-->waiting,,,,,for t1 to complete the exe t1--->RUNNABLE
			//main will NOT Exe. until t1 is terminated
			System.out.println("After join..");
			System.out.println(t1.getState());// | TERMINATED
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
