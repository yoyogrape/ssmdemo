package com.songjn.node.DI.innerbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * �ڲ�beanע���ʵ��
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/innerbean/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student=(Student) ac.getBean("myStudent");
		System.out.println(student);
		//�����������˵���school����
		School school=(School) ac.getBean("mySchool");
		System.out.println(school);
	}
}
