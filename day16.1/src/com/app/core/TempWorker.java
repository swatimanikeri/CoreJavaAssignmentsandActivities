package com.app.core;

public class TempWorker extends Worker {

	public TempWorker(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		System.out.println("in compute sal of temp worker");
		return getBasic()+ 600;
	}

}
