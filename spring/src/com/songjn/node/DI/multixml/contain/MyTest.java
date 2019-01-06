package com.songjn.node.DI.multixml.contain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * ��������ļ���xml����������ϵ
 * ע�⣺·������.�����ɡ�/��
 */
public class MyTest {
	@Test
	public void test() {
		//spring-base.xml������ܵ������ļ����������ܺ��ӵ�һ����ʽ��spring-*��ʱ��Ὣ�Լ�������ȥ
		//spring-*:ͨ���
		String myResource = "com/songjn/node/DI/multixml/contain/applicationContext.xml";
		//String myResource = "com/songjn/node/DI/multixml/contain/spring-base.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student1=(Student) ac.getBean("myStudent");
		System.out.println(student1);
		Teacher teacher=(Teacher) ac.getBean("myTeacher");
		System.out.println(teacher);
	}
}
