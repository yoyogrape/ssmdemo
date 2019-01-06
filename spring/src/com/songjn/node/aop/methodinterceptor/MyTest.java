package com.songjn.node.aop.methodinterceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop环绕通知MethodInterceptor 
 * 目标方法执行之前和之后都执行
 * 
 */
public class MyTest {

	public static void main(String[] args) {
		String resource = "com/songjn/node/aop/methodinterceptor/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		service.doFirst();
		System.out.println("=================");
		String result=service.doSecond();
		System.out.println(result);
	}

}
