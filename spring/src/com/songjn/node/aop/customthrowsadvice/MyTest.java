package com.songjn.node.aop.customthrowsadvice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aop自定义异常通知
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
			// 利用try捕获异常，调用方法不知道发生异常
			e.printStackTrace();
		}
	}

}
