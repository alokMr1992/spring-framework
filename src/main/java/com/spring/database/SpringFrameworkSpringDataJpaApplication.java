package com.spring.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.dao.PersonRepository;
import com.spring.database.entity.Person;

@SpringBootApplication
public class SpringFrameworkSpringDataJpaApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkSpringDataJpaApplication.class);
	
	@Autowired
	private PersonRepository personRepository;
	
	public static void main(String[] args) {	
		SpringApplication.run(SpringFrameworkSpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("\nAll Person are -> {}", personRepository.findAll());
		LOGGER.info("\nPerson by Id 10001 -> {}", personRepository.findById(10001));
		personRepository.deleteById(10002);
		LOGGER.info("\nAll Person after deletion are -> {}", personRepository.findAll());
		LOGGER.info("\nInsert New Person, inserted row -> {}", personRepository.save(new Person("Bala", "Cape Town", new Date())));
		LOGGER.info("\nAll Person after insertion are -> {}", personRepository.findAll());
		LOGGER.info("\nUpdate Person with id 10003, updated row -> {}", personRepository.save(new Person(10003, "Radha", "Delhi", new Date())));
		LOGGER.info("\nAll Person after updation are -> {}", personRepository.findAll());
	}
}