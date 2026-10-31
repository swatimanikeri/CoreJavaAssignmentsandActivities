package threads3;

public class Tester {

	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread());// Thread[name: main , 5 , main: thread group]
			// create & start new thread - using anonymous inner class
			// run - simply a message - "one" is running
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + " is running via ano inner class");
				}
			}, "one"); //t1 : NEW
			t1.start();
			System.out.println(t1.getState());
			/*
			 * Create another thread using - lambda expression 
			 * - "two" is running
			 */
			Thread t2=new Thread(() -> System.out.println(Thread.currentThread().getName()+" is running via lambda expression "), "two");
			t2.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
