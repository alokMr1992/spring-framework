package com.spring.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.database.dao.PersonJdbcDao;
import com.spring.database.entity.Person;

//@SpringBootApplication
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
		LOGGER.info("\nDelete Person by Id 10002, rows deleted -> {}", personJdbcDao.deleteById(10002));
		LOGGER.info("\nAll Person after deletion are -> {}", personJdbcDao.findAll());
		LOGGER.info("\nInsert New Person, inserted rows -> {}", personJdbcDao.insertRecord(new Person(10007, "Jimmy", "Atlanta", new Date())));
		LOGGER.info("\nAll Person after insertion are -> {}", personJdbcDao.findAll());
	}
}