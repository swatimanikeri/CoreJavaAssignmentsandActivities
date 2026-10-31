package com.app.core;

public class Worker extends Emp {

	public Worker(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		System.out.println("in worker's sal");
		return getBasic() + 500;
	}
}
