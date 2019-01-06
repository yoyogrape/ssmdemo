package com.songjn.node.DI.annotation.JSR250;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * 利用JSR-250配置元数据
 * 
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/annotation/JSR250/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
