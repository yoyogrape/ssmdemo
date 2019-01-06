package com.songjn.node.aop.throwsadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop�쳣֪ͨThrowsAdvice 
 * ��Ŀ�귽���׳���ָ�����͵��쳣����is-a��ϵ���쳣ʱִ��
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/throwsadvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
	}

}
