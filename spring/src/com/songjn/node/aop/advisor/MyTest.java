package com.songjn.node.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop����
 * 
 * ���ʵ�ƥ�����ַ�ʽ��
 * 1������ƥ�� ��
 * ע�⣺���������÷���ƥ���ʱ�����ʹ��ͨ����ķ�ʽ����ƥ�䣨�������ļ���
 * 2������ƥ��
 * .*:��������ַ�
 *
 */
public class MyTest {

	public static void main(String[] args) {
		// String resource ="com/songjn/node/aop/Advisor/applicationContext_NameMatchMethodPointcutAdvisor.xml";
		String resource = "com/songjn/node/aop/advisor/applicationContext_RegexpMethodPointcutAdvisor.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
		System.out.println("=================");
		service.doThird();
	}

}
