package com.movie.tester;
import java.time.LocalDate;
import java.util.*;

import com.movie.core.Genre;
import com.movie.exception.MovieException;
import com.movie.service.MovieServiceImpl;
public class MainMovie {
	private static String readLineAfterDouble(Scanner sc) {
	    sc.nextLine(); // consume leftover newline
	    return sc.nextLine(); // read reviewDate
	}
public static void main(String [] args) throws MovieException {
	
	try(Scanner sc=new Scanner(System.in);){
		MovieServiceImpl service=new MovieServiceImpl();
		boolean flag=false;
		while(!flag) {
			try {
			System.out.println("1.Add Record ");
			System.out.println("Enter your choice: ");
			
			switch (sc.nextInt()) {

			case 1:
			    sc.nextLine(); // consume newline after menu choice

			    String s = service.addReview(
			        sc.nextLine(),      // movieId (String)
			        sc.nextLine(),      // name
			        sc.nextLine(),      // genre
			        sc.nextLine(),      // reviewerName
			        sc.nextDouble(),    // rating
			        readLineAfterDouble(sc), // reviewDate
			        sc.nextLine()       // comment
			    );

			    System.out.println(s);
			    break;

			case 0:
			    flag = true;
			    break;
			
			case 2:
				service.showAllDetails();
				break;
			case 3:
				System.out.println("Enter movie name: ");
				String specific=sc.next();
				service.showDetailsBySpecificMovieName(specific);
				break;
			case 4:
				System.out.println("Enter the review id: ");
				String s1=sc.next();
				System.out.println("Enter the new rating you want: ");
				double d2=sc.nextDouble();
				service.updateDetails(s1,d2);
				break;
				}}
			catch (MovieException e) {
			    // Custom validation errors don't corrupt the scanner buffer, so just print it directly
			    System.out.println("Validation Error: " + e.getMessage());
			    System.out.println("Please retry - \n");
			} 
			catch (Exception e) {
				sc.nextLine();// read all of the pending tokens from Scanner's buffer till new line
				System.out.println(e);
				System.out.println("Please retry - ");
			}
			
			}
		}
		
	}
}

//1 sw comedy swati 1.2 2026-09-09  kkk
//int movieId;
//String name;
//Genre genre;
//String reviewerName;
//double rating;
//LocalDate reviewDate;
//String comments;


//case 1:
//    String s = service.addReview(
//        sc.next(),        // movieId (String)
//        sc.next(),        // name
//        sc.next(),        // genre
//        sc.next(),        // reviewerName
//        sc.nextDouble(),  // rating
//        sc.next(),        // reviewDate
//        sc.next()         // comment
//    );
//
//    System.out.println(s);
//    break;