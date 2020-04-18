package com.enjoy.cap5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import com.enjoy.cap1.Person;

public class Cap5MainConfig {
	
	@Bean("lison")
	@Conditional(WinCondition.class)
	public Person lison() {
		System.out.println("给容器中添加Lison ....");
		return new Person("Lison", 58);
	}

}
