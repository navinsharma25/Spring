package com.capg.demo.service;

import java.util.List;

import com.capg.demo.bean.MovieApp;


public interface MovieService {
	
	public List<MovieApp> printAllMovie();
	public List<MovieApp> createMovie(MovieApp movie);
	public List<MovieApp> removeMovie(String movieName);
	public List<MovieApp> updateMovie(MovieApp movie) ;
	
	public List<MovieApp> findMovieByCategory(String movieCategory);

}
