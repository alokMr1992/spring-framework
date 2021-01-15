package com.spring.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.dao.PersonJpaRepository;
import com.spring.database.entity.Person;

//@SpringBootApplication
public class SpringFrameworkJpaApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkJpaApplication.class);
	
	@Autowired
	private PersonJpaRepository personJpaRepository;
	
	public static void main(String[] args) {	
		SpringApplication.run(SpringFrameworkJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("\nAll Person are -> {}", personJpaRepository.findAll());
		LOGGER.info("\nPerson by Id 10001 -> {}", personJpaRepository.findById(10001));
		personJpaRepository.deleteById(10002);
		LOGGER.info("\nAll Person after deletion are -> {}", personJpaRepository.findAll());
		LOGGER.info("\nInsert New Person, inserted row -> {}", personJpaRepository.insertOrUpdate(new Person("Bala", "Cape Town", new Date())));
		LOGGER.info("\nAll Person after insertion are -> {}", personJpaRepository.findAll());
		LOGGER.info("\nUpdate Person with id 10003, updated row -> {}", personJpaRepository.insertOrUpdate(new Person(10003, "Radha", "Delhi", new Date())));
		LOGGER.info("\nAll Person after updation are -> {}", personJpaRepository.findAll());
	}
}