package com.songjn.node.DI.abstractbean.same;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * 同类抽象类注入的实现
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/abstractbean/same/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student1=(Student) ac.getBean("myStudent1");
		System.out.println(student1);
		Student student2=(Student) ac.getBean("myStudent2");
		System.out.println(student2);
		Student student3=(Student) ac.getBean("myStudent3");
		System.out.println(student3);
	}
}
