package MyThread;

import java.util.stream.IntStream;

public class AvgOfSqrt implements Runnable {
	
	int begin=0;
		int end=0;
	
		public AvgOfSqrt(int b,int e){
			begin=b;
			end=e;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"thread is working..");
			double avg=IntStream.rangeClosed(begin,end).mapToDouble(s->Math.sqrt(s)).average().getAsDouble();
			System.out.println("The Average of squareroot of numbers: "+avg);
		}
		
		
}
