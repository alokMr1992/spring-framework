package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.business.Business1;
import com.spring.aop.business.Business2;

@SpringBootApplication
public class SpringFrameworkAopApplication implements CommandLineRunner{

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkAopApplication.class);
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("{}", business1.calculateSomething());
		LOGGER.info("{}", business2.calculateSomething());
	}
}