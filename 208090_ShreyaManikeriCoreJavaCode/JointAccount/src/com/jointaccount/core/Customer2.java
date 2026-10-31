package com.jointaccount.core;

public class Customer2 implements Runnable{

	private String name;
	
	JointAccount acc;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public Customer1(String name) {
//		super();
//		this.name = name;
//	}
	//constructor
	public Customer2(String name,JointAccount acc){
		this.name = name;
		this.acc=acc;
	}

	@Override
	public void run() {
		try {
			acc.updateBalance(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
