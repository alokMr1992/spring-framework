package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.properties.ExternalPropertyService;

@Configuration
@ComponentScan("com.spring.basics.properties")
@PropertySource("external.properties")
public class SpringFrameworkPropertyApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkPropertyApplication.class); 
	
	public static void main(String args[]) {
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkPropertyApplication.class)){
			ExternalPropertyService propertyService = applicationContext.getBean(ExternalPropertyService.class);
			
			LOGGER.info("External System URL : {}", propertyService.getUrl());
		}
	}
}