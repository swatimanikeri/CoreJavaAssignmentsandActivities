package com.jointaccount.core;

public class Customer1 implements Runnable{

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
	public Customer1(String name,JointAccount acc){
		this.name = name;
		this.acc=acc;
	}

	@Override
	public void run() {
		try {
			System.out.println(acc.checkBalance());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
