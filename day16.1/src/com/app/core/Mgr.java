package com.app.core;

public  class Mgr extends Emp {
	
	public Mgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		System.out.println("in mgr's salary");
		return getBasic()+ 1000;
	}
}
