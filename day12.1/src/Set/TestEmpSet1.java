package sets;

import java.util.HashSet;

import com.app.core.Employee;

public class TestEmpSet1 {

	public static void main(String[] args) {
		/*
		 * Add emps in a HashSet & confirm
		 * - no dups
		 * - constant time performance O(1) for add | remove | contains
		 */
		Employee e1=new Employee("rnd-001", "Shekhar Patil", 10, 10000);
		Employee e2=new Employee("rnd-001", "Riya Patil", 20, 20000);
		Employee e3=new Employee("rnd-001", "Shekhar Patil", 10, 10000);
		Employee e4=new Employee("rnd-002", "Mitali Shah", 20, 25000);

		HashSet<Employee> emps=new HashSet<>();
		System.out.println(emps.add(e1));
		System.out.println(emps.add(e2));
		System.out.println(emps.add(e3));
		System.out.println(emps.add(e4));
		System.out.println(emps.size());
		for(Employee e : emps)
			System.out.println(e);
		

	}

}
