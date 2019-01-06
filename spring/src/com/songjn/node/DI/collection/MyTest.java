package com.songjn.node.DI.collection;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 依赖注入
 * constructor的实现
 */
public class MyTest {
	@Test
	public void test() {
		//String myResource = "com/songjn/node/DI/collection/applicationContext.xml";
		//简写
		String myResource = "com/songjn/node/DI/collection/applicationContext_jianxie.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Some some=(Some) ac.getBean("mySome");
		System.out.println(some);
	}
}
