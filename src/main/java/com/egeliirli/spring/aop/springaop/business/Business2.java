package com.egeliirli.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egeliirli.spring.aop.springaop.data.Dao2;

@Service
public class Business2 {

	    @Autowired
	    Dao2 dao;
	    
	    public String calculateSomething() {
	    	return dao.retriveSomeData();
	    }
	
}
