package com.capg.demo.service;

import java.util.List;



import com.capg.demo.bean.Employee;

public interface EmployeeService {

	public List<Employee> printAllEmployee();
	public Employee searchEmployee(int empid);
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> removeEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp) ;
	
	
	
	public List<Employee> findEmployeeByName(String name);
	
	/*
	public List<Employee> findBySalary(double salary);
	
	*/
}
