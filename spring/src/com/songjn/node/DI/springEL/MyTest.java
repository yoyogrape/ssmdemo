package com.songjn.node.DI.springEL;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 依赖注入
 * setter注入的实现
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/springEL/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Person person=(Person) ac.getBean("myPerson");
		System.out.println(person);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
