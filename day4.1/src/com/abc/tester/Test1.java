package com.abc.tester;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

import com.abc.core.Employee;
import static com.abc.utils.EmpUtils.*;

public class Test1 {
	static {
		System.out.println("in static init block - test1");
	}

	public static void main(String[] args) {
		out.println("in main");
		Scanner sc=new Scanner(in);
		out.println("Enter organization size");
		Employee[] emps=new Employee[sc.nextInt()];
		for (int i=0;i<emps.length;i++)
		{
			out.println("Enter emp details - firstName,  lastName,  salary,  deptId");
			emps[i]=new Employee(sc.next(), sc.next(),sc.nextDouble(),sc.nextInt());
			out.println("Emp added");
		}
		
		//print sum of salaries
		System.out.println("Sum- "+computeSumOfSalary(emps));
		
		/*
		 * Increment emp salary by dept id
		 */
		out.println("Enter dept id & increment");
		incrementSalaryByDeptId(sc.nextInt(),sc.nextDouble(),emps);
		//print sum of salaries again - so instead of copy pasting code , re factor it in another static method in EmpUtils class & simply invoke
		System.out.println("Sum after increment "+computeSumOfSalary(emps));
		sc.close();
		

	}

}
