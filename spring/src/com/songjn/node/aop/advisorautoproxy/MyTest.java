package com.songjn.node.aop.advisorautoproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop
 * 
 * 1、默认自动代理增强器（DefaultAdvisorAutoProxyCreator）：
 * 解决问题：当有多个bean的时候，不需要配置多个代理。
 * 存在缺陷：
 * 1）不能选择 目标对象
 * 2）不能选择切面类型，切面只能是Advisor
 * 3）不能选择Advisor，所有advisor都将被作为切面织入目标对象。
 * 
 * 2、名字自动代理
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
