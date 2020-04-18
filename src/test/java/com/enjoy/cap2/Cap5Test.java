package com.enjoy.cap2;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.cap5.Cap5MainConfig;

public class Cap5Test {

	@Test
	public void scanTest() {
		ApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
		String[] beans = app.getBeanDefinitionNames();
		List<String> beanList = Arrays.asList(beans);
		beanList.forEach(n -> System.out.println());

	}

}
