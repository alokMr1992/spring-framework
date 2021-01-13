package com.spring.aop.data;

import org.springframework.stereotype.Repository;

import com.spring.aop.annotation.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}