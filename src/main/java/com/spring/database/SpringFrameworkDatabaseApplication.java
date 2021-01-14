package com.spring.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.dao.PersonJdbcDao;

@SpringBootApplication
public class SpringFrameworkDatabaseApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkDatabaseApplication.class);
	
	@Autowired
	private PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {	
		SpringApplication.run(SpringFrameworkDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("\nAll Person are -> {}", personJdbcDao.findAll());
		LOGGER.info("\nPerson by Id 10001 -> {}", personJdbcDao.findById(10001));
		LOGGER.info("\nPerson by name Alok -> {}", personJdbcDao.findByName("Alok"));
		LOGGER.info("\nPerson by location Mumbai -> {}", personJdbcDao.findByLocation("Mumbai"));
		LOGGER.info("\nPerson by name and location (Alok, Pune) -> {}", personJdbcDao.findByNameAndLocation("Alok", "Pune"));
	}
}