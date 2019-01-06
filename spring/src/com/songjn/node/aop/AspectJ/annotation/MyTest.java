package com.songjn.node.aop.AspectJ.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AspectJ对aop的实现
 * 注解方式
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/AspectJ/annotation/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
		System.out.println("=================");
		System.out.println(service.doThird());
	}

}
