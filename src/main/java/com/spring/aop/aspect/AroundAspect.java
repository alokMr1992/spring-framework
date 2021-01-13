package com.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AroundAspect.class);
	
	@Around("execution(* com.spring.aop.business.*.*(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object proceed = joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		LOGGER.info("{} took execution time = {} ", joinPoint, timeTaken);
		return proceed;
	}
}