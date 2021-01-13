package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessBeforeAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserAccessBeforeAspect.class);
	
	@Before("com.spring.aop.pointcut.CommonPointcutConfig.dataLayerPointcut()")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Check access for User");
		LOGGER.info("Allowed execution for -- {} ", joinPoint);
	}
}