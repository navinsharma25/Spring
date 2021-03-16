package com.capg.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.demo.bean.Trainee;

import com.capg.demo.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	@Autowired
	TraineeService jpaService;
	@GetMapping
	public List<Trainee> printEmployee() {
		return jpaService.printAllTrainee();
	}
	
	

	@GetMapping("/{traineeId}")
	public ResponseEntity<Trainee> findEmployee(@PathVariable int traineeId) {
		Trainee e= jpaService.searchTrainee(traineeId);
		if(e!=null) {
			return new ResponseEntity<Trainee>(e,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}
	
	
	@PostMapping
	public List<Trainee> creatTrainee(@RequestBody Trainee trainee){
		return jpaService.createTrainee(trainee);
	}
	
	@DeleteMapping("/{traineeId}")
	public List<Trainee> deleteTrainee(@PathVariable int traineeId){
		return jpaService.removeTrainee(traineeId);
	}
	@PutMapping
	public List<Trainee> updateTrainee(@RequestBody Trainee trainee){
		return jpaService.updateTrainee(trainee);
	}
	
	@GetMapping("traineeName/{traineeName}")
	public List<Trainee> findTraineeByName(@PathVariable String traineeName){
		return jpaService.findTraineeByName(traineeName);
	}

}
