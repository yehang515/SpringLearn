package com.enjoy.cap2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap10.aop.Calculator;
import com.enjoy.cap10.config.Cap10MainConfig;

public class Cap10Test {

	@Test
	public void test() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
		Calculator calculator = (Calculator) app.getBean("calculator");
		calculator.div(4, 3);
	}
}
