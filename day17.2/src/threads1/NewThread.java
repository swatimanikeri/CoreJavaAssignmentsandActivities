package threads1;

//extends Thread
public class NewThread extends Thread {
	public NewThread(String name) {
		super(name);
	}

	@Override
	public void run() /* throws InterruptedException */ {

		System.out.println("thread is running ....." + Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("err in thread " + Thread.currentThread() + " exc " + e);
		}
		System.out.println(Thread.currentThread() + " over ");
	}
}
