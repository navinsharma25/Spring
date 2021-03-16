package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Trainee;
import com.capg.demo.dao.TraineeDaoJpa;

@Service
public class TraineeServiceJpa implements TraineeService {
	
	
	
	@Autowired
	private TraineeDaoJpa eDao;

	@Override
	public List<Trainee> printAllTrainee() {
		
		return eDao.findAll();
	}

	@Override
	public Trainee searchTrainee(int traineeId) {
		if(eDao.findById(traineeId).isPresent()) {
			return eDao.findById(traineeId).get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Trainee> createTrainee(Trainee trainee) {
		eDao.saveAndFlush(trainee);
		return eDao.findAll();
	}

	@Override
	public List<Trainee> removeTrainee(int traineeId) {
		eDao.deleteById(traineeId);
		return eDao.findAll();
	}

	@Override
	public List<Trainee> updateTrainee(Trainee trainee) {
		eDao.saveAndFlush(trainee);
		return eDao.findAll();
	}

	@Override
	public List<Trainee> findTraineeByName(String traineeName) {
		return eDao.findByTraineeName(traineeName);
	}
	

}
