package com.spring.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.database.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll() {
		final String sql = "select * from Person";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		final String sql = "select * from Person where id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Person>(Person.class), id);
	}
	
	public List<Person> findByName(String name) {
		final String sql = "select * from Person where name = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class), name);
	}
	
	public List<Person> findByLocation(String location) {
		final String sql = "select * from Person where location = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class), location);
	}
}