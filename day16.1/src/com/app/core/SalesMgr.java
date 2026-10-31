package com.app.core;

public class SalesMgr extends Mgr {

	public SalesMgr(double basic) {
		super(basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeSalary() {
		System.out.println("in sal of salesmgr");
		return getBasic()+ 2000;
	}

}
