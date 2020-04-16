package com.enjoy.cap1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enjoy.cap1.Person;

@Configuration
public class MainConfig {
	
	@Bean
	public Person person() {
		return new Person("kyle",11);
	}

}
