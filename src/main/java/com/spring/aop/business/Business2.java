package com.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.annotation.TrackTime;
import com.spring.aop.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	@TrackTime
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}