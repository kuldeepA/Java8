package com.learning.kd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {

	@Autowired
	private ApplicationContext applicationContext;

	public void showMessage() {
		MyPrototypeBean bean = (MyPrototypeBean) applicationContext.getBean("prototype"/*MyPrototypeBean.class*/);
		System.out.println("Hi, the time is " + bean.getDateTime());
	}
}
