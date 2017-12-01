package com.learning.kd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  //in beans.xml. 1- xml injection(constructor) 2- Annotation(@Autowired)
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
