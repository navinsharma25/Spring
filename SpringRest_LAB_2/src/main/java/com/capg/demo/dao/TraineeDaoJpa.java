package com.capg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.bean.Trainee;


@Repository
public interface TraineeDaoJpa extends JpaRepository<Trainee, Integer> {
	
	public List<Trainee> findByTraineeName(String traineeName);
	

}
