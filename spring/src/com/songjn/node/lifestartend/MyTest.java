package com.songjn.node.lifestartend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * bean 的生命始末
 * 生命结束方法（doEnd）的执行需要两个条件：
 * 1、bean是单例
 * 2、需要手动关闭容器
 */
public class MyTest {
	@Test
	public void test06() {
		String myResource = "com/songjn/node/lifestartend/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
		//手动关闭容器，才能调用doEnd方法。
		((ClassPathXmlApplicationContext)ac).close();
	}
}
