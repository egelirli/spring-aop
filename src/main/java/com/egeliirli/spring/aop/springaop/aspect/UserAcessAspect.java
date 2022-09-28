package com.egeliirli.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAcessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//What kind of methods calls I would intercept
	//execution(* PACAKAGE.*.*(..))
	//Waeving & weaver
	//@Before("execution(*  com.egeliirli.spring.aop.springaop..*(..))") //Pointcut
	@Before("com.egeliirli.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecuiton()")
	public void before(JoinPoint jointPoint) {
		//Advise //Pintcut
		 logger.info(" Check for user access rights");
		 logger.info(" Allowed execution for  : {}", jointPoint);
	}
	
	  
}
