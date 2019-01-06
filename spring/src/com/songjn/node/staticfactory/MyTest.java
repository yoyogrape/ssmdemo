package com.songjn.node.staticfactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ��̬����beanע��
 */
public class MyTest {
	@Test
	public void test06() {
		String myResource = "com/songjn/node/staticfactory/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
	}
}
