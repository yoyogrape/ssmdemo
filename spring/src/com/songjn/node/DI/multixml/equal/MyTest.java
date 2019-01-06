package com.songjn.node.DI.multixml.equal;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע��
 * ��������ļ���xml����ƽ�ȹ�ϵʾ��
 */
public class MyTest {
	@Test
	public void test() {
		
		//spring-*:ͨ���
		String myResource = "com/songjn/node/DI/multixml/equal/spring-*.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student1=(Student) ac.getBean("myStudent");
		System.out.println(student1);
		Teacher teacher=(Teacher) ac.getBean("myTeacher");
		System.out.println(teacher);
	}
}
