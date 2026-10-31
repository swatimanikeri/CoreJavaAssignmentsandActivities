package exception_handling;

import java.util.Scanner;

public class TestAutoCloseable {

	public static void main(String[] args) {
		
		try (
				// open auto closeable objects
				Scanner sc = new Scanner(System.in);
	//			FileReader fin=new FileReader("some file");	

		) {
			System.out.println("Enter an integer");
			System.out.println("int value " + sc.nextInt());
			System.out.println("end of try");
		} // JVM implicitly calls - sc.close() - end of try-with-resources
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
