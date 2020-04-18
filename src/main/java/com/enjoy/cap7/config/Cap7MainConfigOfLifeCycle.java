package com.enjoy.cap7.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.enjoy.cap7.bean.Bike;

@Configurable
public class Cap7MainConfigOfLifeCycle {

	public Cap7MainConfigOfLifeCycle() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean(initMethod = "init", destroyMethod = "destory")
	public Bike bike() {
		return new Bike();
	}

}
