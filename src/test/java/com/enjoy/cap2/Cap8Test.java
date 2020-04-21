package com.enjoy.cap2;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.enjoy.cap5.Cap5MainConfig;
import com.enjoy.cap7.config.Cap7MainConfigOfLifeCycle;
import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;

public class Cap8Test {

	@Test
	public void test() {
		ApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
		String[] beans = app.getBeanDefinitionNames();
		List<String> beanList = Arrays.asList(beans);
		beanList.forEach(n -> System.out.println(n));
		Bird bird = (Bird)app.getBean("bird", Bird.class);
		System.out.println(bird);
		System.out.println("容器创建完成");

	}

}
