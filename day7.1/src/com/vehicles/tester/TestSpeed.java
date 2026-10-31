package com.vehicles.tester;

import java.util.Scanner;
import static com.vehicles.service.VehicleValidations.validateSpeed;

public class TestSpeed {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try in main");
			
		} //sc.close()
		catch (Exception e) {
			e.printStackTrace();
	//		System.out.println(e.getMessage());
		}
		System.out.println("main over");

	}

}
