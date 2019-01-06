package com.songjn.node.aop.throwsadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop异常通知ThrowsAdvice 
 * 当目标方法抛出与指定类型的异常具有is-a关系的异常时执行
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
