package com.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.xml.XmlPersonDao;

public class SpringFrameworkXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkXmlContextApplication.class); 

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XmlPersonDao xmlPersonDao = applicationContext.getBean(XmlPersonDao.class);
			
			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}", xmlPersonDao.getXmlJdbcConnection());
		}
	}
}