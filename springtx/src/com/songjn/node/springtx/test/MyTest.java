package com.songjn.node.springtx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.songjn.node.springtx.service.IBuyStockService;

/**
 * spring事务的实现
 */
public class MyTest {
	private IBuyStockService service;

	@Before
	public void before() {
		String myResource = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		service = (IBuyStockService) ac.getBean("myService");
	}
	
	@Test
	public void test() {
		service.openAccount("老赵", 100);
		service.openStock("vlink", 20);
	}
	
	@Test
	public void buyStock() {
		try {
			service.buyStock("老赵", 10, "vlink", 5);
		} catch (Exception e) {
			//当发生异常的时候事务执行失败。前没有少。 
			System.out.println("发生异常，转钱失败。");
			e.printStackTrace();
		}
	}
	
}
