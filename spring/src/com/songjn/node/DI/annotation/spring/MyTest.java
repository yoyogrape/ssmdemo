package com.songjn.node.DI.annotation.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * 利用注解进行值的注入
 * 
 * 知识点：与@Component注解功能相同，但意义不同的注解有三个
 * ① @Repository：注解在Dao实现类上
 * ② @Service：注解在Service实现类上
 * ③ @Controller：注解在SpringMVC处理器上
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/annotation/spring/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
