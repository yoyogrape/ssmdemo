package com.songjn.node.aop.advisorautoproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop
 * 
 * 1��Ĭ���Զ�������ǿ����DefaultAdvisorAutoProxyCreator����
 * ������⣺���ж��bean��ʱ�򣬲���Ҫ���ö������
 * ����ȱ�ݣ�
 * 1������ѡ�� Ŀ�����
 * 2������ѡ���������ͣ�����ֻ����Advisor
 * 3������ѡ��Advisor������advisor��������Ϊ����֯��Ŀ�����
 * 
 * 2�������Զ�����
 * 
 * 
 * 
 */
public class MyTest {

	public static void main(String[] args) {
		//String resource ="com/songjn/node/aop/AdvisorAutoProxy/applicationContext_DefaultAdvisorAutoProxyCreator.xml";
		String resource ="com/songjn/node/aop/advisorautoproxy/applicationContext_BeanNameAutoProxyCreator.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
		System.out.println("=================");
		service.doThird();
		System.out.println("--------------------------------------");
		ISomeService service2 = (ISomeService) ac.getBean("myService2");
		service2.doFirst();
		System.out.println("=================");
		service2.doSecond();
		System.out.println("=================");
		service2.doThird();
	}

}
