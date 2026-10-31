package functional_prog;

@FunctionalInterface
public interface Computable {
	/*
	 * -to compute ANY arithmetic operation(add | subtract | multiply | divide) on 2
	 * double operands
	 * 
	 */
	double compute(double d1,double d2);
//	void test();
	//List.of . Set.of,Map.of
	static void show() {
		System.out.println("interface 's static method");
	}
	//default method
	default void print(String s)
	{
		System.out.println("interface's defualt method");
		testMe(100);
	}
	//private helper method
	private boolean testMe(int no)
	{
		return true;
	}
	
}
