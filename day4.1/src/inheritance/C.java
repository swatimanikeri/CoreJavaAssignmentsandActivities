package inheritance;

public class C extends B{
	C() {
		super(); //- implicitly added by javac
		System.out.println("C's ctor");
	}
}
