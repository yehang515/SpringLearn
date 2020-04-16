package com.enjoy.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.cap1.config.MainConfig;

public class MainTest2 {
	
	public static void main(String args[]) {
		ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person) app.getBean("person");
		System.out.println(person);
		
	}

}
