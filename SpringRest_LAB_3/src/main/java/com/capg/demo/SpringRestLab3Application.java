package com.capg.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capg")
public class SpringRestLab3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestLab3Application.class, args);
	}

}
