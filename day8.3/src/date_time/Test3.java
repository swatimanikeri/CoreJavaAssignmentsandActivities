package date_time;
import java.time.LocalDate;
import java.util.*;
public class Test3 {
public static void main(String [] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Add date ");
		LocalDate d1=LocalDate.parse(sc.next());
		System.out.println(d1);
		LocalDate d2=d1.plusDays(24);
		System.out.println(d2);
	}
}
}
