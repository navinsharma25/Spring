package com.capg.demo.dao;

import com.capg.demo.bean.Employee;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee,Integer> {
	
	
	
	public List<Employee> findByName(String traineeName);
	
	/*
	public List<Employee> findBySalary(double salary);
	
	*/

}
