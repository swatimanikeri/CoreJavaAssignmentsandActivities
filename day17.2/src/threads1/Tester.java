package threads1;

public class Tester {

	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread());// Thread[name: main , 5 , main: thread group]
			// create & start new thread
			NewThread t1 = new NewThread("one");
	//		System.out.println(t1);// [one ,5 , main]
			System.out.println(t1.getState());// NEW
			t1.start();// RUNNABLE
			System.out.println(t1.getState());//RUNNABLE
	//		Thread.sleep(5000);
			System.out.println("main continues....");
			System.out.println(t1.getState());//RUNNABLE TERMINATED
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
