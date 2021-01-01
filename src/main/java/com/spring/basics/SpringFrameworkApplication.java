package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		System.out.println("Spring Start....");
		SpringApplication.run(SpringFrameworkApplication.class, args);
		System.out.println("Spring End....");
	}

}
