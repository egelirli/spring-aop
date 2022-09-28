package com.egeliirli.spring.aop.springaop.aop;

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
public class AfterAOPAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of methods calls I would intercept
	//execution(* PACAKAGE.*.*(..))
	//Waeving & weaver
	
	@AfterReturning(
			value= "execution(*  com.egeliirli.spring.aop.springaop.business.*.*(..))",
			returning = "result"
         ) //Pointcut
	public void after(JoinPoint jointPoint, Object result) {
		//Advise 
		 logger.info("  Method {} Returned: {}", jointPoint, result);
	}
	
	@AfterThrowing(
			value= "execution(*  com.egeliirli.spring.aop.springaop.business.*.*(..))",
			throwing = "exception"
         ) //Pointcut
	public void afterException(JoinPoint jointPoint, Object exception) {
		//Advise 
		 logger.info("  Method {}  Throwed Exception: {}", jointPoint, exception);
	}

	@After("execution(*  com.egeliirli.spring.aop.springaop.business.*.*(..))") //Pointcut
	public void after(JoinPoint jointPoint) {
		//Advise 
		 logger.info(" After Method {}  ", jointPoint);
	}
	
	
}
