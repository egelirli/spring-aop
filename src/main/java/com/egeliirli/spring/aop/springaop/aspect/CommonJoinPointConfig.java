package com.egeliirli.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.egeliirli.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecuiton() {}

	@Pointcut("execution(* com.egeliirli.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecuiton() {}
	
	@Pointcut("bean(dao*)")
	public void beanStartingWithDao() {}

	@Pointcut("within(com.egeliirli.spring.aop.springaop.data..*)")
	public void dataLayerExecuitonWithin() {}
	
	@Pointcut("@annotation(com.egeliirli.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
	
}
