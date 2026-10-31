package com.movie.core;

import java.time.LocalDate;

public class Movie {

String movieId;
String name;
Genre genre;
String reviewerName;
double rating;
LocalDate reviewDate;
String comments;
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", name=" + name + ", genre=" + genre + ", reviewerName=" + reviewerName
			+ ", rating=" + rating + ", reviewDate=" + reviewDate + ", comments=" + comments + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public Movie(String i, String name, Genre genre, String reviewerName, double rating, LocalDate reviewDate,
		String comments) {
	super();
	this.movieId = i;
	this.name = name;
	this.genre = genre;
	this.reviewerName = reviewerName;
	this.rating = rating;
	this.reviewDate = reviewDate;
	this.comments = comments;
}
public String getMovieId() {
	return movieId;
}
public void setMovieId(String movieId) {
	this.movieId = movieId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Genre getGenre() {
	return genre;
}
public void setGenre(Genre genre) {
	this.genre = genre;
}
public String getReviewerName() {
	return reviewerName;
}
public void setReviewerName(String reviewerName) {
	this.reviewerName = reviewerName;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public LocalDate getReviewDate() {
	return reviewDate;
}
public void setReviewDate(LocalDate reviewDate) {
	this.reviewDate = reviewDate;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}

}
