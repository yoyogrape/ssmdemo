package com.songjn.node.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop顾问
 * 
 * 顾问的匹配两种方式：
 * 1、名字匹配 ，
 * 注意：顾问在配置方法匹配的时候可以使用通配符的方式进行匹配（看配置文件）
 * 2、正则匹配
 * .*:多个任意字符
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
