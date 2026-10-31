package runnable_tasks;

import java.util.stream.IntStream;

public class OddNumberSquareTask implements Runnable{
	//state 
	private int begin;
	private int end;	

	public OddNumberSquareTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor called by "+Thread.currentThread().getName());//main 
	}
//Print sum of squares of all odd nos in the range

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		//B.L
		int sum = IntStream.rangeClosed(begin, end) //IntStream begin -end
		.filter(i -> i % 2 != 0) //odd numbers 
		.map(i -> i*i) //squares
		.sum();
		System.out.println(Thread.currentThread().getName() +" printing the sum "+sum);
		System.out.println(Thread.currentThread().getName()+"over");
		
	}

}
