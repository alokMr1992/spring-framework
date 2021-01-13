package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AfterAspect.class);
	
	@AfterReturning(value = "execution(* com.spring.aop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		LOGGER.info("{} returned the result = {} ", joinPoint, result);
	}
	
	@AfterThrowing(value = "execution(* com.spring.aop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		LOGGER.info("{} thrown the exception = {} ", joinPoint, exception);
	}
	
	@After(value = "execution(* com.spring.aop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		LOGGER.info("{} called after the interception ", joinPoint);
	}
}