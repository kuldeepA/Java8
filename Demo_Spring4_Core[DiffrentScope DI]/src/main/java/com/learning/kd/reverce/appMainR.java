package com.learning.kd.reverce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.kd.Config;

public class appMainR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MyPrototypeBeanR bean = context.getBean(MyPrototypeBeanR.class);
		bean.getMessage();
		Thread.sleep(5000);
		
		bean = context.getBean(MyPrototypeBeanR.class);	
		bean.getMessage();
	}
}
