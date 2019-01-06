package com.songjn.node.DI.autowire.scopeattr;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 依赖注入的实现
 * 域属性自动注入
 */
public class MyTest {
	@Test
	public void test() {
		//String myResource = "com/songjn/node/DI/autowire/scopeattr/applicationContext_byName.xml";
		String myResource = "com/songjn/node/DI/autowire/scopeattr/applicationContext_byType.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
