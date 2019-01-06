package com.songjn.node.beanafterprocessor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test01() {
		// 创建容器对象
		String myResource = "com/songjn/node/beanafterprocessor/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		System.out.println(service.doSome());
		System.out.println(service.doOther());
		ISomeService service2 = (ISomeService) ac.getBean("myService2");
		System.out.println(service2.doSome());
		System.out.println(service2.doOther());
	}

}
