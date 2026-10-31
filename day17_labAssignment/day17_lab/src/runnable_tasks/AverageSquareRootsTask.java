package runnable_tasks;

import java.util.stream.IntStream;

public class AverageSquareRootsTask implements Runnable {
	// state
	private int begin;
	private int end;

	public AverageSquareRootsTask(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
		System.out.println("ctor called by " + Thread.currentThread().getName());// main
	}
//Print average of sqrts of all nos in the range

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		// B.L
		double avg = IntStream.rangeClosed(begin, end) // IntStream begin -end
				.mapToDouble(i -> Math.sqrt(i)) // DoubleStream
				.average().orElse(0);

		System.out.println(Thread.currentThread().getName() + " printing the avg " + avg);
		System.out.println(Thread.currentThread().getName() + "over");

	}

}
