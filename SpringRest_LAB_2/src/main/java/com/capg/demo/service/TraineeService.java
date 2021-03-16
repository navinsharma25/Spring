package com.capg.demo.service;

import java.util.List;



import com.capg.demo.bean.Trainee;

public interface TraineeService {
	public List<Trainee> printAllTrainee();
	public Trainee searchTrainee(int traineeId);
	public List<Trainee> createTrainee(Trainee trainee);
	public List<Trainee> removeTrainee(int traineeId);
	public List<Trainee> updateTrainee(Trainee trainee) ;
	
	public List<Trainee> findTraineeByName(String traineeName);
}
