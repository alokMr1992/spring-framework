package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.component.ComponentDao;

@Configuration
@ComponentScan("com.spring.component")
public class SpringFrameworkComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkComponentScanApplication.class);

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkComponentScanApplication.class)){
			ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
			ComponentDao componentDao2 = applicationContext.getBean(ComponentDao.class);
			
			LOGGER.info("{}", componentDao);
			LOGGER.info("{}", componentDao.getComponentJdbcConnection());
			
			LOGGER.info("{}", componentDao2);
			LOGGER.info("{}", componentDao2.getComponentJdbcConnection());
		}
	}
}