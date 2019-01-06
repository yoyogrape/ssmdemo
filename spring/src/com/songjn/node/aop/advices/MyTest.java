package com.songjn.node.aop.advices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop多个通知配置
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/advices/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
	}

}
