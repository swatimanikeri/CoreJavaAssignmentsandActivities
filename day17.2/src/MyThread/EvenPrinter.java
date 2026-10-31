package MyThread;

import java.util.stream.IntStream;

public class EvenPrinter implements Runnable {
	
	int begin=0;
		int end=0;
	
		public EvenPrinter(int b,int e){
			begin=b;
			end=e;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"thread is working..");
			int sum=IntStream.rangeClosed(begin,end).filter(s->s%2==0).sum();
			System.out.println("The Sum of Even numbers: "+sum);
		}
		

}
