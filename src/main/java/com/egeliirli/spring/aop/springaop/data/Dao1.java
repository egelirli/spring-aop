package com.egeliirli.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.egeliirli.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

   @TrackTime	
   public String retriveSomeData() {
	   
	   return "Dao1";
   }
	
	
}
