package com.abc.utils;

import com.abc.core.Employee;

public class EmpUtils {
	/*
	 * Add static method 
	 * - to increment salry of all emps from specific dept id
	 */
	  public static void incrementSalaryByDeptId(int deptId,double incr,Employee[] myEmps)
	  {
		  for (Employee e : myEmps)
		  {
			  if (e.getDeptId() == deptId)
			  {
				  e.incrementSalary(incr);
			  }
		  }
		  System.out.println("emp sal updated....");
	  }
	  /*
	   * Add public static method to compute sum of emp salaries
	   */
	  public static double computeSumOfSalary(Employee[] emps2) {
		  double sum=0.0;
			for (Employee e : emps2)
			{
				sum += e.getSalary();
			}
			return sum;
	  }

}
