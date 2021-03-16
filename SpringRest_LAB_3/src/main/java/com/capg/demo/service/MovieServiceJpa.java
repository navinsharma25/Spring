package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.MovieApp;
import com.capg.demo.dao.MovieDaoJpa;

@Service
public class MovieServiceJpa  implements MovieService{
	
	@Autowired
	private MovieDaoJpa eDao;

	@Override
	public List<MovieApp> printAllMovie() {
		
		return eDao.findAll();
	}


	@Override
	public List<MovieApp> createMovie(MovieApp movie) {
		eDao.saveAndFlush(movie);
		return eDao.findAll();
		
	}

	@Override
	public List<MovieApp> removeMovie(String movieName) {
		eDao.deleteById(movieName);
		return eDao.findAll();
	}

	@Override
	public List<MovieApp> updateMovie(MovieApp movie) {
		eDao.saveAndFlush(movie);
		return eDao.findAll();
	}

	@Override
	public List<MovieApp> findMovieByCategory(String movieCategory) {
		return eDao.findByMovieCategory(movieCategory);
	}

}
