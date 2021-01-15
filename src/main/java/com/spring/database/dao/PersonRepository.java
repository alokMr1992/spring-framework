package com.spring.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.database.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}