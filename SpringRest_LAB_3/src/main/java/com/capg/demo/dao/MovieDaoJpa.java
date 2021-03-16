package com.capg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.bean.MovieApp;


@Repository
public interface MovieDaoJpa extends JpaRepository<MovieApp, String> {
	
	public List<MovieApp> findByMovieCategory(String movieCategory);
	
}