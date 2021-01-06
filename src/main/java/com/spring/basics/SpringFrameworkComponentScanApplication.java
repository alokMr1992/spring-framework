package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.component.ComponentDao;

@SpringBootApplication
@ComponentScan("com.spring.component")
public class SpringFrameworkComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkComponentScanApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkComponentScanApplication.class, args);
		
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		ComponentDao componentDao2 = applicationContext.getBean(ComponentDao.class);
		
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getComponentJdbcConnection());
		
		LOGGER.info("{}", componentDao2);
		LOGGER.info("{}", componentDao2.getComponentJdbcConnection());
	}
}