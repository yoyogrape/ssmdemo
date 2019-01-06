package com.songjn.node.DI.abstractbean.different;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * ���������ע���ʵ��
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/abstractbean/different/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student1=(Student) ac.getBean("myStudent");
		System.out.println(student1);
		Teacher teacher=(Teacher) ac.getBean("myTeacher");
		System.out.println(teacher);
	}
}
