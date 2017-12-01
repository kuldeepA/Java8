package com.learning.kd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MySingletonBean bean = context.getBean(MySingletonBean.class);
		bean.showMessage();
		
		Thread.sleep(7000);
		bean = context.getBean(MySingletonBean.class);
		bean.showMessage();
		context.close();
	}

}
