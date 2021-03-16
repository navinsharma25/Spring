package com.capg.demo.bean;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private double salary;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate date;
	public Employee() {
		
	}
	public Employee(int empid, String name, double salary, LocalDate date) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
}
