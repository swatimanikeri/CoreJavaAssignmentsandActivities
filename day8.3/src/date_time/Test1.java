/*
 * Accept product manufacture date from user
Accept no of days - in which product expires
Print product expiry date.

 */
package date_time;

import java.time.LocalDate;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			System.out.println("Enter product manufacture date (yr-mon-day) & no of days in which product expires");
			 LocalDate manuDate=LocalDate.parse(sc.next());//string -> LocalDate
			 LocalDate expDate = manuDate.plusDays(sc.nextLong());
			 System.out.println(manuDate);
			 System.out.println(expDate);
		
		}//sc.close()

	}

}
