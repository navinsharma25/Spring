package com.capg.demo.dao;

import java.util.List;


import com.capg.demo.bean.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee findEmployee(int empid);
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> deleteEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp); 
}
