package com.enjoy.cap2;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.cap5.Cap5MainConfig;
import com.enjoy.cap7.config.Cap7MainConfigOfLifeCycle;

public class Cap7Test {

	@Test
	public void test() {
		ApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
//		String[] beans = app.getBeanDefinitionNames();
//		List<String> beanList = Arrays.asList(beans);
//		beanList.forEach(n -> System.out.println());
		System.out.println("容器创建完成");

	}

}
