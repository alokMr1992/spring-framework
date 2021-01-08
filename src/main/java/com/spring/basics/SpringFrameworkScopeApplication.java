package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.scope.PersonDao;

@Configuration
@ComponentScan("com.spring.basics.scope")
public class SpringFrameworkScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkScopeApplication.class); 
	
	public static void main(String args[]) {
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkScopeApplication.class)){
			PersonDao personDao = applicationContext.getBean(PersonDao.class);
			
			PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
			
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			
			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbcConnection());
		}
	}
}