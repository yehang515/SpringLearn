package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
//BeanPostProcessor  bean的增强器，
public class Bike implements BeanPostProcessor {

	public Bike() {
		// TODO Auto-generated constructor stub
		System.out.println("Bike constructor.....");
	}
	
	public void init() {
		System.out.println("Bike init().....");
	}
	
	public void destory() {
		System.out.println("Bike destory().....");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//在init()之前拦截
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//在init()之后拦截
		return bean;
	}

}
