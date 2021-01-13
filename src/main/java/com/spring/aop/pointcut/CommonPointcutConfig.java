package com.spring.aop.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	
	@Pointcut("execution(* com.spring.aop.business.*.*(..))")
	public void businessLayerPointcut() {}

	@Pointcut("execution(* com.spring.aop.data.*.*(..))")
	public void dataLayerPointcut() {}
	
	@Pointcut("com.spring.aop.pointcut.CommonPointcutConfig.businessLayerPointcut() && com.spring.aop.pointcut.CommonPointcutConfig.dataLayerPointcut()")
	public void allLayerPointcut() {}
}