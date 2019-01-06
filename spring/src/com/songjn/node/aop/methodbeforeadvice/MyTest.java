package com.songjn.node.aop.methodbeforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop前置通知MethodBeforeAdvice 在执行目标方法之前执行
 * 
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/methodbeforeadvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
	}

}
