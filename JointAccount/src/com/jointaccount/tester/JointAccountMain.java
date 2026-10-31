package com.jointaccount.tester;

import java.util.Scanner;

import com.jointaccount.core.Customer1;
import com.jointaccount.core.Customer2;
import com.jointaccount.core.JointAccount;

public class JointAccountMain {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			
			boolean exit=false;
	
			JointAccount acc=new JointAccount(10000);
			
			Customer1 c1=new Customer1("shreya",acc);
			
			Customer2 c2=new Customer2("swati",acc);
			
			Thread t1=new Thread(c1);
			Thread t2=new Thread(c2);

			
			t1.start();
		
			t2.start();
//			try {
//			while(!exit) {
//				System.out.println("1.Update Balance\n2.Add balance\n3.deposite money");
//				int choice=sc.nextInt();
//				switch(choice) {
//				case 1:System.out.println("hello");
//				
//						break;
//				}//switch
//			}//while
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}//catch
//			
			
		}	//try with resourse
	}//main
}//class
