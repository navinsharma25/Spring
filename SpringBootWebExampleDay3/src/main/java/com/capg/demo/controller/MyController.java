package com.capg.demo.controller;

import java.util.List;


import com.capg.demo.bean.Employee;
import com.capg.demo.service.EmployeeService;
import com.capg.demo.service.EmployeeServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MyController {
	@Autowired
	EmployeeService jpaService;
	@GetMapping
	public List<Employee> printEmployee() {
		return jpaService.printAllEmployee();
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity<Employee> findEmployee(@PathVariable int empid) {
		Employee e= jpaService.searchEmployee(empid);
		if(e!=null) {
			return new ResponseEntity<Employee>(e,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	
	//@PostMapping(value = "/create", consumes=MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public List<Employee> createEmployee(@RequestBody Employee emp){
		return jpaService.createEmployee(emp);
	}
	
	@DeleteMapping("/{empid}")
	public List<Employee> deleteEmployee(@PathVariable int empid){
		return jpaService.removeEmployee(empid);
	}
	@PutMapping
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		return jpaService.updateEmployee(emp);
	}
	
	
	
	@GetMapping("name/{name}")
	public List<Employee> findEmployeeByName(@PathVariable String name){
		return jpaService.findEmployeeByName(name);
	}
	
	
	/*
	@GetMapping("salary/{sal}")
	public List<Employee> findEmployeeByName(@PathVariable double sal){
		return jpaService.findBySalary(sal);
	}
	
	
	*/
	
}
