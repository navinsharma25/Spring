package com.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieApp {
	@Id
	private String movieName;
	private String movieCategory;
	private int movieRating;
	
	
	public MovieApp() {
		
	}

	public MovieApp(String movieName, String movieCategory, int movieRating) {
		super();
		this.movieName = movieName;
		this.movieCategory = movieCategory;
		this.movieRating = movieRating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	
}
