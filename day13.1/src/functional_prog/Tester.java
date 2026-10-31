package functional_prog;

public class Tester {

	public static void main(String[] args) {
		//add 2 doubles n print the result
		Adder adder=new Adder();
		System.out.println(adder.compute(10, 20));
		//subtract 2 numbers - w/o creating a separate class
		Computable subtractor=new Computable() {
			
			@Override
			public double compute(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1-d2;
			}
		};
		System.out.println(subtractor.compute(23, 45));
		//lamda expression
		Computable multipler=( a, b) ->  a*b;
		System.out.println(multipler.compute(13, 12));

	}

}
