package com.songjn.node.base;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * ����ע���ʵ��
 */
public class MyTest {
	@Test
	public void test06() {
		String myResource = "com/songjn/node/base/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
	}

//	public void test02() {
//		// ������������
//		// ClassPathXmlApplicationContext�ڵ�ǰ·������·����applicationContext.xml�ļ�
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"applicationContext.xml");
//		ISomeService service = (ISomeService) ac.getBean("myService");
//		service.doSome();
//	}
//
//	public void test04() {
//		// ������������
//		// FileSystemXmlApplicationContext�ھ���·���в��������ļ���
//		ApplicationContext ac = new FileSystemXmlApplicationContext(
//				"D:/applicationContext.xml");
//		ISomeService service = (ISomeService) ac.getBean("myService");
//		service.doSome();
//	}
//
//	public void test05() {
//		// ������������
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(
//				"applicationContext.xml"));
//		ISomeService service = (ISomeService) bf.getBean("myService");
//		service.doSome();
//	}

}
