package com.songjn.node.DI.annotation.javaconfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * java类充当容器配置数据源
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/annotation/javaconfig/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
