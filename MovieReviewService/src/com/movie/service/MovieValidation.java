package com.movie.service;

import java.time.LocalDate;
import java.util.List;

import com.movie.core.Genre;
import com.movie.core.Movie;
import com.movie.exception.MovieException;

public class MovieValidation {

	public static Movie verifyAllRules(String movieId, String name, String genre, String reviewerName, Double rating,
			String reviewDate, String comment,List<Movie> movies) throws MovieException 
	{
		LocalDate d1=LocalDate.parse(reviewDate);
		Genre g1=Genre.valueOf(genre);

   
          checkforUnique(movieId, movies);
          checkDate(d1);
            checkIfBlank(name,reviewerName,comment);
         return new Movie(movieId,name, g1, reviewerName, rating,d1, comment);


        
		
	}
	  private static void checkforUnique(String movieId, List<Movie> movies) throws MovieException {
		  for(Movie m:movies) {
				if(m.getMovieId().equals(movieId)) {
					throw new MovieException("Already existed..");
					}
				System.out.println("can be added ");
				
				
			}
		
	}
	  //Rating must be between 1.0 and 5.0, inclusive.







   


   //In case of invalid inputs, throw an appropriate custom exception and handle it in a centralized manner in the MovieReviewService Tester.

	 //Movie name, reviewer name, and review comments must not be blank.

	private static void checkIfBlank(String name, String reviewerName, String comment) throws MovieException {
if(name=="") throw new MovieException("Name can not be blank");
if(reviewerName==" ") throw new MovieException("reviewer name can not be blank");
if(comment==" ") throw new MovieException("comment can not be blank");
		
		
	}
    //Review date must not be a future date.
	private static void checkDate(LocalDate d1) throws MovieException {
		// TODO Auto-generated method stub
		if(d1.isAfter(LocalDate.now())) {
			throw new MovieException("date  can not be in future ");
		}
		
	}
    //Review ID must be unique.
	

	
	

}