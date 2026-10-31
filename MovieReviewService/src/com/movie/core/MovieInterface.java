package com.movie.core;

import java.time.LocalDate;

import com.movie.exception.MovieException;

public interface MovieInterface {
//String addReview(int movieId,String name,Genre genre,double rating,String reviewDate,String comments);

String addReview(String movieId, String name, String genre, String reviewerName, Double rating, String reviewDate,
		String comment) throws MovieException;
}



//int movieId;
//String name;
//Genre genre;ss
//String reviewerName;
//double rating;
//LocalDate reviewDate;
//String comments;