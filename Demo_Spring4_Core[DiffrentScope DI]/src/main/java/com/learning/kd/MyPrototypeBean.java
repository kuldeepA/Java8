package com.learning.kd;

import java.time.LocalDateTime;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {
	//
	private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}
