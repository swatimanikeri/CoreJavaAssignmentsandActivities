package MyThread;

import java.util.stream.IntStream;

public class OddSquareTask implements Runnable {
	
	int begin=0;
		int end=0;
	
		public OddSquareTask(int b,int e){
			begin=b;
			end=e;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"thread is working..");
			System.out.println("The Sqaure of odd numbers: ");
					IntStream.rangeClosed(begin,end).filter(s->s%2!=0).mapToLong(s->s*s).forEach(s->System.out.println(s));
//			System.out.println("The Sqaure of odd numbers: "+OddSquare);
		}
		
		
}
