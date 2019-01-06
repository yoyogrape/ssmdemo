package com.songjn.node.aop.afterreturningadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop后置通知AfterReturningAdvice 
 * 在执行目标方法之后执行
 * 
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/afterreturningadvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		service.doSecond();
	}

}
