package threads2;

//implements Runnable 
public class MyRunnableTask implements Runnable {
	
	@Override
	public void run() /* throws InterruptedException */ {

		System.out.println("thread started ....." +Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("err in thread " + Thread.currentThread() + " exc " + e);
		}
		System.out.println(Thread.currentThread() + " over ");
	}
}
