package com.capg.demo.dao;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.capg.demo.bean.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> empList;
	static {
		empList = new ArrayList<Employee>();
		empList.add(new Employee(101,"Navin",350000,LocalDate.parse("1992-02-01")));
		empList.add(new Employee(102,"Sunny",750000,LocalDate.parse("1995-06-11")));
		empList.add(new Employee(103,"Khom",650000,LocalDate.parse("1996-04-21")));
		empList.add(new Employee(104,"Uttam",450000,LocalDate.parse("1999-12-16")));
		
	}
	
	@Override
	public List<Employee> getAllEmployee() {	
		return empList;
	}

	@Override
	public Employee findEmployee(int empid) {
		/*for(Employee e : empList) {
			if(e.getEmpid()==empid) {
				return e;
			}
		}
		return null;
		*/
		return empList.stream().filter((e)->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Employee> createEmployee(Employee emp) {
		empList.add(emp);
		return empList;
	}
	
	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		return null;
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		int counter=0;
		for(Employee e:empList) {
			if(e.getEmpid()==emp.getEmpid()) {
				empList.set(counter, emp);
				return empList;
			}
			counter++;
		}
		return null;
	}
	
}
