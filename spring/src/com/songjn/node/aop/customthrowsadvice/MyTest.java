package com.songjn.node.aop.customthrowsadvice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop�Զ����쳣֪ͨ
 */
public class MyTest {
	@Test
	public void test() {
		String resource = "com/songjn/node/aop/customthrowsadvice/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		ISomeService service = (ISomeService) ac.getBean("serviceProxy");
		try {
			service.login("haha", "1231");
		} catch (UserException e) {
			// ����try�����쳣�����÷�����֪�������쳣
			e.printStackTrace();
		}
	}

}
