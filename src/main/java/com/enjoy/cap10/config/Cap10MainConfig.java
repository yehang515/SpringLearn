package com.enjoy.cap10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.aop.LogAspect;

@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
	
	@Bean
	public Calculator calculator() {
		return new Calculator(); 
	}
//	
	@Bean
	public LogAspect logaspect() {
		return new LogAspect(); 
	}
//	


}
