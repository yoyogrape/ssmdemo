package com.songjn.node.DI.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * setterע���ʵ��
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/setter/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
	}
}
