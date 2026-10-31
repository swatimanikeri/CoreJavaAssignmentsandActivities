package com.movie.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.movie.core.Genre;
import com.movie.core.Movie;
import com.movie.core.MovieInterface;
import com.movie.exception.MovieException;

public class MovieServiceImpl implements MovieInterface {
List<Movie> movies;

//int movieId;
//String name;
//Genre genre;
//String reviewerName;
//double rating;
//String reviewDate;
//String comments;
public MovieServiceImpl() {
    this.movies = new ArrayList<>(1024);

    movies.add(new Movie(
       "1001", "Happy Bhag Jayegi",
        Genre.COMEDY,
        "swatiM", 5.7,
        LocalDate.of(2026, 2, 13),
        "good"
    ));

    movies.add(new Movie(
        "1002", "Mumbai Pune Mumbai",
        Genre.ROMANCE,
        "swatiM", 8.0,
        LocalDate.of(2026, 2, 14),
        "Nice romantic movie"
    ));

    movies.add(new Movie(
        "1003", "Piku",
        Genre.DRAMA,
        "swatiM", 8.0,
        LocalDate.of(2026, 2, 15),
        "Beautiful story"
    ));
}

//Review ID must be unique.
//
//
//
//Rating must be between 1.0 and 5.0, inclusive.
//
//
//
//Review date must not be a future date.
//
//
//
//Movie name, reviewer name, and review comments must not be blank.
//
//
//
//In case of invalid inputs, throw an appropriate custom exception and handle it in a centralized manner in the MovieReviewService Tester.
public String  addReview(String movieId, String name, String genre, String reviewerName, Double rating,
		String reviewDate, String comment) throws MovieException {
	Movie m=MovieValidation.verifyAllRules( movieId,name,genre,reviewerName,rating,reviewDate,comment,movies);
	movies.add(m);
	return "The riview is added";
	
}
//
//@Override
//public String addReview(int movieId, String name, Genre genre, double rating, String reviewDate, String comments) {
//	Movie m=MovieValidation.verifyAllRules( movieId,name,genre,reviewerName,rating,reviewDate,comment,movies);
//	movies.add(m);
//	return "The riview is added";
//	return null;
//}

public void showAllDetails() {
	// TODO Auto-generated method stub
	
	movies.stream().forEach(s->System.out.println(s));
}

public void showDetailsBySpecificMovieName(String sw) {
	movies.stream().filter(s->s.getName().equalsIgnoreCase(sw)).forEach(s->System.out.println(s));
}
//Rating must be between 1.0 and 5.0, inclusive.
   public void checkRange(double rating) throws MovieException{
	  if(rating>=1 && rating<=5) {
		  System.out.println("Hello");
	  }
	  else {
		  throw new MovieException("Invalid range: Rating must be between 1.0 and 5.0, inclusive. ");
	  }
   }
//6\. Update the rating using an invalid review ID
//   public void updateDetails(String rid,double rating) {
//		movies.stream().filter(ui->ui.getMovieId().equals(rid)).forEach(r->r.setRating(rating));
//	} 
   
   public void updateDetails(String rid,double rating) throws MovieException {
		Movie m=movies.stream().filter(ui->ui.getMovieId().equals(rid)).findFirst().orElseThrow(()->new MovieException("invalid movie review id"));
		m.setRating(rating);
	} 
   
   
//   public void updateDetails(String rid, double rating) throws MovieException {
//	    checkRange(rating); // Validate rating first
//
//	    Movie targetMovie = movies.stream()
//	            .filter(ui -> ui.getMovieId().equalsIgnoreCase(rid))
//	            .findFirst()
//	            .orElseThrow(() -> new MovieException("Update Error: Movie Review ID '" + rid + "' not found."));
//
//	    targetMovie.setRating(rating);
//	}







}


