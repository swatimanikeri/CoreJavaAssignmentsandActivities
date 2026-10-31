package runnable_tasks;

import java.util.stream.IntStream;

public class EvenNumberTask implements Runnable{
	//state 
	private int begin;
	private int end;	

	public EvenNumberTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor called by "+Thread.currentThread().getName());//main 
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		//B.L
		IntStream.rangeClosed(begin, end) //IntStream begin -end
		.filter(i -> i % 2 ==0)//IntStream begin -end : filtered
		.forEach(i -> System.out.println(Thread.currentThread().getName()+" even no "+i));
		System.out.println(Thread.currentThread().getName()+"over");
		
	}

}
