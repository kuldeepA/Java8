package com.learning.kd.reverce;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBeanR {
	private String dateTimeString = LocalDateTime.now().toString();

    public String getDateTime() {
        return dateTimeString;
    }
}
