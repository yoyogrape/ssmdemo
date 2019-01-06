package com.songjn.node.DI.annotation.lifestartend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * bean ������ʼĩ
 * ��������������doEnd����ִ����Ҫ����������
 * 1��bean�ǵ���
 * 2����Ҫ�ֶ��ر�����
 */
public class MyTest {
	@Test
	public void test() {
		String myResource = "com/songjn/node/DI/annotation/lifestartend/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
		//�ֶ��ر����������ܵ���doEnd������
		((ClassPathXmlApplicationContext)ac).close();
	}
}
