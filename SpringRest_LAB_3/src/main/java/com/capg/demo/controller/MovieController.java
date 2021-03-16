package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.bean.MovieApp;

import com.capg.demo.service.MovieService;


@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService jpaService;
	@GetMapping
	public List<MovieApp> printEmployee() {
		return jpaService.printAllMovie();
	}
	
	@PostMapping
	public List<MovieApp> creatMovie(@RequestBody MovieApp movie){
		return jpaService.createMovie(movie);
	}
	
	@DeleteMapping("/{movieName}")
	public List<MovieApp> deleteMovie(@PathVariable String movieName){
		return jpaService.removeMovie(movieName);
	}
	@PutMapping
	public List<MovieApp> updateMovie(@RequestBody MovieApp movie){
		return jpaService.updateMovie(movie);
	}
	
	@GetMapping("movieCategory/{movieCategory}")
	public List<MovieApp> findMovieByCategory(@PathVariable String movieCategory){
		return jpaService.findMovieByCategory(movieCategory);
	}

}
