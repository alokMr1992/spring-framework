package com.spring.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.database.custom.mapper.PersonRowMapper;
import com.spring.database.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Using Custom RowMapper for Person entity
	 * @return
	 */
	public List<Person> findAll() {
		final String sql = "select * from Person";
		return jdbcTemplate.query(sql, new PersonRowMapper());
	}
	
	/**
	 * queryForObject() method is used only to fetch unique single row,
	 * It is basically used to query with Primary Key or Unique Id. 
	 * 
	 * @param id
	 * @return single Object corresponding to the row data
	 */
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
	
	public List<Person> findByNameAndLocation(String name, String location) {
		final String sql = "select * from Person where name = ? and location = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Person>(Person.class), name, location);
	}
	
	public int deleteById(int id) {
		final String sql = "delete from Person where id = ?";
		return jdbcTemplate.update(sql, id);
	}
	
	
}