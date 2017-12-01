package com.learning.kd.reverce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeR")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBeanR {
	
	@Autowired
	private MySingletonBeanR bean;
	
	public void getMessage() {
		
		System.out.println("Hi, the time is " + bean.getDateTime());
	}
}
