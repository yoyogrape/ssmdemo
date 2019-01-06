package com.songjn.node.DI.annotation.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * ����ע�����ֵ��ע��
 * 
 * ֪ʶ�㣺��@Componentע�⹦����ͬ�������岻ͬ��ע��������
 * �� @Repository��ע����Daoʵ������
 * �� @Service��ע����Serviceʵ������
 * �� @Controller��ע����SpringMVC��������
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
