package com.capg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	public int traineeId;
	public String traineeName;
	public String traineeDomain;
	public String traineeLocation;
	
	
	public Trainee() {
		
	}

	public Trainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}


	public int getTraineeId() {
		return traineeId;
	}


	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public String getTraineeDomain() {
		return traineeDomain;
	}


	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}


	public String getTraineeLocation() {
		return traineeLocation;
	}


	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	
	

}
