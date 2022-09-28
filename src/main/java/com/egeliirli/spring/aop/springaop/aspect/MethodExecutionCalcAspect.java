package com.egeliirli.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalcAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of methods calls I would intercept
	//execution(* PACAKAGE.*.*(..))
	//Waeving & weaver
	
	//@Around("execution(*  com.egeliirli.spring.aop.springaop.business.*.*(..))")
	//@Around("com.egeliirli.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecuiton()")
	@Around("com.egeliirli.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		//Advise 
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken =  System.currentTimeMillis() - startTime; 
		 logger.info("  Method {} Took : {} msec", joinPoint, timeTaken);
	}
}
