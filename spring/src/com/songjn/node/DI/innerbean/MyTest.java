package com.songjn.node.DI.innerbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * 内部bean注入的实现
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/innerbean/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
		//不想让其他人调到school对象
		School school=(School) ac.getBean("mySchool");
		System.out.println(school);
	}
}
