package com.enjoy.cap2;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enjoy.cap2.config.Cap2MainConfig; 

public class Cap2Test {
	
	@Test
	public void scanTest() {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap2MainConfig.class);
		String[] beans = app.getBeanDefinitionNames();
		List<String> beanList  = Arrays.asList(beans);
		beanList.forEach(n -> System.out.println(n));
		
		
	}

}
